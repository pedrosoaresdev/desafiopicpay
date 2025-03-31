package  pasta.pedrosoaresdev.picpay.controller;

import feign.Response;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import  pasta.pedrosoaresdev.picpay.controller.dto.TransferDto;
import  pasta.pedrosoaresdev.picpay.entity.Transfer;
import  pasta.pedrosoaresdev.picpay.service.TransferService;

@RestController
public class TransferController {

    private final TransferService transferService;

    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping("/transfer")
    public ResponseEntity<Transfer> transfer(@RequestBody @Valid TransferDto dto) {

        var resp = transferService.transfer(dto);

        return ResponseEntity.ok(resp);
    }
}

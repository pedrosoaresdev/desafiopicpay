package  pasta.pedrosoaresdev.picpay.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import  pasta.pedrosoaresdev.picpay.controller.dto.CreateWalletDto;
import pasta.pedrosoaresdev.picpay.entity.Wallet;
import pasta.pedrosoaresdev.picpay.service.WalletService;

@RestController
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping("/wallets")
    public ResponseEntity<Wallet> createWallet(@RequestBody @Valid CreateWalletDto dto) {

        var wallet = walletService.createWallet(dto);

        return ResponseEntity.ok(wallet);
    }
}

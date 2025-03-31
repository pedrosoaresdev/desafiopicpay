package pasta.pedrosoaresdev.picpay.service;

import org.springframework.stereotype.Service;
import pasta.pedrosoaresdev.picpay.controller.dto.CreateWalletDto;
import pasta.pedrosoaresdev.picpay.entity.Wallet;
import pasta.pedrosoaresdev.picpay.exception.WalletDataAlreadyExistsException;
import pasta.pedrosoaresdev.picpay.repository.WalletRepository;

@Service
public class WalletService {

    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public Wallet createWallet(CreateWalletDto dto) {

        var walletDb = walletRepository.findByCpfCnpjOrEmail(dto.cpfCnpj(), dto.email());
        if (walletDb.isPresent()) {
            throw new WalletDataAlreadyExistsException("CpfCnpj or Email already exists");
        }

        return walletRepository.save(dto.toWallet());
    }
}

package pasta.pedrosoaresdev.picpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pasta.pedrosoaresdev.picpay.entity.WalletType;

public interface WalletTypeRepository extends JpaRepository<WalletType, Long> {
}

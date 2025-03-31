package pasta.pedrosoaresdev.picpay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pasta.pedrosoaresdev.picpay.entity.Transfer;

import java.util.UUID;

public interface TransferRepository extends JpaRepository<Transfer, UUID> {
}
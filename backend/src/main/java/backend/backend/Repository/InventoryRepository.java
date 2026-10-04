package backend.backend.Repository;

import backend.backend.Model.InventoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.security.auth.callback.LanguageCallback;

public interface InventoryRepository extends JpaRepository <InventoryModel, Long> {
}

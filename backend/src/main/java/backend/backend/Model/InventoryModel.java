package backend.backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class InventoryModel {
    @Id
    @GeneratedValue
    private Long id;
    private String itemImage;
    private String itemName;
    private String itemCategory;
    private String itemDetail;

}

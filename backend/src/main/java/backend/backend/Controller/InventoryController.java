package backend.backend.Controller;

import backend.backend.Model.InventoryModel;
import backend.backend.Repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.zip.ZipInputStream;

@RestController
@CrossOrigin("http://Localhost:3000")
public class InventoryController {
    @Autowired
    private InventoryRepository inventoryRepository;

    @PostMapping("/inventory")
    public InventoryModel newInventoryModel(@RequestBody InventoryModel newInventoryModel) {
        return inventoryRepository.save(newInventoryModel);

    }

    @PostMapping("/inventory/itemImg")
    public String itemImage(@RequestParam ("file")MultipartFile file) {
        String folder ="";
        String itemImage = file.getOriginalFilename();
        try {
            File uploadDir = new File(folder);
            if (!uploadDir.exists()){
                uploadDir.mkdir();
            }
            file.transferTo(Paths.get(folder+itemImage));
        }catch (IOException e){
            e.printStackTrace();
            return "error;"+itemImage;
        }
        return itemImage;
    }
}


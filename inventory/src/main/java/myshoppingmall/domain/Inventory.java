package myshoppingmall.domain;

import myshoppingmall.domain.StockChanged;
import myshoppingmall.InventoryApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Inventory_table")
@Data

public class Inventory  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long itemId;
    
    
    
    
    
    private Long stock;
    
    
    
    
    
    private String itemName;
    
    
    
    
    
    private String itemImage;

    @PostPersist
    public void onPostPersist(){


        StockChanged stockChanged = new StockChanged(this);
        stockChanged.publishAfterCommit();

    }

    public static InventoryRepository repository(){
        InventoryRepository inventoryRepository = InventoryApplication.applicationContext.getBean(InventoryRepository.class);
        return inventoryRepository;
    }




    public static void changeStock(DeliveryComplated deliveryComplated){

        /** Example 1:  new item 
        Inventory inventory = new Inventory();
        repository().save(inventory);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryComplated.get???()).ifPresent(inventory->{
            
            inventory // do something
            repository().save(inventory);


         });
        */

        
    }
    public static void changeStock(DerliveryReturned derliveryReturned){

        /** Example 1:  new item 
        Inventory inventory = new Inventory();
        repository().save(inventory);

        */

        /** Example 2:  finding and process
        
        repository().findById(derliveryReturned.get???()).ifPresent(inventory->{
            
            inventory // do something
            repository().save(inventory);


         });
        */

        
    }


}

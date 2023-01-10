package myshoppingmall.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import myshoppingmall.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import myshoppingmall.domain.*;

@Service
@Transactional
public class PolicyHandler{
    @Autowired InventoryRepository inventoryRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryComplated'")
    public void wheneverDeliveryComplated_ChangeStock(@Payload DeliveryComplated deliveryComplated){

        DeliveryComplated event = deliveryComplated;
        System.out.println("\n\n##### listener ChangeStock : " + deliveryComplated + "\n\n");


        

        // Sample Logic //
        Inventory.changeStock(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DerliveryReturned'")
    public void wheneverDerliveryReturned_ChangeStock(@Payload DerliveryReturned derliveryReturned){

        DerliveryReturned event = derliveryReturned;
        System.out.println("\n\n##### listener ChangeStock : " + derliveryReturned + "\n\n");


        

        // Sample Logic //
        Inventory.changeStock(event);
        

        

    }

}



package myshoppingmall.domain;

import myshoppingmall.domain.*;
import myshoppingmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Integer itemId;
    private Long qty;
    private String address;
    private String telNo;

    public DeliveryStarted(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryStarted(){
        super();
    }
}

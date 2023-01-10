package myshoppingmall.domain;

import myshoppingmall.domain.*;
import myshoppingmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryCanceled extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Integer itemId;
    private Long qty;
    private String address;
    private String telNo;

    public DeliveryCanceled(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryCanceled(){
        super();
    }
}

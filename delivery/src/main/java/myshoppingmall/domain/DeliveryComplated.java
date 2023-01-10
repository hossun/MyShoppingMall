package myshoppingmall.domain;

import myshoppingmall.domain.*;
import myshoppingmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryComplated extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Integer itemId;
    private Long qty;

    public DeliveryComplated(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryComplated(){
        super();
    }
}

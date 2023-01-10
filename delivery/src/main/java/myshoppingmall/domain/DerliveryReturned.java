package myshoppingmall.domain;

import myshoppingmall.domain.*;
import myshoppingmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DerliveryReturned extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Integer itemId;
    private Long qty;

    public DerliveryReturned(Delivery aggregate){
        super(aggregate);
    }
    public DerliveryReturned(){
        super();
    }
}

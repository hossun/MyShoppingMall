package myshoppingmall.domain;

import myshoppingmall.domain.*;
import myshoppingmall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class DeliveryComplated extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Integer itemId;
    private Long qty;
}



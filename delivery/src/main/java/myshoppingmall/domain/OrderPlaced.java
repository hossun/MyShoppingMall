package myshoppingmall.domain;

import myshoppingmall.domain.*;
import myshoppingmall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long orderId;
    private Long customerId;
    private Long itemId;
    private Integer qty;
    private String address;
    private String telNo;
}



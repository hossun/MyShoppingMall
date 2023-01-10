package myshoppingmall.domain;

import myshoppingmall.domain.*;
import myshoppingmall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class StockChanged extends AbstractEvent {

    private Long id;

    public StockChanged(Inventory aggregate){
        super(aggregate);
    }
    public StockChanged(){
        super();
    }
}

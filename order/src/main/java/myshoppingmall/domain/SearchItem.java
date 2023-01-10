package myshoppingmall.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name="SearchItem_table")
@Data
public class SearchItem {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}

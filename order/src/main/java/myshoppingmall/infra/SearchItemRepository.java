package myshoppingmall.infra;

import myshoppingmall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="searchItems", path="searchItems")
public interface SearchItemRepository extends PagingAndSortingRepository<SearchItem, Long> {

    

    
}

package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Order;

/*
 the parameters to crud repository are the entity type the repository is to persist (Order), and the Id type for that
 entity (Long)
*/
public interface OrderRepository extends CrudRepository<Order, Long> {


}

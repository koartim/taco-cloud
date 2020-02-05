package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Taco;
/*
 the parameters to crud repository are the entity type the repository is to persist (Taco), and the Id type for that
 entity (Long)
*/
public interface TacoRepository extends CrudRepository<Taco, Long> {

}

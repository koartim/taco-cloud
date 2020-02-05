package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.Ingredient;
/*
 the parameters to crud repository are the entity type the repository is to persist (Ingredient), and the Id type for that
 entity (String)
*/
public interface IngredientRepository extends CrudRepository<Ingredient, String> {



}

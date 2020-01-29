package tacos;

import lombok.Data;
/* getters and setters as well as equals, toString, and hashCode are provided by @Data at runtime */
/* @Data also provides a constructor at runtime */
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}

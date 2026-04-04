<<<<<<< HEAD
class Laptop extends Hardware {

    public Laptop(Builder builder) {
        super(builder);
=======
public class Laptop extends Hardware {

    public Laptop(int id, String brand, String model, int spec) {
        super(id, brand, model, spec, "Laptop");
>>>>>>> origin/core-classes
    }

    @Override
    public String interpretSpec() {
        return getSpec() + "GB RAM";
    }
}
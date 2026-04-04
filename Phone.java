<<<<<<< HEAD
class Phone extends Hardware {

    public Phone(Builder builder) {
        super(builder);
=======
public class Phone extends Hardware {

    public Phone(int id, String brand, String model, int spec) {
        super(id, brand, model, spec, "Phone");
>>>>>>> origin/core-classes
    }

    @Override
    public String interpretSpec() {
        return getSpec() + " Megapixels";
    }
}
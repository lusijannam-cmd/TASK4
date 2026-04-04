<<<<<<< HEAD
class Hardware {
    private int id;
    private String brand;
    private int spec;
    private String type;

    protected Hardware(Builder builder) {
        this.id = builder.id;
        this.brand = builder.brand;
        this.spec = builder.spec;
        this.type = builder.type;
    }

    public int getId() { return id; }
    public String getBrand() { return brand; }
    public int getSpec() { return spec; }
    public String getType() { return type; }

    public String interpretSpec() {
        return spec + " units";
    }

    public static class Builder {
        private int id;
        private String brand;
        private int spec;
        private String type;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setSpec(int spec) {
            this.spec = spec;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Hardware build() {
            return new Hardware(this);
        }
    }
=======
public class Hardware {
    private int id;
    private String brand;
    private String model;
    private int spec;
    private String type;

    public Hardware(int id, String brand, String model, int spec, String type) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.spec = spec;
        this.type = type;
    }

    // Getters (encapsulation)
    public int getId() { return id; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getSpec() { return spec; }
    public String getType() { return type; }

    // Method to be overridden
    public String interpretSpec() {
        return spec + " units";
    }
>>>>>>> origin/core-classes
}
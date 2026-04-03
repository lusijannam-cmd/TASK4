import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        HardwareRepository repo = new HardwareRepository();
        ArrayList<Hardware> list = repo.getAllHardware();

        int laptop16 = 0;
        int laptop32 = 0;
        int phone50 = 0;

        System.out.println("=== Hardware Masterlist ===");

        for (Hardware h : list) {

            System.out.println(
                h.getBrand() + " " +
                h.getModel() + " (" +
                h.getType() + ") - " +
                h.interpretSpec()
            );

            if (h instanceof Laptop) {
                if (h.getSpec() == 16) laptop16++;
                if (h.getSpec() == 32) laptop32++;
            }

            if (h instanceof Phone) {
                if (h.getSpec() == 50) phone50++;
            }
        }

        System.out.println("\n=== Inventory Summary ===");
        System.out.println("16GB Laptops: " + laptop16);
        System.out.println("32GB Laptops: " + laptop32);
        System.out.println("50MP Phones: " + phone50);
    }
}
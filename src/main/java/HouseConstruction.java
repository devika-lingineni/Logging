import java.util.Scanner;
import java.util.logging.Logger;

public class HouseConstruction {
    Scanner sc;
    Logger log=Logger.getLogger(HouseConstruction.class.getName());

    public HouseConstruction()
    {
        this.sc = new Scanner(System.in);
    }

    double cost_estimate() {
        log.info("Enter the material type:\n");
        log.info("Standard Material: 1\n");
        log.info("Above Standard Material: 2\n");
        log.info("High Standard Material: 3\n");
        double material_cost = 0.0D;
        int material = this.sc.nextInt();
        log.info("Enter the area:\n");
        double area = this.sc.nextDouble();
        log.info("enter the fully attributed or not\n");
        log.info("1.Yes\n");
        log.info("2.No\n");
        int fully = this.sc.nextInt();
        if (fully == 2) {
            if (material == 1) {
                material_cost = 1200.0D * area;
            } else if (material == 2) {
                material_cost = 1500.0D * area;
            } else {
                material_cost = 1800.0D * area;
            }
        } else if (material == 3) {
            material_cost = 2500.0D * area;
        }

        return material_cost;
    }
}
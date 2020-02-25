import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Logger log= Logger.getLogger(Main.class.getName());
            log.info("Enter the principle amount:");
            double principle = sc.nextDouble();
            log.info("Enter the rate of interest:");
            double rate = sc.nextDouble();
            log.info("Enter the time:");
            double time = sc.nextDouble();
            SimpleInterest s = new SimpleInterest(principle, rate, time);
            log.info("The simple interest is:" + s.interest_cal());
            log.info("\n *************************************** \n");
            CompoundInterest c = new CompoundInterest(principle, rate, time);
            log.info("the Compound interest is:" + c.interest_comcal());
            log.info("\n **************************************** \n");
            HouseConstruction hc = new HouseConstruction();
            double res = hc.cost_estimate();
            log.info("The overall material cost is:\n" + res);
        }
    }



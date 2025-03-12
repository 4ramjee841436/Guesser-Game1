import java.util.Scanner;
abstract class Bank {
    abstract double getROI(double p, double t);
}
class SBi extends Bank {

    double getROI(double p, double t) {

        return (6.5 * p * t )/ 100;
    }
}
class PNB extends Bank {

    double getROI(double p, double t) {

        return( 7.3 * p * t) / 100;
    }
}

class IDBI extends Bank {

    double getROI(double p, double t) {

        return( 6.39 * p * t) / 100;
    }
}

public class bankSI_abstract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p and t");
        double p = sc.nextDouble();
        double t = sc.nextDouble();

        Bank B;
        B = new SBi();
        System.out.println("SBI ROI: " + B.getROI(p, t));

        B = new IDBI();
        System.out.println("IDBI ROI: " + B.getROI(p, t));

        B = new PNB();
        System.out.println("PNB ROI: " + B.getROI(p, t));
    }
}


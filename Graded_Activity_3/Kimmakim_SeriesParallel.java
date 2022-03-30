/**
 * @(#)Kimmakim_SeriesParallel.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Graded_Activity_3;
import java.util.Scanner;
public class Kimmakim_SeriesParallel {
    public static void main(String[] args) {
        Scanner serpar=new Scanner(System.in);

        System.out.println("Resistor Computation");
        System.out.print("Enter resistor1: ");
        double resistor1=serpar.nextDouble();
        System.out.print("Enter resistor2: ");
        double resistor2=serpar.nextDouble();
        System.out.print("Enter resistor3: ");
        double resistor3=serpar.nextDouble();
        System.out.print("Enter resistor4: ");
        double resistor4=serpar.nextDouble();

        double series=resistor1+resistor2+resistor3+resistor4;
        double parallel=1/((1/resistor1)+(1/resistor2)+(1/resistor3)+(1/resistor4));

        System.out.println("Total Resistance");
        System.out.println("Series Connection: "+Math.round(series*100.0)/100.0);
        System.out.println("Parallel Connection: "+Math.round(parallel*1000000000.0)/1000000000.0);
    }
}

/**
 * @(#)PowerLossProblem_Kimmakim.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_6_Practice;
import java.util.Scanner;
public class PowerLossProblem_Kimmakim {
    public static void main(String[] args) {
        Scanner power=new Scanner(System.in);

        System.out.print("Enter the current flowing through the cable: ");
        double I_AMP=power.nextDouble();
        System.out.print("Enter the resistance flowing through the cable: ");
        double R_OHM=power.nextDouble();
        
        double P_WATT=R_OHM*Math.pow(I_AMP,2);

        System.out.println("The power loss is "+P_WATT);
    }
}

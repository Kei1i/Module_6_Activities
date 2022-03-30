/**
 * @(#)AngleToRadianProblem_Kimmakim.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_6_Practice;
import java.util.Scanner;
public class AngleToRadianProblem_Kimmakim {
    public static void main(String[] args) {
        Scanner angle=new Scanner(System.in);

        System.out.print("Enter an angle expressed in degrees: ");
        double deg=angle.nextDouble();
        System.out.print("Enter an angle expressed in minutes: ");
        double min=angle.nextDouble();
        System.out.print("Enter an angle expressed in seconds: ");
        double sec=angle.nextDouble();
        
        double rad=Math.PI*((deg+(min/60)+(sec/3600))/180);

        System.out.print("The equivalent angle in radians is "+rad);
    }
}

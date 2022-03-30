/**
 * @(#)TemperatureProblem.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_6_Practice;
import java.util.Scanner;
public class TemperatureProblem_Kimmakim {
    public static void main(String[] args) {
        Scanner temp=new Scanner(System.in);
    
        System.out.print("Enter atemperature in degrees Farenheit: ");
        double f=temp.nextDouble();

        double difference=f-32;
        double product=difference*5;
        double quotient=product/9;

        System.out.print("The equivalent temperature in Celcius is "+quotient);
    
    }
}

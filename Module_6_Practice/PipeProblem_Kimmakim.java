/**
 * @(#)PipeProblem_Kimmakim.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_6_Practice;
import java.util.Scanner;
public class PipeProblem_Kimmakim {
    public static void main(String[] args) {
        Scanner pipe=new Scanner(System.in);

        System.out.print("Enter outside diameter: ");
        double outDia=pipe.nextDouble();
        System.out.print("Enter outside diameter: ");
        double inDia=pipe.nextDouble();

        double difference=outDia-inDia;
        double quotient=difference/2;

        System.out.print("The thickness of the wall of the pipe is "+quotient);

    }
    
}

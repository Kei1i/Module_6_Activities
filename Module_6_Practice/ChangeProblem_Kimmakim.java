/**
 * @(#)ChangeProblem_Kimmakim.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_6_Practice;
import java.util.Scanner;
public class ChangeProblem_Kimmakim {
    public static void main(String[] args) {
        Scanner change=new Scanner(System.in);

        System.out.print("Enter the amount of purchase which is less than 100: ");
        int x=change.nextInt();
        int y=(100-x);
        System.out.println("Your change is "+(y));
        System.out.println("Breakdown of Change");
        System.out.println("\tP50:"+"\t"+(y/50));
        System.out.println("\tP20:"+"\t"+((y%50)/20));
        System.out.println("\tP10:"+"\t"+(((y%50)%20)/10));
        System.out.println("\tP5:"+"\t"+((((y%50)%20)%10)/5));
        System.out.println("\tP5:"+"\t"+((((y%50)%20)%10)%5));
    }
}

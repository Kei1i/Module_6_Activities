/**
 * @(#)TriangleProblem.java
 * Kimmakim, Keisha L.
 * BSEE 1
 * Monday Wednesday (10:30 am - 1:30 pm)
 * @version "17.0.2" 2022-01-18
 */
package Module_6_Practice;
import java.util.Scanner;
public class TriangleProblem_Kimmakim {
    public static void main(String[] args) {
        Scanner triangle=new Scanner(System.in);

        System.out.println("Enter the three sides of a triangle:");
        System.out.print("Enter side a\t");
        double a=triangle.nextDouble();
        System.out.print("Enter side b\t");
        double b=triangle.nextDouble();
        System.out.print("Enter side c\t");
        double c=triangle.nextDouble();

        double s=(a+b+c)/2;
        double A=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        double r_insc=(A/s);
        double r_circ=(a*b*c)/(4*A);

        System.out.println("The area of the triangle is "+A);
        System.out.println("The area of the largest inscribed circle is "+r_insc);
        System.out.println("The area of the smallest circumscribed circle is "+r_circ);

    }
}

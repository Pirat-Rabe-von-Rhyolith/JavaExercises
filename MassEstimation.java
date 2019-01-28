
package massestimation;

import java.util.Scanner;

public class MassEstimation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bitte den Radius für den Humerus in mm eingeben:");
        double rh= sc.nextDouble();
        System.out.println("Bitte den Radius für das Femur in mm eingeben:");
        double rf=sc.nextDouble();
        
        double uhum=2*rh*Math.PI; 
        double ufem=2*rf*Math.PI;
        double c=uhum+ufem; 
        
        double w=0.078*Math.pow(c, 2.73);
        double x=w/1000;
        x=Math.round(100.0 * x) / 100.0;
        System.out.println("Das Gewicht beträgt "+x+" kg.");
    }
    
}

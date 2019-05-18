

package fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Eine Anwendung aus einer Klasse zur Berechnung der Fibonacci-Folge.
 * @author Edelweisspirat
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        eingeben();
    }
    
    /**
     * Regelt die Eingabe eines Wertes und die Ausgabe im Fall
     * fehlerhafter Werte. 
     * Bei Werten von 1 und 2 wird eine eigene Ausgabe generiert.
     * Bei höheren Werten werden diese an die Methode fibonacci übergeben.
     * 
     * @exception InputMismatchException wird gefangen und mit einer Ausgabe
     * behandelt. 
     */
    public static void eingeben(){
        Scanner input= new Scanner(System.in);
        System.out.println("Geben Sie bitte ein, wieviele Fibonacci-Zahlen (inklusive führende Null) Sie ausgegeben haben wollen:");
        try{ int n=input.nextInt();
        if(n<=0){
            System.out.println("Sie müssen eine Zahl größer als Null angeben!");
            System.out.println("Bitte versuchen Sie es erneut:");
            eingeben();
        }else if(n==1){
            System.out.println("Die erste Fibonacci-Zahl ist immer: 0");
        }else if(n==2){
            System.out.println("Die ersten beiden Fibonacci-Zahlen sind immer: 0 1");
        }else{
        System.out.println("Die Fibonacci-Folge ist:");
        fibonacci(n); 
        System.out.println();
        }
        }catch(InputMismatchException e){
            System.out.println("Es muss sich um ganze Zahlen handeln."); 
            System.out.println("Bitte versuchen Sie es erneut:");
            eingeben();
        }
    }
    /**
     * Übernimmt die Berechnung der Fibonacci-Folge bis zum eingegebenen
     * Wert n. 
     * @param n 
     */
    public static void fibonacci(int n){
       int i=0;
       int x=0;
       int y=1;
       int z;

       System.out.print(x+" "+y+" ");
       
       do{
       i++;
       z=x+y;
       System.out.print(z+" ");
       x=y;
       y=z;
       }while(i<=(n-3)); 
    }
}
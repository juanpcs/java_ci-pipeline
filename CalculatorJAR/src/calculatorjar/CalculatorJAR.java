/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorjar;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author leona
 */
public class CalculatorJAR {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese el numero de la operacion:");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Division");
        System.out.println("4.Multiplicacion");
        System.out.println("5.Raiz");
        
        Scanner tres = new Scanner (System.in);
        int z=tres.nextInt();
        
        System.out.println("ingrese primer valor");
        Scanner uno = new Scanner (System.in);
        double x=uno.nextDouble();
        System.out.println("ingrese segundo valor");
        Scanner dos = new Scanner (System.in);
        double y=dos.nextDouble();
        
        switch(z){
            case 1:
                suma(x,y);
                break;
            case 2:
                resta(x,y);
                break;
            case 3:
                division(x,y);
                break;
            case 4:
                multiplicacion(x,y);
                break;
            case 5:
                raiz(x);
                break;
        }
    }
    public CalculatorJAR(){}
    
    public static double  suma(double x,double y ){
        double suma= x+y;
        System.out.println(suma);
        return (x+y);
    }
    
    public static double resta(double x,double y ){
        double resta=x-y;
        System.out.println(resta);
        return resta;
    }
    
     public static double division(double x,double y ){
        double division=x/y;
        System.out.println(division);
        return division;
    }
     
      public static double multiplicacion(double x,double y ){
        double multiplicacion=x*y;
        System.out.println(multiplicacion);
        return multiplicacion;
    }
    public static double raiz(double x ){
        double raiz= Math.sqrt(x) ;
        System.out.println(raiz);
        return raiz;
    } 
}



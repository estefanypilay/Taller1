/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author elichoez
 */
public class Main {
    
    public static void main(String [] args){
        Rectangulo r1 = new Rectangulo(4,40);
        Rectangulo r2 = new Rectangulo(3.5,35.9);
        
        System.out.println("RECTANGULLO 1");
        System.out.println("ANCHO:" + r1.ancho );
        System.out.println("ALTURA:" + r1.altura );
        System.out.println("AREA:" + r1.getArea() );
        System.out.println("PERIMETRO:" +  r1.getPerimetro() );
        System.out.println("");
        System.out.println("RECTANGULLO 2");
        System.out.println("ANCHO:" + r2.ancho );
        System.out.println("ALTURA:" + r2.altura );
        System.out.println("AREA:" + r2.getArea() );
        System.out.println("PERIMETRO:" +  r2.getPerimetro() );
        
    }
}

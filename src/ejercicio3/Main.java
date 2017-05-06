/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author elichoez
 */
public class Main {
    
    public static void main(String [] args){
        Triangulo tr = new Triangulo(1,1.5,1);
        System.out.println("AREA DEL TRIANGULO: " + tr.getArea());
        System.out.println("PERIMETRO DEL TRIANGULO " + tr.getPerimetro()) ;
    }
}

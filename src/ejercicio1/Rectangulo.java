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
public class Rectangulo {
    
    public double ancho = 1;
    public double altura = 1;
    
    public Rectangulo(){
        
    }
    
    public Rectangulo(double ancho, double altura){
        this.altura = altura;
        this.ancho = ancho;
    }
    
    public double getArea(){
        return ancho * altura;
    }
    
    public double getPerimetro(){
        return ancho + ancho + altura + altura;
    }
    
    
    
}

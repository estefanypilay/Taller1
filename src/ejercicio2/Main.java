/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Date;

/**
 *
 * @author elichoez
 */
public class Main {
    
    public static void main(String [] args){
        Date fecha = new Date(117,4,6);
        Cuenta cta = new Cuenta(1122,20000);
        cta.setInteresAnual(4.5);
        cta.setFecha(fecha);
        cta.retiro(2500);
        cta.deposito(3000);
        
        System.out.println("SALDO:" + cta.getSaldo());
        System.out.println("INTERES MENSUAL: " + cta.getInteresMensual() );
        System.out.println("FECHA DE CREACION: " + cta.getFecha().toString());
        
    }
}

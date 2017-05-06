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
public class Cuenta {
    private int id = 0;
    private double saldo;
    private double interesAnual = 0;
    private Date fecha;

    public Cuenta() {
    }
    
    public Cuenta(int id, double saldo){
        this.saldo = saldo;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    public double getInteresMensual(){
        return (saldo * interesAnual / 100)/ 12;
    }
    
    public void retiro(double retiro){
        this.saldo= this.saldo - retiro;
    }
    
    public void deposito(double deposito){
       this.saldo = this.saldo + deposito;
    }
}

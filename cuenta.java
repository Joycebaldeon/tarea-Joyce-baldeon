/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_ejercicios;

import java.util.Date;

/**
 *
 * @author Ivonne Lozano
 */
public class cuenta { 
    private int id;
    private double saldo;
    private double interes_anual;
    private Date fecha;
    
 public cuenta(){
     this.id=0;
     this.saldo=0;
     this.interes_anual=0;
   
 }
 public cuenta(int id, double saldo){
     this.id=12;
     this.saldo=120;
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

    public double getInteres_anual() {
        return interes_anual;
    }

    public void setInteres_anual(double interes_anual) {
        this.interes_anual = interes_anual;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public double getinteres_mensual(){
        System.out.println("El interes mensual es:");
        System.out.println("Interes anual / 12");
        return 0;
    }
    void retiro(double retiro){
        saldo = saldo - retiro;
    }
    void deposito(double deposito){
        saldo = saldo + deposito;
    }
     public static void main(String[] args) {
       // TODO code application logic here
         cuenta cta = new cuenta();
         cta.getinteres_mensual();
     }
}

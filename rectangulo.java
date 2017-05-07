/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_ejercicios;

/**
 *
 * @author Ivonne Lozano
 */
public class rectangulo {
    public double ancho;
    public double altura;
    
    public  rectangulo(){
        this.ancho=1;
        this.altura=1;
    }
    public rectangulo(double anc, double alt){
        this.ancho=anc;
        this.altura=alt;
    }

    public double getarea() {
        return ancho*altura;
    }
    
    public double getperimetro() {
        return (ancho+altura)*2;
    }
      public static void main(String[] args) {
      // TODO code application logic here
     rectangulo rect=new rectangulo();
     rect.getarea();
     rect.getperimetro();
     }
    }

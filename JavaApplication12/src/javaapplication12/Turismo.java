/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author jehns
 */
public class Turismo extends Vehiculo implements Aseguranza{
    int numeroPuertas;
    
    
    Turismo(String marca, String modelo,int anios,double precioRenta,int numeroPuertas){
        super(marca, modelo, anios, precioRenta);
        
        this.numeroPuertas = numeroPuertas;
    }
       
    void setNumeroPuertas(int puertas){
        this.numeroPuertas = puertas;
    }
    
    int getnumeroPuertas(){
        return this.numeroPuertas;
    }
    
    
    @Override
    double calcularCosto(int dias){
        double costo;
        costo = this.precioRenta * dias ;
        return costo;
    }
    
    

    @Override
    public double calcularCostoAseguranza() {
        double seguro; 
        seguro = ((this.anios* this.precioRenta)*(0.01));
        return seguro;
    }
    
    
}

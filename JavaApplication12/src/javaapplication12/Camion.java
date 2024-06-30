/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author jehns
 */
public class Camion extends Vehiculo implements Aseguranza{
    int capacidadDeCarga;
    
    Camion(String marca, String modelo,int anios,double precioRenta,int capacidadDeCarga){
        super(marca, modelo, anios, precioRenta);
        this.capacidadDeCarga = capacidadDeCarga;
    }
    
    void setCapacidadDeCarga(int capacidadDeCarga){
        this.capacidadDeCarga = capacidadDeCarga;
        }
    
    int capacidadDeCarga(){
        return this.capacidadDeCarga;
    }
    @Override
    double calcularCosto(int dias){
        double costo;
        costo = ((this.precioRenta * dias) * (1.2)) ;
        
        return costo;
    }
    
    
    @Override
    public double calcularCostoAseguranza(){
        double seguro; 
        seguro = ((this.anios* this.precioRenta)*(0.015));
        return seguro;
    }
    
}

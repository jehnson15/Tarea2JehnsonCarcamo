/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author jehns
 */
public class Moto extends Vehiculo implements Aseguranza {
    int capacidadMotor;
    
    
    Moto(String marca, String modelo,int anios,double precioRenta, int capacidadMotor){
           
        super(marca, modelo, anios, precioRenta);
        this.capacidadMotor = capacidadMotor;
    }
    void setCapacidadMotor(int capacidadMotor){
        this.capacidadMotor = capacidadMotor;
    }
    
    int getCapacidadMotor(){
        return this.capacidadMotor;
    }
    
    @Override
    double calcularCosto(int dias ){
        double costo;
        costo = ((this.precioRenta * dias) * (0.8));
        return costo;
            }
    
    
    @Override
   public double calcularCostoAseguranza(){
        double seguro;
        
        seguro = ((this.anios* this.precioRenta)*(0.005));
                    
        return seguro;
    }

   
}

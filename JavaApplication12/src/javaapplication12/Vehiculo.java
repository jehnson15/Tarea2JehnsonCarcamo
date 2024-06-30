/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author jehns
 */
abstract class Vehiculo {
    String marca;
    String modelo;
    int anios;
    double precioRenta;
    
    Vehiculo(String marca, String modelo, int anios, double precioRenta){
        this.anios = anios;
        this.marca = marca;
        this.modelo = modelo;
        this.precioRenta = precioRenta;
    }
      public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    
    public double getPrecioRenta() {
        return precioRenta;
    }

    public void setPrecioRenta(double precioRenta) {
        this.precioRenta = precioRenta;
    }
    
    double calcularCosto(int dias){
        
        return 0;
    }
   
    public void mostrar() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Años: " + anios);
        System.out.println("Precio de Renta: Lps." + precioRenta);
    }
   
    
}

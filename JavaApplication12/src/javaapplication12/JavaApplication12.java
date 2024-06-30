/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author jehns
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Turismo t1 = new Turismo("Toyota","Corolla", 2015,500,4);
        Camion c1 = new Camion("Isuzu","Serie P",2020,1000,2000);
        Moto m1 = new Moto("Honda","CBR",2024,700,750);

          System.out.println("-----------------Turismo---------------------------");
          
          t1.calcularCostoAseguranza();
          t1.mostrar();
          System.out.println("El precio de la renta será: Lps."+t1.calcularCosto(10));
          System.out.println("El costo de la Aseguranza es: Lps."+t1.calcularCostoAseguranza());
          
          
          
          System.out.println("-----------------Camion---------------------------");
          
          c1.calcularCostoAseguranza();
          c1.mostrar();
          System.out.println("El precio de la renta será: Lps."+c1.calcularCosto(10));
          System.out.println("El costo de la Aseguranza es: Lps."+c1.calcularCostoAseguranza());
          
          
            System.out.println("-----------------Moto---------------------------");
          
          m1.calcularCostoAseguranza();
          m1.mostrar();
          System.out.println("El precio de la renta será: Lps."+m1.calcularCosto(10));
          System.out.println("El costo de la Aseguranza es: Lps."+m1.calcularCostoAseguranza());

    }    
}

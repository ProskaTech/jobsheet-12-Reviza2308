/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1_Inheritance;

/**
 *
 * @author Revskyyy
 */
public class JavaInheritance {
    public static void main(String[] args) {
        RodaDua sepeda = new RodaDua();
        RodaEmpat mobil = new RodaEmpat();
        
        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();
       
        mobil.tampilkanHarga();
        mobil.hargaAkhir();
    }
}

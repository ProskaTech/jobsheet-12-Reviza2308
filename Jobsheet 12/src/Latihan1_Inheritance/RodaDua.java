/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan1_Inheritance;

/**
 *
 * @author Revskyyy
 */
 class RodaDua extends Kendaraan{
    double NaikHargaKe = 0.20;//0.2 kali
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar * NaikHargaKe);
        System.out.println("Setelah di modifikasi,harga sepeda menjadi Rp."
        +hargaDasar);
    }
}

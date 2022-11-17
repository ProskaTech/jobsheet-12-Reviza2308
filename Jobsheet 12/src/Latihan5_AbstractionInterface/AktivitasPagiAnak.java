/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan5_AbstractionInterface;

/**
 *
 * @author Revskyyy
 */
public class AktivitasPagiAnak implements AktivitasiPagi{
    @Override
    public void lari(){
      System.out.println("Aktivitas pertama pagi ini adalah lari pagi");
    }
    @Override
    public void berenang(){
        System.out.println("Aktivitas Kedua pagi ini adalah Berenang");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author Inka Putri
 */
public class MainPenghitung {
    public static void main(String[] args) throws InterruptedException {
        Penghitung konter = new Penghitung();
        
        Runnable tugasTambah = () -> {
            for (int i = 0; i < 1000; i++) {
                konter.tambah();
            }
        };
        
        Thread t1 = new Thread(tugasTambah);
        Thread t2 = new Thread(tugasTambah);
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println("Nilai akhir konter: " + konter.getNilai());
    }
}

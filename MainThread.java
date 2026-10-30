/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author Inka Putri
 */
public class MainThread {
    public static void main(String[] args) {
        System.out.println("Program utama dimulai...");
        
        PekerjaCetak pekerja1 = new PekerjaCetak("Thread-A");
        PekerjaCetak pekerja2 = new PekerjaCetak("Thread-B");
        
        
        pekerja1.start();
        pekerja2.start();
        
        System.out.println("Program utamma selesai mengeksekusi baris terakhir.");
    }
}

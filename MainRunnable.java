/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author Inka Putri
 */
public class MainRunnable {
    public static void main(String[] args) {
        TugasDownload tugas1 = new TugasDownload("Video_PBO.mp4");
        TugasDownload tugas2 = new TugasDownload("Materi_modul9.pdf");
        
        Thread thread1 = new Thread(tugas1);
        Thread thread2 = new Thread(tugas2);
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Semua proses unduhan telah selesai.");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum9;

/**
 *
 * @author Inka Putri
 */
public class Penghitung {
    private int nilai = 0;
    
    public synchronized void tambah() {
        nilai++;
    }
    
    public int getNilai() {
        return nilai;
    }
}

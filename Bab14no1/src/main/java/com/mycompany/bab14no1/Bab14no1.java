/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab14no1;

/**
 *
 * @author HP
 */

// Parent class yang bersifat abstract
abstract class AbstrakHewan {
    // Method abstract yang harus diimplementasikan oleh subclass
    public abstract void suara();
    
    // Method non-abstract (konkrit) yang dapat digunakan oleh subclass
    public void suara2() {
        System.out.println("Ini method konkrit dari parent class");
    }
}

// Subclass Kucing yang mengimplementasikan method abstract suara()
class Kucing extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Kucing: Meong!");
    }
}

// Subclass Anjing yang mengimplementasikan method abstract suara()
class Anjing extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Anjing: Guk-guk!");
    }
}

// Main class untuk menjalankan program
public class Bab14no1 {
    public static void main(String[] args) {
        // Membuat objek dari kelas Kucing
        AbstrakHewan kucing = new Kucing();
        kucing.suara();  // Menggunakan method abstract yang diimplementasikan di Kucing
        kucing.suara2(); // Menggunakan method konkrit dari parent class

        // Membuat objek dari kelas Anjing
        AbstrakHewan anjing = new Anjing();
        anjing.suara();  // Menggunakan method abstract yang diimplementasikan di Anjing
        anjing.suara2(); // Menggunakan method konkrit dari parent class
    }
}

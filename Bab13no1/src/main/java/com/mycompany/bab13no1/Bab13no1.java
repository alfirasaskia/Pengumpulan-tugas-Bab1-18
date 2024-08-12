/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab13no1;

/**
 *
 * @author HP
 */
public class Bab13no1 {

    public static void main(String[] args) {
        
        
        class Kalkulator {
    public int tambah(int a, int b) {
        return a + b;
    }

    public int kurang(int a, int b) {
        return a - b;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public double bagi(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return Double.NaN;
        }
    }
}
        Kalkulator kalkulator = new Kalkulator();

        int hasilTambah = kalkulator.tambah(20, 10);
        int hasilKurang = kalkulator.kurang(10, 20);
        int hasilKali = kalkulator.kali(20, 10);
        double hasilBagi = kalkulator.bagi(20, 10);

        System.out.println("Hasil Pertambahan : " + hasilTambah);
        System.out.println("Hasil Pengurangan : " + hasilKurang);
        System.out.println("Hasil Perkalian : " + hasilKali);
        System.out.println("Hasil Pembagian : " + hasilBagi);
    }
}



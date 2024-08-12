/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylength;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Arraylength {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Kota: ");
        int jumlahKota = scanner.nextInt();

        String[] kota = new String[jumlahKota];
        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + ": ");
            kota[i] = scanner.next();
        }

        System.out.println("Kota-kota yang dimasukkan:");
        for (String namaKota : kota) {
            System.out.println(namaKota);
        }
    }
}

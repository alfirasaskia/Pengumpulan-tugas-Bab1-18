/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab9no2;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Bab9no2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Bilangan Awal: ");
        int nilaiAwal = scanner.nextInt();

        System.out.print("Masukan Bilangan Akhir: ");
        int nilaiAkhir = scanner.nextInt();

        // Menampilkan deret bilangan bulat dengan pertambahan 5
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.print(i + " ");
        }
    }
}

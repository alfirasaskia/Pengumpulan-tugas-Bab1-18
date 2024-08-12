/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8no1;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Bab8no1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nilai Awal ?: ");
        int nilaiAwal = scanner.nextInt();

        System.out.print("Nilai Akhir ?: ");
        int nilaiAkhir = scanner.nextInt();

        // Menampilkan bilangan pertambahan 5
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(i);
    }
    }
}

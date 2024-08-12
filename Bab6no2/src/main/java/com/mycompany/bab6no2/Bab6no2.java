/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab6no2;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Bab6no2 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("NIM ? : ");
        int NIM = input.nextInt();
        input.nextLine();  // Membersihkan buffer

        System.out.print("NAMA ? : ");
        String Nama = input.nextLine();

        System.out.print("NILAI ? : ");
        int Nilai = input.nextInt();

        // Menentukan grade berdasarkan nilai
        char grade;
        String keterangan;
        if (Nilai >= 85) {
            grade = 'A';
            keterangan = "Lulus";
        } else if (Nilai >= 75) {
            grade = 'B';
            keterangan = "Lulus";
        } else if (Nilai >= 55) {
            grade = 'C';
            keterangan = "Cukup";
        } else if (Nilai >= 40) {
            grade = 'D';
            keterangan = "Kurang";
        } else {
            grade = 'E';
            keterangan = "Sangat Kurang";
        }

        // Menampilkan hasil
        System.out.println("\nOutput:");
        System.out.println("NIM : " + NIM);
        System.out.println("NAMA : " + Nama);
        System.out.println("NILAI : " + Nilai);
        System.out.println("GRADE : " + grade);
        System.out.println("KETERANGAN : " + keterangan);

        input.close();
    }
}

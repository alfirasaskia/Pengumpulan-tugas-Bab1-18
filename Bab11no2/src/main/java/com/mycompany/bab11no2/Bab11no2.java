/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab11no2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Bab11no2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("ID Karyawan: ");
        String id = input.nextLine();

        System.out.print("Nama Karyawan: ");
        String nama = input.nextLine();

        System.out.print("Golongan (1-5): ");
        int golongan = input.nextInt();

        double gajiPokok;

        // Menentukan gaji pokok berdasarkan golongan
        switch (golongan) {
            case 1:
                gajiPokok = 3000000.0;
                break;
            case 2:
                gajiPokok = 3500000.0;
                break;
            case 3:
                gajiPokok = 4000000.0;
                break;
            case 4:
                gajiPokok = 5000000.0;
                break;
            case 5:
                gajiPokok = 6000000.0;
                break;
            default:
                System.out.println("Golongan tidak v0alid. Menggunakan gaji pokok default.");
                gajiPokok = 3000000;
        }

        String jabatan;

        // Menentukan jabatan berdasarkan golongan
        switch (golongan) {
            case 1:
                jabatan = "Assisten Staff";
                break;
            case 2:
                jabatan = "Staff";
                break;
            case 3:
                jabatan = "Supervisor";
                break;
            case 4:
                jabatan = "Assisten Manager";
                break;
            case 5:
                jabatan = "Manager";
                break;
            default:
                jabatan = "Tidak Diketahui";
        }

        System.out.println("\nData Karyawan:");
        System.out.println("ID Karyawan: " + id);
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Golongan: " + golongan);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: " + gajiPokok);

        input.close();
    }
}

    


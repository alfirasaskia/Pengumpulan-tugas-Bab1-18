/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab7no2;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Bab7no2 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("NIM: ");
        int nim = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.print("NAMA: ");
        String nama = scanner.nextLine();

        System.out.print("TAHUN: ");
        int tahun = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.print("PILIH PEMINATAN (M/F): ");
        char peminatan = scanner.nextLine().charAt(0);

                switch (peminatan) {
                    case 'M':
                        System.out.println("PEMROGRAMAN MOBILE, PEMROGRAMAN JAVA 2");
                        break;
                    case 'F':
                        System.out.println("Peminatan Big Data");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid");
                }
                
        }
    }


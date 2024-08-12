/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.karyawan;

/**
 *
 * @author HP
 */
public class Karyawan {

    private String idKaryawan;
    private String namaKaryawan;
    private String golongan;
    private String jabatan;
    private double gajiPokok;

    // Constructor dengan parameter
    public Karyawan(String id, String nama, String gol, String jab, double gaji) {
        this.idKaryawan = id;
        this.namaKaryawan = nama;
        this.golongan = gol;
        this.jabatan = jab;
        this.gajiPokok = gaji;
    }

    // Metode untuk menampilkan data karyawan
    public void tampilkanData() {
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama Karyawan: " + namaKaryawan);
        System.out.println("Golongan: " + golongan);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji Pokok: $" + gajiPokok);
    }

    public static void main(String[] args) {
        // Contoh penggunaan constructor
        Karyawan karyawan1 = new Karyawan("001", "Agus Suharto", "2", "Manager", 5000.0);
        karyawan1.tampilkanData();
    }
}

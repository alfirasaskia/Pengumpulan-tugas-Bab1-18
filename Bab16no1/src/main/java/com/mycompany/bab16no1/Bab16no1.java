/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab16no1;


/**
 *
 * @author HP
 */


// Abstract class untuk operasi aritmatika
abstract class Aritmatika {
    protected double a;
    protected double b;

    public Aritmatika(double a, double b) {
        this.a = a;
        this.b = b;
    }

    // Metode abstrak untuk penjumlahan
    protected abstract double penjumlahan();

    // Metode abstrak untuk pengurangan
    protected abstract double pengurangan();

    // Metode abstrak untuk perkalian
    protected abstract double perkalian();

    // Metode abstrak untuk pembagian
    protected abstract double pembagian();
}

// Kelas turunan untuk implementasi operasi aritmatika
class Kalkulator extends Aritmatika {
    public Kalkulator(double a, double b) {
        super(a, b);
    }

    @Override
    protected double penjumlahan() {
        return a + b;
    }

    @Override
    protected double pengurangan() {
        return a - b;
    }

    @Override
    protected double perkalian() {
        return a * b;
    }

    @Override
    protected double pembagian() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return Double.NaN;
        }
    }
}

public class Bab16no1 {
    public static void main(String[] args) {
        double A = 9.5;
        double B = 2.5;

        Kalkulator kalkulator = new Kalkulator(A, B);

        System.out.println("Penjumlahan: " + kalkulator.penjumlahan());
        System.out.println("Pengurangan: " + kalkulator.pengurangan());
        System.out.println("Perkalian: " + kalkulator.perkalian());
        System.out.println("Pembagian: " + kalkulator.pembagian());
    }
}

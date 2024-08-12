/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraymultidimensi;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ArrayMultidimensi {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String[][] negaraIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        for (String[] pair : negaraIbukota) {
            System.out.println("Ibukota " + pair[0] + " adalah " + pair[1]);
        }
    }
}

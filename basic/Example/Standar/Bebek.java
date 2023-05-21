/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example.Standar;

import java.util.Scanner;

/**
 *
 * @author hibat
 */
public class Bebek {
    public static void main(String[] args) {
        int bebek;
        int kawan;
        int hasil;
        int sisa;

        Scanner sc = new Scanner(System.in);

        System.out.println("Banyak bebek: ");
        bebek = sc.nextInt();
        System.out.println("Banyak kawan: ");
        kawan = sc.nextInt();
        hasil = bebek / kawan;
        sisa = bebek % kawan;

        System.out.println("bebek: " + bebek + "\nkawan: " + kawan +
                "\nsisa bebek: " + sisa);

    }

}

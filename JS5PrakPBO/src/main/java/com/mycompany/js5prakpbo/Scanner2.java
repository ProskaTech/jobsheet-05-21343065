/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js5prakpbo;

/**
 *
 * Created by 21343065_PUTI ZAFANIA
 */

import java.util.Scanner;
public class Scanner2 {
    public static void main(String args[]){
        float angka1, angka2, jumlah;
        Scanner dataMasuk = new Scanner(System.in);
        
        System.out.print("Masukkan Angka ke-1 : ");
        angka1 = dataMasuk.nextFloat();
        
        System.out.print("Masukkan Angka ke-2 : ");
        angka2 = dataMasuk.nextFloat();
        
        jumlah = angka1+angka2;
        
        System.out.print("Angka ke-1 :" + angka1);
        System.out.print("Angka ke-2 :" + angka2);
        System.out.print("Jumlah :" + jumlah);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.js5prakpbo;

/**
 *
 * Created by 21343065_PUTI ZAFANIA
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferredReader1 {
    public static void main(String[] args){
        BufferedReader dataIn =new BufferedReader (new InputStreamReader (System.in));
        
        String a, b;
        float angka1, angka2, jumlah;
        System.out.println("Program Pejumlahan Dua Buah Bilangan");
        
        try {
            System.out.print("Masukkan Angka Pertama :");
            a =dataIn.readLine();
            angka1 = Float.parseFloat(a);
            
            System.out.print("Masukkan Angka Kedua :");
            b =dataIn.readLine();
            angka2 = Float.parseFloat(b);
            
            jumlah = angka2 + angka1;
            System.out.print("Jumlah : "+jumlah);
            
        }
        
       catch (IOException e) {
            System.out.print("gagal membaca keyboard");
            
        }
    }
}

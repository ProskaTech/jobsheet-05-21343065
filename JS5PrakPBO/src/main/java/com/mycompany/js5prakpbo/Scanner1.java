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

public class Scanner1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan nama lengkap: ");
        String nama = in.nextLine();
        
        System.out.print("Masukan NIM: ");
        int NIM = in.nextInt();
        
        System.out.print("Masukkan Nilai: ");
        float nilai = in.nextFloat();
        
        System.out.print("/n Nama : " + nama +
                          "/n NIM : " + NIM +
                          "/n Nilai : " + nilai);
    }
}
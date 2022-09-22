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

public class Tugas1BufferedReader {
    public static void main(String[] args){
        BufferedReader dataIn =new BufferedReader (new InputStreamReader (System.in));
        
        String a, b, c;
        System.out.println("Program Menampilkan Tulisan");
        
        try {
            System.out.print("Enter word1:");
            a =dataIn.readLine();

            
            System.out.print("Enter word2:");
            b =dataIn.readLine();
            
             System.out.print("Enter word3:");
            c =dataIn.readLine();
           
             System.out.print(a+b+c);
         
        }
        
       catch (IOException e) {
            System.out.print("gagal membaca keyboard");
            
        }
    }
}

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

public class GetInputFromKeyboard1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String name ="", hoby ="";
        try {
            System.out.print("Nama Anda : ");
            name = dataIn.readLine();
            System.out.print("Hobi Anda : ");
            hoby = dataIn.readLine();
         
        }
        
        catch (IOException e) {
            System.out.print("gagal membaca keyboard");
            
        }
        System.out.print("Jadi Hobi Anda " + hoby+". Hobi yang bagus "+name);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atbash;

import java.util.Scanner;

/**
 *
 * @author maryam
 */
public class AtBash {
    
      public static char message[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static    char message2[] = {'Z', 'Y', 'X', 'W', 'V', 'U', 'T', 'S', 'R', 'Q', 'P', 'O', 'N', 'M', 'L', 'K', 'J', 'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A'};
        
    
    public static String encrypt(String PlainText) {
     
      
        String cipher = "";
        PlainText = PlainText.toUpperCase();
        for (int i = 0; i < PlainText.length(); i++) {
            for (int j = 0; j < message.length; j++) {
                if (PlainText.charAt(i) == message[j]) {
                    cipher+=message2[j];
                     
                }
               // cipher=p;
            }
        }

        return cipher;

    }

    public static String decrypt(String Cipher) {
     
        String PlainText = "";
          Cipher = Cipher.toUpperCase();
        for (int i = 0; i < Cipher.length(); i++) {
            for (int j = 0; j < message.length; j++) {
                if (Cipher.charAt(i) == message2[j]) {
                    PlainText+=message[j];
                   // break;
                }
            //PlainText=p;
        }
        }

        return PlainText;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter The Plain Text ,please : ");
        String PlainText = in.nextLine();
        String cipher = encrypt(PlainText);
        System.out.println("The Chipher Text : " + encrypt(PlainText));
        decrypt(cipher);
        System.out.println("The Plain Text : " + decrypt(cipher));
        System.out.println(decrypt(cipher));
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;

/**
 *
 * @author edis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("pocetak");
        
        Process p = Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"dir && ping localhost && echo end\"");
        
        System.out.println("kraj");
    }

}

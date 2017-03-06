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

    public static void main(String[] args) throws IOException {
        System.out.println("pocetak");

        Process p = Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"cd C:\\asdf && git init\"");

        System.out.println("kraj");

        /*
        link
        http://stackoverflow.com/questions/24405681/with-java-run-multiple-commands-in-the-same-cmd-exe-window/24406721#24406721
         */
    }

}

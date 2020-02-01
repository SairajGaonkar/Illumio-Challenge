package com.java.main;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            /*File path to be changed before running*/
            Firewall firewall = new Firewall("C:\\Users\\saira\\Documents\\input.csv");
        } catch (IOException e) {
            System.out.println("File not found, please check the file path");
        }
    }
}

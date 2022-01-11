package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite um número inteiro.");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();

        if(n%2==0) {
            System.out.println("Tenho aqui um número par.");
        } else {
            System.out.println("Tenho aqui um número impár");
        }
    }
}

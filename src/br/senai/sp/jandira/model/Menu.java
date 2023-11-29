package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        Gol gol = new Gol("Paris - FR","Gol", "Guarulhos - SP", "11h10", "15/01/2024", "10h00","21h45", 70, 323);
        Azul azul = new Azul("Maldivas - ML", "Azul","Guarulhos - SP","22h15min +","02/05/2025","00h15","00h30",50,546);
        Latam latam = new Latam("Orlando - FL", "Latam","Guarulhos - SP","9h35","17/11/2024","05h30","23h30",85,112);

        boolean continuar = true;
        while (continuar){
            System.out.println("QUAL  COMPANHIA AEREA DESEJA REALIZAR:");
            System.out.println("1-  Voos Gol");
            System.out.println("2-  Voos Azul");
            System.out.println("3-  Voos Latam");

            int opcoes = scanner.nextInt();

            switch (opcoes){
                case 1:

            }
        }
    }
}

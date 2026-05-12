package br.com.loja;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int habitantes;
        int consumo;
        double vazao;

        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite o habitantes: ");
        habitantes = ler.nextInt();
        System.out.printf("Digite o consumo de litros diarios: ");
        consumo = ler.nextInt();

        vazao = (habitantes * consumo) / 86400.0;
        System.out.printf("A vazão por segundo é: " + vazao +" \n");

        if (vazao < 53.8){ //vazão
            double base = vazao / 0.3812; // K
            double expoente = 1/1.530;  // N
            double alturaAgua = Math.pow(base, expoente);
            double alturaCalha = 45.7;   // E
            double alturaMaxima = alturaCalha * 0.7;
            if (alturaMaxima > alturaAgua ){
                System.out.printf("\n\n\n\nPara a calha de 3\" a altura maxima é valida\n");  // tamanho em polegada
            }else{
                System.out.printf("\nPara a calha de 3\" a altura maxima é invalida\n"); // tamanho em polegada
            }
            System.out.println("altura da calha é: " + alturaCalha + " (100%) ");
            System.out.println("Altura maxima: " +  String.format("%.2f", alturaMaxima) + " (70%) ");
            System.out.println("a altura da agua é: " + String.format("%.2f", alturaAgua) + " (" + String.format("%.2f", (alturaAgua/(alturaCalha/100))) + "%)") ;
        }

    }
}

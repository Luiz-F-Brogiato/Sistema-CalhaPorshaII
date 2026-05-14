import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int habitantes;
        int consumo;
        double vazao;

        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite o habitantes: ");
        habitantes = ler.nextInt();
        System.out.printf("Digite o consumo de litros diarios: ");
        consumo = ler.nextInt();

        vazao = (habitantes * consumo) / 86400;
        System.out.printf("A vazão por segundo é: " + vazao +" \n");

        if (vazao < 53.8){ //vazão
            double base = vazao / 0.1771; // K
            double expoente = 1/1.5447;  // N
            double alturaAgua = Math.pow(base, expoente);
            double alturaCalha = 38.1;   // E
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

        if (vazao < 110.4){ //vazão
            double base = vazao / 0.3812; // K
            double expoente = 1/1.530;  // N
            double alturaAgua = Math.pow(base, expoente);
            double alturaCalha = 45.7;   // E
            double alturaMaxima = alturaCalha * 0.7;
            if (alturaMaxima > alturaAgua ){
                System.out.printf("\n\n\n\nPara a calha de 6\" a altura maxima é valida\n");  // tamanho em polegada
            }else{
                System.out.printf("\nPara a calha de 6\" a altura maxima é invalida\n"); // tamanho em polegada
            }
            System.out.println("altura da calha é: " + alturaCalha + " (100%) ");
            System.out.println("Altura maxima: " +  String.format("%.2f", alturaMaxima) + " (70%) ");
            System.out.println("a altura da agua é: " + String.format("%.2f", alturaAgua) + " (" + String.format("%.2f", (alturaAgua/(alturaCalha/100))) + "%)") ;
        }

        if (vazao < 251.9 & vazao >= 53.8){ //vazão
            double base = vazao / 0.5354; // K
            double expoente = 1/1.530;  // N
            double alturaAgua = Math.pow(base, expoente);
            double alturaCalha = 61;   // E
            double alturaMaxima = alturaCalha * 0.7;
            if (alturaMaxima > alturaAgua ){
                System.out.printf("\n\n\n\nPara a calha de 9\" a altura maxima é valida\n");  // tamanho em polegada
            }else{
                System.out.printf("\nPara a calha de 9\" a altura maxima é invalida\n"); // tamanho em polegada
            }
            System.out.println("altura da calha é: " + alturaCalha + " (100%) ");
            System.out.println("Altura maxima: " +  String.format("%.2f", alturaMaxima) + " (70%) ");
            System.out.println("a altura da agua é: " + String.format("%.2f", alturaAgua) + " (" + String.format("%.2f", (alturaAgua/(alturaCalha/100))) + "%)") ;
        }

        if (vazao < 455.6 & vazao >= 110.4){ //vazão
            double base = vazao / 0.6909; // K
            double expoente = 1/1.522;  // N
            double alturaAgua = Math.pow(base, expoente);
            double alturaCalha = 91.5;   // E
            double alturaMaxima = alturaCalha * 0.7;
            if (alturaMaxima > alturaAgua ){
                System.out.printf("\n\n\n\nPara a calha de 1\' a altura maxima é valida\n");  // tamanho em polegada
            }else{
                System.out.printf("\nPara a calha de 1\' a altura maxima é invalida\n"); // tamanho em polegada
            }
            System.out.println("altura da calha é: " + alturaCalha + " (100%) ");
            System.out.println("Altura maxima: " +  String.format("%.2f", alturaMaxima) + " (70%) ");
            System.out.println("a altura da agua é: " + String.format("%.2f", alturaAgua) + " (" + String.format("%.2f", (alturaAgua/(alturaCalha/100))) + "%)") ;
        }

        if (vazao < 696.2 & vazao >= 251.9){ //vazão
            double base = vazao / 1.0560; // K
            double expoente = 1/1.538;  // N
            double alturaAgua = Math.pow(base, expoente);
            double alturaCalha = 91.5;   // E
            double alturaMaxima = alturaCalha * 0.7;
            if (alturaMaxima > alturaAgua ){
                System.out.printf("\n\n\n\nPara a calha de 1.1/2\' a altura maxima é valida\n");  // tamanho em polegada
            }else{
                System.out.printf("\nPara a calha de 1.1/2\' a altura maxima é invalida\n"); // tamanho em polegada
            }
            System.out.println("altura da calha é: " + alturaCalha + " (100%) ");
            System.out.println("Altura maxima: " +  String.format("%.2f", alturaMaxima) + " (70%) ");
            System.out.println("a altura da agua é: " + String.format("%.2f", alturaAgua) + " (" + String.format("%.2f", (alturaAgua/(alturaCalha/100))) + "%)") ;
        }

        if (vazao < 936.7 & vazao >= 455.6){ //vazão
            double base = vazao / 1.4290; // K
            double expoente = 1/1.550;  // N
            double alturaAgua = Math.pow(base, expoente);
            double alturaCalha = 91.5;   // E
            double alturaMaxima = alturaCalha * 0.7;
            if (alturaMaxima > alturaAgua ){
                System.out.printf("\n\n\n\nPara a calha de 2\' a altura maxima é valida\n");  // tamanho em polegada
            }else{
                System.out.printf("\nPara a calha de 2\' a altura maxima é invalida\n"); // tamanho em polegada
            }
            System.out.println("altura da calha é: " + alturaCalha + " (100%) ");
            System.out.println("Altura maxima: " +  String.format("%.2f", alturaMaxima) + " (70%) ");
            System.out.println("a altura da agua é: " + String.format("%.2f", alturaAgua) + " (" + String.format("%.2f", (alturaAgua/(alturaCalha/100))) + "%)") ;
        }

        if (vazao < 1426 & vazao >= 696.2){ //vazão
            double base = vazao / 2.1840; // K
            double expoente = 1/1.5666;  // N
            double alturaAgua = Math.pow(base, expoente);
            double alturaCalha = 91.5;   // E
            double alturaMaxima = alturaCalha * 0.7;
            if (alturaMaxima > alturaAgua ){
                System.out.printf("\n\n\n\nPara a calha de 3\' a altura maxima é valida\n");  // tamanho em polegada
            }else{
                System.out.printf("\nPara a calha de 3\' a altura maxima é invalida\n"); // tamanho em polegada
            }
            System.out.println("altura da calha é: " + alturaCalha + " (100%) ");
            System.out.println("Altura maxima: " +  String.format("%.2f", alturaMaxima) + " (70%) ");
            System.out.println("a altura da agua é: " + String.format("%.2f", alturaAgua) + " (" + String.format("%.2f", (alturaAgua/(alturaCalha/100))) + "%)") ;
        }

        if (vazao < 1921 & vazao >= 936.7){ //vazão
            double base = vazao / 2.9630; // K
            double expoente = 1/1.5738;  // N
            double alturaAgua = Math.pow(base, expoente);
            double alturaCalha = 91.5;   // E
            double alturaMaxima = alturaCalha * 0.7;
            if (alturaMaxima > alturaAgua ){
                System.out.printf("\n\n\n\nPara a calha de 4\' 'a altura maxima é valida\n");  // tamanho em polegada
            }else{
                System.out.printf("\nPara a calha de 4\' a altura maxima é invalida\n"); // tamanho em polegada
            }
            System.out.println("altura da calha é: " + alturaCalha + " (100%) ");
            System.out.println("Altura maxima: " +  String.format("%.2f", alturaMaxima) + " (70%) ");
            System.out.println("a altura da agua é: " + String.format("%.2f", alturaAgua) + " (" + String.format("%.2f", (alturaAgua/(alturaCalha/100))) + "%)") ;
        }

        if (vazao < 2422 & vazao >= 1426){ //vazão
            double base = vazao / 3.7320; // K
            double expoente = 1/1.587;  // N
            double alturaAgua = Math.pow(base, expoente);
            double alturaCalha = 91.5;   // E
            double alturaMaxima = alturaCalha * 0.7;
            if (alturaMaxima > alturaAgua ){
                System.out.printf("\n\n\n\nPara a calha de 5\' a altura maxima é valida\n");  // tamanho em polegada
            }else{
                System.out.printf("\nPara a calha de 5\' a altura maxima é invalida\n"); // tamanho em polegada
            }
            System.out.println("altura da calha é: " + alturaCalha + " (100%) ");
            System.out.println("Altura maxima: " +  String.format("%.2f", alturaMaxima) + " (70%) ");
            System.out.println("a altura da agua é: " + String.format("%.2f", alturaAgua) + " (" + String.format("%.2f", (alturaAgua/(alturaCalha/100))) + "%)") ;
        }

    }
}
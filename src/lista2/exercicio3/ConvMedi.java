package src.lista2.exercicio3;

import java.util.Scanner;

public class ConvMedi {
    public static void main(String[] args) {
        float m, cm;
        Scanner input = new Scanner(System.in);

        System.out.println("Aqui pode-se converter metros em centimetros");
        System.out.println("Insira o valor em metros a ser convertido");
        m = input.nextFloat();
        cm = m * 100;
        System.out.println( m +"metros equivalem a " +cm +" centimetros");
    }
}

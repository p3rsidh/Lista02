package src.lista2.exercicio4;

import java.util.Scanner;

public class CalcSalar {
    public static void main(String[] args) {
        System.out.println("Aqui voce pode calcular o valor a ser recebido no mes");
        int sabe;
        float salarioh, horas, salariom, salariot, horast;
        Scanner input = new Scanner(System.in);

        System.out.print("Voce sabe o quanto recebe por hora?");
        System.out.print("Digite 1 para sim 2 para nao");
        sabe = input.nextInt();
        if(sabe == 1){
            System.out.println("Qual o seu salario por hora?");
            salarioh = input.nextFloat();
            System.out.println("Quantas horas trabalhou neste mes?");
            horas = input.nextFloat();
            salariom = salarioh * horas;
            System.out.println("Neste mes voce recebera " +salariom +"reais");
        } else if(sabe == 2){
            System.out.println("Qual o valor total do salario que se pode receber?");
            salariot = input.nextFloat();
            System.out.println("Quantas horas sao esperadas de trabalho por mes?");
            horast = input.nextFloat();
            salarioh = salariot / horast;
            System.out.println("O salario por hora e de: " +salarioh);

            System.out.println("Quantas horas trabalhou neste mes?");
            horas = input.nextFloat();
            salariom = salarioh * horas;
            System.out.println("Neste mes voce recebera " +salariom +"reais");
        } else {
            System.out.println("valor nao aceito");
        }

    }
}

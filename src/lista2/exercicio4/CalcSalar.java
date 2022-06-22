package src.lista2.exercicio4;

import java.util.Scanner;

public class CalcSalar {
    public static void main(String[] args) {
        System.out.println("Aqui voce pode calcular o valor a ser recebido no mes");
        int sabe;
        float salarioh, horas, salariom;
        Scanner input = new Scanner(System.in);

        System.out.println("Voce sabe o quanto recebe por hora?");
        System.out.printf("Digite 1 para sim 2 para nao");
        sabe = input.nextInt();
        if(sabe == 1){
            System.out.println("Qual o seu salario por hora?");
            salarioh = input.nextFloat();
            System.out.println("Quantas horas trabalhou neste mes?");
            horas = input.nextFloat();
            salariom = salarioh * horas;
            System.out.println("Neste mes voce recebera " +salariom +"reais");
        } else if(sabe == 2){

        }

    }
}

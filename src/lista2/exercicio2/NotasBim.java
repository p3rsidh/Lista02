package src.lista2.exercicio2;

import java.util.Scanner;

public class NotasBim {
    public static void main(String[] args) {
        float n1, n2, n3, n4;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        String nome = input.nextLine();
        System.out.println("O nome do aluno e: " +nome);
        System.out.println("Digite a primeira nota do aluno:");
        n1 = input.nextFloat();
        System.out.println("A primeira nota e:" +n1);
        System.out.println("Digite a segunda nota:");


    }
}

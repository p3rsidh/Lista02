package src.lista2.exercicio2;

import java.util.Scanner;

public class NotasBim {
    public static void main(String[] args) {
        float n1, n2, n3, n4, mediaa;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        String nome = input.nextLine();
        System.out.println("O nome do aluno e: " +nome);
        System.out.println("Digite a primeira nota do aluno:");
        n1 = input.nextFloat();
        System.out.println("A primeira nota e:" +n1);
        System.out.println("Digite a segunda nota:");
        n2 = input.nextFloat();
        System.out.println("A primeira nota: " +n1);
        System.out.println("A segunda nota: " +n2);
        System.out.println("Digite a terceira nota do aluno:");
        n3 = input.nextFloat();
        System.out.println("A primeira nota: " +n1);
        System.out.println("A segunda nota: " +n2);
        System.out.println("A terceira nota:" +n3);
        System.out.println("Digite a quarta nota do aluno");
        n4 = input.nextFloat();
        System.out.println("A primeira nota: " +n1);
        System.out.println("A segunda nota: " +n2);
        System.out.println("A terceira nota:" +n3);
        System.out.println("A quarta nota:" +n4);

        mediaa = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A media aritimetica das notas e: " +mediaa);

    }
}

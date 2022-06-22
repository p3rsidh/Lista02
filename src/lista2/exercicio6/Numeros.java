package src.lista2.exercicio6;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Aqui voce pode descobrir o antecessor e sucessor de um numero");
        System.out.println("Digite o numero que deseja");
        n = input.nextInt();
        System.out.println("O numero " +n +" tem como antecessor " +(n-1) +" e como sucessor " +(n+1));
        System.out.println(n-1 +" " +n +" "+(n+1));
    }
}

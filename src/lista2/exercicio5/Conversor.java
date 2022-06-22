package src.lista2.exercicio5;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        float Fh;

        Scanner input = new Scanner(System.in);
        System.out.println("Aqui voce pode converter Fahrenheit em Celsius");
        System.out.println("Insira o valor da temperatura que deseja converter em Celsius (Insira em Fahrenheit");
        Fh = input.nextFloat();
        double Cl =((Fh - 32)/(1.8));
        System.out.println("Convertendo...");
        System.out.printf( Fh +" Fahrenheit  equivalem a " +Cl +" Celsius");
    }
}

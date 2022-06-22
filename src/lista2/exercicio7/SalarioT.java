package src.lista2.exercicio7;

import java.util.Scanner;

public class SalarioT {
    public static void main(String[] args) {
        float salariob, salarioh, horas, inss, sind, salariol, ir;
        Scanner input = new Scanner(System.in);

        System.out.println("Aqui serao apresentados salario bruto, valor para INSS, valor para Sindicato, salario liquido");
        System.out.println("Introduza o valor do salario por hora");
        salarioh = input.nextFloat();
        System.out.println("Quantas horas trabalhou no respectivo mes");
        horas = input.nextFloat();
        input.close();
        salariob = salarioh * horas;
        ir = (salariob * 11)/100;
        inss = (salariob * 8)/100;
        sind = (salariob * 5)/100;
        salariol = salariob - inss - sind - ir;
        System.out.println("O salario bruto e de: " +salariob +" reais");
        System.out.println(inss +" reais serao pagos ao INSS");
        System.out.println(sind +" serao pagos ao Sindicato");
        System.out.println("O salario liquido do funcionario e de: " +salariol +" reais");

    }}

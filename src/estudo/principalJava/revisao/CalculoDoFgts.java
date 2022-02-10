package estudo.principalJava.revisao;

import java.util.Scanner;

public class CalculoDoFgts {
    public static void main(String[] args) {
        double salario;
        double desconto1;
        double desconto2;
        double total = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("informe seu salario: ");
        salario = entrada.nextDouble();
        if (salario >= 2000) {
            desconto1 = (salario * 20) / 100;
            total = salario - desconto1;
            System.out.printf("Seu salarío é %.2f", total);
        }
        if (salario <= 1999) {
            desconto2 = (salario * 10) / 100;
            total = salario - desconto2;
            System.out.printf("Seu salarío é %.2f", total);
        }
    }
}

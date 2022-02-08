package estudo.principalJava.calculosMatematicos;

import java.util.Scanner;

public class Calculos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome" );
        String nome;
        nome= entrada.nextLine();
        System.out.printf("nome informado %s",nome);
    }
}

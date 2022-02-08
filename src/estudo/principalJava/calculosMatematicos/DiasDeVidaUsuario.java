package estudo.principalJava.calculosMatematicos;

import java.util.Scanner;

public class DiasDeVidaUsuario {

    public static void main(String[] args) {
        String nome;
        int idade;
        int diasDeVida = (365);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        nome = entrada.nextLine();
        System.out.println("Qual a sua idade?");
        idade = entrada.nextInt();
        System.out.printf("\t Seu nome é (%s),",nome);
        System.out.printf(" tem (%d) anos",idade);

        System.out.printf(" e você tem (%d) dias de vida.", diasDeVida*idade);

    }


}

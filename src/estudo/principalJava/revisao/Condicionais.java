package estudo.principalJava.revisao;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        int idade;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        idade = entrada.nextInt();
        if (idade >= 18) {
            if (idade <= 90) {
                System.out.println("Voce está apto para tirar a CNH!");
            } else {
                System.out.println("Você não está apto para tirar a CNH! 2 else");
            }
        }else{
            System.out.println("Você não está apto para tirar a CNH! 1º else");
        }

    }
}
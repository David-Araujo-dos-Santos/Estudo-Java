package estudo.principalJava.revisao;

import java.util.Scanner;

public class MainRevisao {
    public static void main(String[] args) {

        int idade;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        idade = entrada.nextInt();

        if (idade >= 18) {
            System.out.println("Apto para tirar a CNH");

        } else {
            {
                System.out.println(" Vocô não pode tirar a carteira!" + idade);
            }
        }
    }
}

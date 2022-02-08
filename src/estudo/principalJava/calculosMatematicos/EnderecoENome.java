package estudo.principalJava.calculosMatematicos;

import java.util.Scanner;

public class EnderecoENome {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite Seu nome!");
        String nome;
        nome = entrada.nextLine();
        System.out.printf("nome %s \n", nome);
        System.out.println("Informe o endereço completo!");
        String endereco;
        endereco = entrada.nextLine();
        System.out.printf("seu endereço %s \n", endereco);
        System.out.printf("Seu endereço foi informado: %s", endereco);

    }
}

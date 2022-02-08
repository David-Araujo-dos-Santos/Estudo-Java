package estudo.principalJava.calculosMatematicos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EntradasESaidas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu endereço!");
        String enderecoCompleto;
        enderecoCompleto = entrada.nextLine();
        System.out.printf("Endereço informado %s ", enderecoCompleto);
    }
}

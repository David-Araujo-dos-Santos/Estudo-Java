package estudo.principalJava.calculosMatematicos;

import java.util.Scanner;

public class CalculosDeUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int media;

        System.out.println("Informe o numero 1: ");
        numero1 = entrada.nextInt();
        System.out.println("Informe o numero 2: ");
        numero2 = entrada.nextInt();

        media = (numero1 + numero2) / 2;

        System.out.printf("A media dos numeros (%d) e (%d) é %d", numero1, numero2, media);
    }
}

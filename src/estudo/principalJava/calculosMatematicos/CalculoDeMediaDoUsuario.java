package estudo.principalJava.calculosMatematicos;

import java.util.Scanner;

public class CalculoDeMediaDoUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        int media;
        System.out.println("Informe o numero1");
        numero1 = entrada.nextInt();
        System.out.println("Informe o numero2");
        numero2 = entrada.nextInt();
        System.out.println("Informe o numero3");
        numero3 = entrada.nextInt();
        media= (numero1+numero2+numero3)/3;
        System.out.printf("Media é igual ao (%d)+(%d)+(%d)=(%d)", numero1,numero2,numero3,media);
    }
}

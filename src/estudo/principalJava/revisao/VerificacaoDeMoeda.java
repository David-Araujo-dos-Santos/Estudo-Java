package estudo.principalJava.revisao;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class VerificacaoDeMoeda {
    public static void main(String[] args) {
        double real;
        double dolar;
        double total;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a cotação do dólar:");
        dolar = entrada.nextDouble();
        System.out.println("informe o valor em reais:");
        real = entrada.nextDouble();
        total = real/dolar;
        System.out.printf("Você tem $ %.2f", total);
    }
}
//5.261
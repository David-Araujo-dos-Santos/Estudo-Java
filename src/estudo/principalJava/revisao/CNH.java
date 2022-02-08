package estudo.principalJava.revisao;

import java.util.Scanner;

public class CNH {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        double salario;

        System.out.println("Informe sua idade: ");
        idade = entrada.nextInt();

        if (idade >= 18 && idade <= 97) {
            System.out.println("Informe seu salario");
            salario = entrada.nextDouble();
            if (salario >= 3000.00) {
                System.out.println("Meus parabens vc pode tirar a CNH!");
            } else {
                double quantoFaltaParaTirarCNH = (salario - 3000) * (-1);
                System.out.println("Desculpe vc precisara juntar mais dinheiro!");
                System.out.printf("você precisara de pelo menos mais R$ %.2f reais", quantoFaltaParaTirarCNH);
            }
        } else {
            System.out.println("Desculpe vc não pode tirar CNH");
        }
    }
}



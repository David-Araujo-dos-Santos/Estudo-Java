package estudo.principalJava.decisao;

import java.util.Scanner;

public class EstrurasDeDecisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroDeFilhos;
        double bonusDoisFilhosOuMais = 200;
        double bonusUmFilho = 150;
        double totalDosBonus;

        System.out.print("Quantos Filhos você tem: ");
        numeroDeFilhos = entrada.nextInt();

        if (numeroDeFilhos >= 2) {
            totalDosBonus = numeroDeFilhos * bonusDoisFilhosOuMais;
        } else {
            totalDosBonus = numeroDeFilhos * bonusUmFilho;
        }

        if (totalDosBonus > 0) {
            System.out.println("Você tem : " + numeroDeFilhos + " Filhos.");
            System.out.printf("Com base no numero de filhos você recebera um total de %.2f", totalDosBonus);
        } else {
            System.out.printf("Com base no numero de filhos você não recebera o bonus");
        }

    }

}

/*
O programa deve perguntar quantos filhos vc tem!
Se vc tiver dois filhos ele ira calcular um bonus alimentação de 200 reais para cada filho
ANISBERTO DOS REIS DO NASCIMENTO20:27
se tiver somente um ele dara um bonus de somente 150 reais
Ao final do programa vc devera calcular o total dos bonus em dinheiro
e imprimir no terminal
 */
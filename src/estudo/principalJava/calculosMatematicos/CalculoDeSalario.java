package estudo.principalJava.calculosMatematicos;

import java.util.Scanner;

public class CalculoDeSalario {
    public static void main(String[] args) {
        float salarioMinimo = 1212;
        float salarioPessoa;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o Salário Mínimo!");
        salarioMinimo = teclado.nextFloat();
        System.out.println("Digite o valor do seu salário!");
        salarioPessoa = teclado.nextFloat();
        float quantosSalarioMinimosUmaPessoaGanha = (salarioPessoa/salarioMinimo);
        System.out.printf("Vocẽ ganha (%.2f) salários mínimo.", quantosSalarioMinimosUmaPessoaGanha);

    }
}

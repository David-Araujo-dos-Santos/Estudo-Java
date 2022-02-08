package estudo.principalJava.funcoes;

public class ConversaoDeTemperatura {
    public static void main(String args[]) {
        /* Converter graus Celsius e apresentar este convertido em graus Fahrenheit. A
        formula de conversão é: F = C∗(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit e C
        a temperatura em Celsius. As temperaturas em Celsius são: 32, 25, 45 e 42;*/
        double c=32;
        double c1=25;
        double c2=45;
        double c3=42;
        double F = c*(9.0 / 5.0) + 32.0;
        double F1 = c1*(9.0 / 5.0) + 32.0;
        double F2 = c2*(9.0 / 5.0) + 32.0;
        double F3 = c3*(9.0 / 5.0) + 32.0;
        System.out.println(F+"\n"+F1+"\n"+F2+"\n"+F3);

    }
}

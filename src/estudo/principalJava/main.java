package estudo.principalJava;
import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        try {
            String quest = JOptionPane.showInputDialog(null, "Iremos calcular a Sequencia!\nInforme um limete",
                    "Fibonacci", JOptionPane.YES_NO_CANCEL_OPTION);
            System.out.println("Limit informado: " + quest);
            boolean cond = true;

            while (cond) {
                Stream<Long> seq = Stream.iterate(new Long[] { 0L, 1L }, a -> new Long[] { a[1], a[0] + a[1] })
                        .map(p -> p[0]);

                System.out.println(" ------------------ CALCULANDO SEQUENCIA -------------------------");

                Thread.sleep(1000);
                System.out.println(Arrays.toString(seq.limit(Integer.parseInt(quest)).toArray()));

                JOptionPane.showMessageDialog(null, "SEQUENCIA FINALIZADA", "Fibonacci",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                String condit = JOptionPane.showInputDialog(null, "Deseja Calcular novamente?\n Digite s-sim ou n-nao",
                        "Fibonacci", JOptionPane.YES_NO_CANCEL_OPTION);
                cond = condit.equalsIgnoreCase("s") ? true : false;

                if (cond) {
                    quest = JOptionPane.showInputDialog(null,
                            "Iremos calcular a Sequencia Novamente!\nInforme um limete", "Fibonacci",
                            JOptionPane.YES_NO_CANCEL_OPTION);
                    System.out.println("Limit informado: " + quest);
                } else {
                    JOptionPane.showMessageDialog(null, "OPERAÇÃO FINALIZADA", "Fibonacci",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }
}
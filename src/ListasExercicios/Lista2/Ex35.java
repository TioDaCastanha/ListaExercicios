package ListasExercicios.Lista2;

import javax.swing.*;

public class Ex35 {
    public static void main(String[] args){

        int dia, opcao;
        float km, valorTotal;

        opcao = Integer.parseInt(JOptionPane.showInputDialog("--- Aluguel Carro ---\n" +
                                                             "Escolha uma opção\n" +
                                                             "1 - Carro Popular\n" +
                                                             "2 - Carro de Luxo"));
        dia = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos dias o Carro ficou alugado:"));
        km = Float.parseFloat(JOptionPane.showInputDialog("Informe quantos Km rodados:"));

        switch (opcao) {
            case 1 -> {
                if (km <= 100) {
                    valorTotal = (float) (km * 0.20) + (dia * 90);
                } else {
                    valorTotal = (float) (km * 0.10) + (dia * 90);
                }
                System.out.print("Valor a ser pago: R$" + valorTotal);
            }
            case 2 -> {
                if (km <= 200) {
                    valorTotal = (float) (km * 0.30) + (dia * 90);
                } else {
                    valorTotal = (float) (km * 0.25) + (dia * 90);
                }
                System.out.print("Valor a ser pago: R$" + valorTotal);
            }
        }

    }
}

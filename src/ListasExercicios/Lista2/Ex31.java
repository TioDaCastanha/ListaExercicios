package ListasExercicios.Lista2;

import javax.swing.*;

public class Ex31 {
    public static void main(String[] args){

        int jokenpo, cpu;
        String escolha;

        do {
            jokenpo = Integer.parseInt(JOptionPane.showInputDialog
                    ("--- JO KEN PO ---\n" +
                     "Escolha Um:\n" +
                     "1 - Pedra\n" +
                     "2 - Papel\n" +
                     "3 - Tesoura\n" +
                     "4 - Sair\n" +
                     "_________________\n"));
            do {
                cpu = (int)(Math.random() * 4);
            }while(cpu < 1);

            switch (cpu) {
                case 1 -> {
                    escolha = "Pedra";
                    if (jokenpo == 1) {
                        JOptionPane.showMessageDialog(null, String.format("CPU escolheu %s\n Você Empatou!!", escolha));
                    } else if (jokenpo == 2) {
                        JOptionPane.showMessageDialog(null, String.format("CPU escolheu %s\n Você Ganhou!!", escolha));
                    } else if (jokenpo == 3) {
                        JOptionPane.showMessageDialog(null, String.format("CPU escolheu %s\n Você Perdeu!!", escolha));
                    }
                }
                case 2 -> {
                    escolha = "Papel";
                    if (jokenpo == 1) {
                        JOptionPane.showMessageDialog(null, String.format("CPU escolheu %s\n Você Perdeu!!", escolha));
                    } else if (jokenpo == 2) {
                        JOptionPane.showMessageDialog(null, String.format("CPU escolheu %s\n Você Empatou!!", escolha));
                    } else if (jokenpo == 3) {
                        JOptionPane.showMessageDialog(null, String.format("CPU escolheu %s\n Você Ganhou!!", escolha));
                    }
                }
                case 3 -> {
                    escolha = "Tesoura";
                    if (jokenpo == 1) {
                        JOptionPane.showMessageDialog(null, String.format("CPU escolheu %s\n Você Ganhou!!", escolha));
                    } else if (jokenpo == 2) {
                        JOptionPane.showMessageDialog(null, String.format("CPU escolheu %s\n Você Perdeu!!", escolha));
                    } else if (jokenpo == 3) {
                        JOptionPane.showMessageDialog(null, String.format("CPU escolheu %s\n Você Empatou!!", escolha));
                    }
                }
            }
        }while (jokenpo != 4);

    }
}

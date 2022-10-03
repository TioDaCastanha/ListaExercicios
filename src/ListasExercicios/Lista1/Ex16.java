package ListasExercicios.Lista1;

import javax.swing.*;

public class Ex16 {
    public static void main(String[] args){

        int cigarros = Integer.parseInt(JOptionPane.showInputDialog("Quantos cigarros você fuma por dia?"));
        int anos = Integer.parseInt(JOptionPane.showInputDialog("A quantos anos você fuma?"));

        float tempoRestante = ((anos*365)*cigarros)/(float)1440;

        JOptionPane.showMessageDialog(null, String.format("Você já perdeu %.2f dias de vida!!", tempoRestante));

    }
}

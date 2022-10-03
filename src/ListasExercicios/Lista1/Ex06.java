package ListasExercicios.Lista1;

import javax.swing.*;

public class Ex06 {
    public static void main(String[] args){

        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));

        JOptionPane.showMessageDialog(null, String.format("O antecessor de %d é: %d\nO Sucessor de %d é: %d", num, num-1, num, num+1));

    }
}

package ListasExercicios.Lista1;

import javax.swing.*;

public class Ex04 {
    public static void main(String[] args){

        int num, num2;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor:"));

        JOptionPane.showMessageDialog(null, String.format("A soma entre %d e %d é: %d", num, num2, num + num2));
    }
}

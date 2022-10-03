package ListasExercicios.Lista1;

import javax.swing.*;

public class Ex07 {
    public static void main(String[] args){

        float num, dobro, terço;

        num = Float.parseFloat(JOptionPane.showInputDialog("Digite um numero: ").replace(',','.'));

        dobro = num*2;
        terço = num/3;

        JOptionPane.showMessageDialog(null, String.format("O Dobro de %.2f é: %.2f\n" +
                "A Terça parte de %.2f é: %.2f", num, dobro, num, terço));
    }
}

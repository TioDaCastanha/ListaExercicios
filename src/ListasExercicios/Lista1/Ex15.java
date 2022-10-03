package ListasExercicios.Lista1;

import javax.swing.*;

public class Ex15 {
    public static void main(String[] args){

        int dias;
        float salario;

        dias = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dias Trabalhados:"));

        salario = dias*(float)(8*25.00);

        JOptionPane.showMessageDialog(null, String.format("Você receberá R$%.2f", salario));

    }
}

package ListasExercicios.Lista1;

import javax.swing.*;

public class Ex03 {
    public static void main(String[] args){

        String nome;
        float salario;

        nome = JOptionPane.showInputDialog("Nome do Funcionário: ");
        salario = Float.parseFloat(JOptionPane.showInputDialog("Salário: ").replace(',','.'));

        JOptionPane.showMessageDialog(null, String.format("O funcionário %s tem um salário de R$%.2f em Setembro.",nome,salario));

    }
}

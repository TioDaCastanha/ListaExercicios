package ListasExercicios.Lista2;

import javax.swing.*;

public class Ex33 {
    public static void main(String[] args){

        float valorCasa, salario, valPrestacao;
        int anos;

        valorCasa = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da Casa Financiada:"));
        salario = Float.parseFloat(JOptionPane.showInputDialog("Informe seu Salário Bruto Mensal:"));
        anos = Integer.parseInt(JOptionPane.showInputDialog("Em quantos Anos pretende pagar?"));

        valPrestacao = valorCasa/(anos*12);

        if (valPrestacao <= salario/3.33){
            JOptionPane.showMessageDialog(null, String.format("Você pagará %.2f por mês em %d anos.", valPrestacao, anos));
        }else {
            JOptionPane.showMessageDialog(null, "Não é possivel liberar o financiamento!!");
        }

    }
}

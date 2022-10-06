package ListasExercicios.Lista2;

import javax.swing.*;

public class Ex29 {
    public static void main(String[] args){

        String nome;
        float salario, aumento;
        int anosTrabalho;

        nome = JOptionPane.showInputDialog("Qual o seu nome?");
        salario = Float.parseFloat(JOptionPane.showInputDialog("Qual o seu salário atual?"));
        anosTrabalho = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem de empresa?"));

        if (anosTrabalho <= 3){
            aumento = salario * (float)1.03;
            JOptionPane.showMessageDialog(null, String.format("Olá %s seu novo salário é de: R$%.2f", nome, aumento));
        }else if (anosTrabalho >= 10){
            aumento = salario * (float)1.20;
            JOptionPane.showMessageDialog(null, String.format("Olá %s seu novo salário é de: R$%.2f", nome, aumento));
        }else {
            aumento = salario * (float)1.125;
            JOptionPane.showMessageDialog(null, String.format("Olá %s seu novo salário é de: R$%.2f", nome, aumento));
        }

    }
}

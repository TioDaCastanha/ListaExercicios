package ListasExercicios.Lista2;

import javax.swing.*;

public class Ex27 {
    public static void main(String[] args){

        float nota1, nota2, media;

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 1:").replace(',','.'));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 2:").replace(',','.'));

        media = (nota1 + nota2)/2;

        if (media < 5.0){
            JOptionPane.showMessageDialog(null,"REPROVADO");
        }else if (media < 7.0){
            JOptionPane.showMessageDialog(null, "RECUPERAÇÃO");
        }else {
            JOptionPane.showMessageDialog(null,"APROVADO");
        }

    }
}

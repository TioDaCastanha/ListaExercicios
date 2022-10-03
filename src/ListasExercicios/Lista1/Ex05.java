package ListasExercicios.Lista1;

import javax.swing.*;

public class Ex05 {
    public static void main(String[] args){

        float nota1, nota2, media;

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a Nota 1:").replace(',','.'));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a Nota 2:").replace(',','.'));

        media = (nota1 + nota2)/2;

        JOptionPane.showMessageDialog(null, String.format("Sua Média é: %.2f", media));

    }
}

package ListasExercicios.Lista3;

import javax.swing.*;

public class Ex56 {
    public static void main(String[] args){

        int num = 0, soma = 0;

        JOptionPane.showMessageDialog(null, "Para encerrar digite 1111");

        while(num != 1111){

            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

            if (num != 1111) {
                soma += num;
            }
        }

        JOptionPane.showMessageDialog(null,"Programa encerrado!! A Soma total foi de: " + soma);

    }
}

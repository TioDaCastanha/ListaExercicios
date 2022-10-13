package ListasExercicios.Lista3;

import javax.swing.*;

public class Ex48 {
    public static void main(String[] args){

        int num, soma = 0, i = 0;

        while(i < 7){
            num = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero:"));
            soma += num;
            i++;
        }

        System.out.print("Resultado : "+ soma);

    }
}

package ListasExercicios.Lista3;

import javax.swing.*;

public class Ex44 {
    public static void main(String[] args){

        int firstNum, lastNum, increment;

        firstNum = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro Valor: "));
        lastNum = Integer.parseInt(JOptionPane.showInputDialog("Informe o ultimo valor: "));
        increment = Integer.parseInt(JOptionPane.showInputDialog("Informe o Incremento: "));

        while (firstNum <= lastNum){
            System.out.print(firstNum+" ");
            firstNum = firstNum + increment;
        }

        System.out.print("Acabou!");


    }
}


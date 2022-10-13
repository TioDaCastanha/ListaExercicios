package ListasExercicios.Lista3;

import javax.swing.*;

public class Ex45 {
    public static void main(String[] args){

        int firstNum, lastNum, increment;

        firstNum = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro Valor: "));
        lastNum = Integer.parseInt(JOptionPane.showInputDialog("Informe o ultimo valor: "));
        increment = Integer.parseInt(JOptionPane.showInputDialog("Informe o Incremento: "));

        if (firstNum < lastNum) {
            while (firstNum <= lastNum) {
                System.out.print(firstNum + " ");
                firstNum = firstNum + increment;
            }
        }else if (firstNum > lastNum) {
            while (firstNum >= lastNum) {
                System.out.print(firstNum + " ");
                firstNum = firstNum - increment;
            }
        } else {
            System.out.print("Numeros iguais!!");
        }

        System.out.print("Acabou!");

    }
}

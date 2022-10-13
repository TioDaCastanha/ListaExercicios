package ListasExercicios.Lista3;

import javax.swing.*;

public class Ex49 {
    public static void main(String[] args){

        int num, numPar = 0, numImpar = 0, i = 0;

        while (i < 6){
            num = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));

            if (num % 2 == 0){
                numPar++;
            }else {
                numImpar++;
            }

            i++;
        }

        System.out.printf("Existem %d numeros Ímpares e %d numeros Pares.", numImpar, numPar);

    }
}

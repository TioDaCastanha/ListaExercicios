package ListasExercicios.Lista3Parte2;

import javax.swing.*;

public class Ex67 {
    public static void main(String[] args){

        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));

        for (int i = 0; i <= num; i++){
            System.out.printf("%d ", i);
        }

        System.out.print("La vou eu!!");

    }
}

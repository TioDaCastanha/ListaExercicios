package ListasExercicios.Lista3Parte2;

import javax.swing.*;

public class Ex66 {
    public static void main(String[] args){

        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));

        for (int i = 0; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", num, i, (num * i));
        }

        System.out.print("Acabou!");

    }
}

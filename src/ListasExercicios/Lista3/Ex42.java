package ListasExercicios.Lista3;

import javax.swing.*;

public class Ex42 {
    public static void main(String[] args){

        int num, cont = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro: "));

        while (cont <= num){
            System.out.print(cont+ " ");
            cont++;
        }

        System.out.print("Lá vou eu!");
    }
}

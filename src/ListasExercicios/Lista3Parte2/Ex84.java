package ListasExercicios.Lista3Parte2;

import javax.swing.*;
import java.util.Random;

public class Ex84 {
    public static void main(String[] args){

        String[] nome = new String[9];
        int[] idade = new int[9];
        int num;
        Random rnd = new Random();

        //Preenche as posições sem o zero (1 a 15)
        for(int i = 0; i < 9; i++) {
            do {
                num = rnd.nextInt(101);
            }while(num == 0);

            idade[i] = num;
            nome[i] = JOptionPane.showInputDialog("Informe um nome: ");
        }

        for(int i = 0; i < 9; i++) {
            if(idade[i] < 18) {
                System.out.println(nome[i] + " "+ idade[i]+ " Anos.");
            }
        }

    }
}

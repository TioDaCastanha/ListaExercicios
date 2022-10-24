package ListasExercicios.Lista3Parte2;

import javax.swing.*;
import java.util.Random;

public class Ex77 {
    public static void main(String[] args){

        String[] vetor = new String[7];

        for(int i = 0; i < 7; i++) {
            vetor[i] = JOptionPane.showInputDialog("Informe um nome: ");
        }

        for(int i = 6; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }
}

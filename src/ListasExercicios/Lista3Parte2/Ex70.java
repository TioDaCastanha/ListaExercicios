package ListasExercicios.Lista3Parte2;

import javax.swing.*;

public class Ex70 {
    public static void main(String [] args){

        int ultimo = 0, penultimo = 1, proximo = 0;

        for (int i = 0; i < 10; i++) {
            if (i == 0){
                System.out.print(penultimo + " ");
                proximo = ultimo + penultimo;

            }else {
                System.out.print(proximo + " ");
                ultimo = penultimo;
                penultimo = proximo;
                proximo = ultimo + penultimo;

            }
        }
    }
}

package ListasExercicios.Lista3Parte2;

import javax.swing.*;

public class Ex69 {
    public static void main(String [] args){

        int termo, razao, ultimo, soma;

        termo = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro termo da PA:"));
        razao = Integer.parseInt(JOptionPane.showInputDialog("Informe a Razão da PA:"));

        ultimo = termo + (10-1) * razao;

        System.out.print("PA (");

        for (int i = termo; i <= ultimo; i += razao){
            if (i < ultimo) {
                System.out.print(i + ", ");
            }else {
                System.out.print(i + ") ");
            }
        }

        soma = ((termo+ultimo)*10)/2;

        System.out.println(" ");
        System.out.print("A soma dos termos é: "+ soma);

    }
}

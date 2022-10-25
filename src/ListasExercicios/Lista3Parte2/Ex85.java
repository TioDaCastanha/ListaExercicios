package ListasExercicios.Lista3Parte2;

import javax.swing.*;
import java.util.Locale;

public class Ex85 {
    public static void main(String[] args){

        String[] nome = new String[5];
        String[] sexo = new String[5];
        Float[] salario = new Float[5];

        for(int i = 0; i < 5; i++) {
            nome[i] = JOptionPane.showInputDialog("Informe o nome: ");
            sexo[i] = JOptionPane.showInputDialog("Informe o Sexo: ").toLowerCase(Locale.ROOT);
            salario[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe o Salario: "));
        }

        for(int i = 0; i < 5; i++) {
            if(sexo[i].contentEquals("feminino") && salario[i] >= 5000) {
                System.out.println(nome[i] + ", salario de: R$"+ salario[i]);
            }
        }

    }
}

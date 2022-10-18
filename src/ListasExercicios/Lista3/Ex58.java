package ListasExercicios.Lista3;

import javax.swing.*;

public class Ex58 {
    public static void main(String[] args){

        int idade = 0, soma = 0, qtdAluno = 0;

        JOptionPane.showMessageDialog(null, "Informe idade 999 para finalizar!");

        while(idade != 999){

            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do Aluno: "));

            if (idade != 999) {
                soma += idade;
            }

            qtdAluno++;
        }

        System.out.println("Quantidade Alunos: "+ qtdAluno);
        System.out.println("Média de Idade: "+ (float)soma / qtdAluno);

    }
}

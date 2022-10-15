package ListasExercicios.Lista3;


import javax.swing.*;

public class Ex53 {
    public static void main(String[] args){

        float mediaTotal = 0, mediaHomens = 0;
        int idade, qtdHomens = 0, qtdMulheres = 0, mulher20 = 0, i = 0;
        String sexo;

        while (i < 5){

            sexo = JOptionPane.showInputDialog("Informe o sexo:").toLowerCase();
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:"));

            switch (sexo){
                case "feminino" -> {

                    qtdMulheres++;

                    if (idade >= 20){
                        mulher20++;
                    }

                    mediaTotal += idade;
                }

                case "masculino" -> {

                    qtdHomens++;
                    mediaHomens += idade;
                    mediaTotal += idade;

                }
            }

            i++;
        }

        mediaHomens /= qtdHomens;
        mediaTotal /= i;

        System.out.println("Total de homens cadastrados: "+ qtdHomens);
        System.out.println("Total de mulheres cadastradas: "+ qtdMulheres);
        System.out.println("Media de Idade Total: "+ mediaTotal);
        System.out.println("A média de idade dos Homens: "+ mediaHomens);
        System.out.println("Mulheres com mais de 20: "+ mulher20);

    }
}

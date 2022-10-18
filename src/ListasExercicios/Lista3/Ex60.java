package ListasExercicios.Lista3;

import javax.swing.*;

public class Ex60 {
    public static void main(String[] args){

        String sexo, nome, nomeVelho = " ", nomeMJovem = " ";
        float mediaIdade;
        int idade, qtdHomens30 = 0, qtdMulher18 = 0, somaIdade = 0, maiorIdade = 0, mulherJovem = 0, cont = 0;
        boolean continuar = true, primeira = true;

        while (continuar){
            nome = JOptionPane.showInputDialog("Informe o Nome:");
            sexo = JOptionPane.showInputDialog("Informe o Sexo:");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade:"));

            somaIdade += idade;

            //caso idade seja maior que a ultima informada
            if (idade > maiorIdade){
                maiorIdade = idade;
                nomeVelho = nome;
            }

            //Se for mulher
            if(sexo.equalsIgnoreCase("feminino")){

                //Contador mulheres menores de 18
                if(idade <= 18){
                    qtdMulher18++;
                }

                //Caso for a primeira vai jogar a idade na variável
                if (primeira){
                    mulherJovem = idade;
                    nomeMJovem = nome;
                    primeira = false;

                //Se não for a primeira vai entrar na condição abaixo
                }else if (idade < mulherJovem){
                    mulherJovem = idade;
                    nomeMJovem = nome;
                }

            //Se for homem
            }else{
                if(idade >= 30) {
                    qtdHomens30++;
                }
            }

            //contador
            cont++;

            //Opção para continuar
            continuar = JOptionPane.showInputDialog("Deseja continuar Sim/Não?").equalsIgnoreCase("Sim");
        }

        mediaIdade = (float)somaIdade/cont;

        System.out.println("A Pessoa mais velha é: "+ nomeVelho);
        System.out.println("A Mulher mais Jovem é: "+ nomeMJovem);
        System.out.println("Quantidade de Mulheres com menos de 18: "+ qtdMulher18);
        System.out.println("Quantidade de Homens com mais de 30: "+ qtdHomens30);
        System.out.println("A Média de Idade é: "+ mediaIdade);

    }
}
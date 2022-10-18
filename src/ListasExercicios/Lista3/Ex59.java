package ListasExercicios.Lista3;

import javax.swing.*;

public class Ex59 {
    public static void main(String[] args){

        String sexo;
        float mediaIdadeH;
        int idade, maiorIdade = 0, qtdHomens = 0, mulherJovem = 0, somaH = 0;
        boolean continuar = true, primeira = true;

        while (continuar){
            sexo = JOptionPane.showInputDialog("Informe o Sexo:");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade:"));

            //caso idade seja maior que a ultima informada
            if (idade > maiorIdade){
                maiorIdade = idade;
            }

            //Se for mulher
            if(sexo.equalsIgnoreCase("feminino")){
                //Caso for a primeira vai jogar a idade na variável
                if (primeira){
                    mulherJovem = idade;
                    primeira = false;
                //Se não for a primeira vai entrar na condição abaixo
                }else if (idade < mulherJovem){
                    mulherJovem = idade;
                }
            //Se for homem
            }else{
                qtdHomens++;
                somaH += idade;
            }

            //Opção para continuar
            continuar = JOptionPane.showInputDialog("Deseja continuar Sim/Não?").equalsIgnoreCase("Sim");
        }

        mediaIdadeH = (float)somaH/qtdHomens;

        System.out.println("A Maior idade lida foi: "+ maiorIdade);
        System.out.println("Foram Cadastrados "+ qtdHomens+ " Homens.");
        System.out.println("A Idade da mulher mais jovem é: "+ mulherJovem);
        System.out.println("A Média de Idade entre os Homens é: "+ mediaIdadeH);

    }
}

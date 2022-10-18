package ListasExercicios.Lista3Parte2;

import javax.swing.*;

public class Ex68 {
    public static void main(String[] args){

        float peso, mediaMulher = 0, maiorHomem = 0;
        String sexo;
        int qtdMulher = 0, homens100 = 0;

        for(int i = 0; i < 8; i++){
            sexo = JOptionPane.showInputDialog("Informe o sexo:");
            peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o peso:"));

            if(sexo.equalsIgnoreCase("feminino")){
                qtdMulher++;
                mediaMulher+=peso;

            }else {
                if(peso >= 100){
                    homens100++;
                }
                if(peso > maiorHomem){
                    maiorHomem = peso;
                }

            }

        }

        mediaMulher /= qtdMulher;

        System.out.println("Quantidade de Mulheres Cadastradas: "+ qtdMulher);
        System.out.println("Quantidade de Homens com mais de 100Kg: "+ homens100);
        System.out.println("Média de peso entre as mulheres: "+ mediaMulher);
        System.out.println("Maior peso entre os homens: "+ maiorHomem);

    }
}

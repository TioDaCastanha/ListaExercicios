package ListasExercicios.Lista3Parte2;

import javax.swing.*;

public class Ex63 {
    public static void main(String[] args){

        float media;
        int num, cont = 0, menorNum = 0, somaNum = 0, pares = 0;
        boolean continuar, primeiro = true;

        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade:"));

            if (primeiro){
                menorNum = num;
                primeiro = false;

            }else if(num < menorNum){
                menorNum = num;
            }

            if(num % 2 == 0){
                pares++;
            }

            somaNum += num;
            cont++;

            //Opção para continuar
            continuar = JOptionPane.showInputDialog("Deseja continuar Sim/Não?").equalsIgnoreCase("Sim");

        }while(continuar);

        media = (float) somaNum / cont;

        System.out.println("O total é: "+ somaNum);
        System.out.println("A Média é: "+ media);
        System.out.println("O Menor numero é: "+ menorNum);
        System.out.println("Quantos numeros Par: "+ pares);

    }
}

package ListasExercicios.Lista3;

import javax.swing.*;
import java.util.Random;

public class Ex55 {
    public static void main(String[] args){

        int player, cpuNumero, vida = 4;

        //Variável para utilizar a função Random
        Random cpuEscolha = new Random();

        while(vida > 0){

            //Definir o Range passando o valor como parâmetro ou uma list
            cpuNumero = cpuEscolha.nextInt(11);
            player = Integer.parseInt(JOptionPane.showInputDialog("--- Tente adivinhar o numero ---\nVocê tem apenas "+ vida +" Chances\nEscolha um numero de 1 a 10\n"));

            if (player == cpuNumero){
                JOptionPane.showMessageDialog(null, "Parabéns Você acertou!!!\nA CPU escolheu o numero: "+ cpuNumero);
                break;
            }else {
                JOptionPane.showMessageDialog(null, "Que pena você errou!!! Tente novamente.\nA CPU escolheu o numero: "+ cpuNumero);
                vida--;

                if (vida == 0){
                    JOptionPane.showMessageDialog(null, "Game Over!!");
                }
            }
        }

    }
}
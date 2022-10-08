package ListasExercicios.Lista2;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ex32 {
    public static void main(String[] args){

        int player, cpuNumero;
        boolean repetir;
        //Caso queira escolher numeros Aleatórios específicos se cria um List
        //List<Integer> cpu = Arrays.asList(1,5,10,4,3,6);

        //Variável para utilizar a função Random
        Random cpuEscolha = new Random();

        do {

            //Definir o Range passando o valor como parâmetro ou uma list
            cpuNumero = cpuEscolha.nextInt(5);

            player = Integer.parseInt(JOptionPane.showInputDialog("--- Tente adivinhar o numero ---\nEscolha um numero de 1 a 6"));
            if (player == cpuNumero){
                JOptionPane.showMessageDialog(null, "Parabéns Você acertou!!!\nA CPU escolheu o numero: "+ cpuNumero);
                repetir = false;
            }else {
                JOptionPane.showMessageDialog(null, "Que pena você errou!!!\nA CPU escolheu o numero: "+ cpuNumero);
                repetir = true;
            }

        } while(repetir);

    }
}

package ListasExercicios.Lista2;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Ex32 {
    public static void main(String[] args){

        int player, cpuNumero;
        boolean repetir;
        List<Integer> cpu = Arrays.asList(1,2,3,4,5,6);
        Random cpuEscolha = new Random();

        do {

            cpuNumero = cpuEscolha.nextInt(cpu.size());

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

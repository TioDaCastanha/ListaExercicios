package ListasExercicios.Lista2;

import javax.swing.*;

public class Ex34 {
    public static void main(String[] args){

        float peso = Float.parseFloat(JOptionPane.showInputDialog("Informe o Peso:").replace(',','.'));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe a Altura").replace(',','.'));

        float imc = peso / (altura*altura);

        if(imc < 18.5){
            JOptionPane.showMessageDialog(null, "Você está abaixo do Peso");
        }else if (imc >= 18.5 && imc < 25){
            JOptionPane.showMessageDialog(null, "Você está no Peso ideal");
        }else if (imc >= 25 && imc < 30){
            JOptionPane.showMessageDialog(null, "Você está com Sobrepeso");
        }else if (imc >= 30 && imc < 40){
            JOptionPane.showMessageDialog(null, "Você está Obeso");
        }else {
            JOptionPane.showMessageDialog(null, "Você está com Obesidade Mórbida");
        }

    }
}

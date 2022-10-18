package ListasExercicios.Lista3;

import javax.swing.*;

public class Ex57 {
    public static void main(String[] args){

        String sexo;
        float salario, somaH = 0, somaM = 0;
        boolean continuar = true;

        while (continuar){
            sexo = JOptionPane.showInputDialog("Informe o Sexo do Funcionário:");
            salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o Salario do funcionário:").replace(',','.'));

            if(sexo.equalsIgnoreCase("feminino")){
                somaM += salario;
            }else {
                somaH += salario;
            }

            continuar = JOptionPane.showInputDialog("Deseja continuar Sim/Não?").equalsIgnoreCase("Sim");
        }

        System.out.println("Total pago entre os Homens: R$"+ somaH);
        System.out.println("Total pago entre as Mulheres: R$"+ somaM);

    }
}

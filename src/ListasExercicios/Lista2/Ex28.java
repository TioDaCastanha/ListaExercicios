package ListasExercicios.Lista2;

import javax.swing.*;

public class Ex28 {
    public static void main(String[] args){

        float width, depth, area;

        width = Float.parseFloat(JOptionPane.showInputDialog("Informe a largura do terreno em m:").replace(',','.'));
        depth = Float.parseFloat(JOptionPane.showInputDialog("Informe a profundidade do terreno em m:").replace(',','.'));

        area = width * depth;

        if (area < 100){
            JOptionPane.showMessageDialog(null, "TERRENO POPULAR");
        }else if (area >= 100 && area <= 500){
            JOptionPane.showMessageDialog(null,"TERRENO MASTER");
        }else {
            JOptionPane.showMessageDialog(null,"TERRENO VIP, BJUS ME LIGA");
        }

    }
}

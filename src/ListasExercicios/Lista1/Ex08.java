package ListasExercicios.Lista1;

import javax.swing.*;

public class Ex08 {
    public static void main(String[] args){

        float m, km, hm, dam, dm, cm, mm;

        m = Float.parseFloat(JOptionPane.showInputDialog("Informe a distância percorrida em Metros:"));

        km = m/1000;
        hm = m/100;
        dam = m/10;
        dm = m*10;
        cm = m*100;
        mm = m*1000;

        JOptionPane.showMessageDialog(null, String.format("A Distância Percorrida de %.2fm corresponde a:\n" +
                "%.3fKm \t \t \t %.2fdm \n" +
                "%.2fHm \t \t \t %.2fcm \n" +
                "%.2fDam \t \t \t %.2fmm", m,km,dm,hm,cm,dam,mm));

    }
}

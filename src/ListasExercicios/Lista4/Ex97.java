package ListasExercicios.Lista4;

import java.util.Random;

public class Ex97 {
    public static void main(String[] args){
        Random rdm = new Random();
        System.out.println("O Maior numero é o "+ comparador(rdm.nextInt(101), rdm.nextInt(101), rdm.nextInt(101)));
    }

    public static int comparador(int num1, int num2, int num3) {
        if(num1 > num2 && num1 > num3){
            return num1;
        }else if (num2 > num3){
            return num2;
        }else{
            return num3;
        }

    }
}

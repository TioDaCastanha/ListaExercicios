package ListasExercicios.Lista3Parte2;

import java.util.*;

public class Ex83 {
    public static void main(String[] args){

        List<Integer> vetor = new ArrayList<>();
        Random rnd = new Random();

        //Preenche as posições sem o zero.
        for(int i = 0; i < 20; i++) {
            vetor.add(rnd.nextInt(100));
        }

        System.out.println(vetor);

        Collections.sort(vetor);

        System.out.println(vetor);

    }
}

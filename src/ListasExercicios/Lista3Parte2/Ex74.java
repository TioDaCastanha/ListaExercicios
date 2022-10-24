package ListasExercicios.Lista3Parte2;

public class Ex74 {
    public static void main(String[] args){

        int[] vetor = new int[10];

        for(int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                vetor[i] = 5;
            }else{
                vetor[i] = 3;
            }
        }

        for(int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
}

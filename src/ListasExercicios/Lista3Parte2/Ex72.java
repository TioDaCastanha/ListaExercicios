package ListasExercicios.Lista3Parte2;

public class Ex72 {
    public static void main(String[] args){

        int[] vetor = new int[10];
        int sum = 5;

        for(int i = 0; i < 10; i++) {
            vetor[i] = sum;
            sum += 5;
        }

        for(int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
}

package ListasExercicios.Lista3Parte2;

public class Ex75 {
    public static void main(String[] args){

        int[] vetor = new int[16];
        int sum = 5;

        for(int i = 0; i < 16; i++) {
            if(i == 0 || i == 1) {
                vetor[i] = 1;
            }else {
                vetor[i] = vetor[i - 1] + vetor[i - 2];
            }
        }

        for(int i = 0; i < 16; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
}

package ListasExercicios.Lista3Parte2;

public class Ex73 {
    public static void main(String[] args){

        int[] vetor = new int[10];
        int sub = 9;

        for(int i = 0; i < 10; i++) {
            vetor[i] = sub;
            sub--;
        }

        for(int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

    }
}

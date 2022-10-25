package ListasExercicios.Lista3Parte2;

import java.util.Random;

public class Ex82 {
    public static void main(String[] args){

        int[] vetorNota = new int[10];
        int[] maior = new int[10];
        int num, maiorNota = 0, qtdAcimaMedia = 0, soma = 0, mediaTurma = 0;
        Random rnd = new Random();

        //Preenche as posições sem o zero.
        for(int i = 0; i < 10; i++) {
            do {
                num = rnd.nextInt(101);
            }while(num == 0);

            vetorNota[i] = num;

            soma += vetorNota[i];

            //Verifica qual foi a maior nota informada
            if(vetorNota[i] > maiorNota){
                maiorNota = vetorNota[i];
            }
        }

        mediaTurma = soma/ vetorNota.length;

        //Contador dos alunos acima da média da turma
        for (int i = 0; i < 10; i++) {
            if (vetorNota[i] > mediaTurma) {
                qtdAcimaMedia++;
            }
        }

        //Armazena posições com a maior nota (caso haja repetições)
        for(int i = 0; i < 10; i++) {
            if(vetorNota[i] == maiorNota){
                maior[i] = i;
            }
        }

        System.out.println("A Média da turma é: "+ mediaTurma);
        System.out.println("Alunos acima da média:  "+ qtdAcimaMedia);
        System.out.println("A maior nota digitada foi: "+ maiorNota);
        System.out.print("Posição na qual a maior nota foi encontrada: ");

        for(int i = 0; i < maior.length; i++) {
            if (maior[i] != 0) {
                System.out.print(maior[i] + " ");
            }
        }

    }
}

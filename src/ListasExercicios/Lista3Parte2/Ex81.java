package ListasExercicios.Lista3Parte2;

import java.util.Random;

public class Ex81 {
    public static void main(String[] args){

        int[] vetorIdade = new int[8];
        int[] maior = new int[8];
        int[] maior25 = new int[8];
        int num, maiorIdade = 0, indiceMaior, soma = 0;
        Random rnd = new Random();

        //Preenche as posições sem o zero.
        for(int i = 0; i < 8; i++) {
            do {
                num = rnd.nextInt(101);
            }while(num == 0);

            vetorIdade[i] = num;

            soma += vetorIdade[i];

            //Armazena as posições que foram encontradas as idades maiores que 25
            if (vetorIdade[i] > 25){
                maior25[i] = i;
            }

            //Verifica qual foi a maior Idade informada
            if(vetorIdade[i] > maiorIdade){
                maiorIdade = vetorIdade[i];
            }
        }

       //Armazena posições com a maior idade (caso haja repetições)
        for(int i = 0; i < 8; i++) {
            if(vetorIdade[i] == maiorIdade){
                maior[i] = i;
            }
        }

        System.out.println("A Média das idades é: "+ soma/vetorIdade.length);
        System.out.print("Posições em que estão as pessoas maiores que 25:  ");

        for(int i = 0; i < maior25.length; i++) {
            if (maior25[i] != 0) {
                System.out.print(maior25[i] + " ");
            }
        }

        System.out.println("\nA maior idade digitada foi: "+ maiorIdade);
        System.out.print("Posição na qual a maior idade foi encontrada: ");

        for(int i = 0; i < maior.length; i++) {
            if (maior[i] != 0) {
                System.out.print(maior[i] + " ");
            }
        }

    }
}

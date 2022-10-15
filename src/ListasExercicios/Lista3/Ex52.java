package ListasExercicios.Lista3;

import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        float media = 0;
        int idade, maior18 = 0, menor5 = 0, maiorIdade = 0, i = 0;

        while(i < 10){
            System.out.print("Digite uma Idade: ");
            idade = in.nextInt();

            media += idade;

            if (idade >= 18){
                maior18++;
            }

            if (idade <= 5){
                menor5++;
            }

            if (idade > maiorIdade){
                maiorIdade = idade;
            }

            i++;

        }

        media /= i;

        System.out.println("A média de idade do grupo é: "+ media);
        System.out.println("Pessoas maiores de 18 anos: "+ maior18);
        System.out.println("Pessoas menores de 5 anos: "+ menor5);
        System.out.println("A maior Idade informada foi: "+ maiorIdade);

    }
}

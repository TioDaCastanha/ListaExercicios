package ListasExercicios.Lista3;

public class Ex46 {
    public static void main(String[] args){

        int num = 6, soma = 0;

        while (num <= 100){
            soma = num + soma;
            num = num + 2;
        }

        System.out.print("O Resultado é: "+ soma);

    }
}

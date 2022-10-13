package ListasExercicios.Lista3;

public class Ex47 {
    public static void main(String[] args){

        int num = 500, soma = 0;

        while (num >= 0){
            soma = num + soma;
            num = num - 50;
        }

        System.out.print("O Resultado é: "+ soma);
    }
}

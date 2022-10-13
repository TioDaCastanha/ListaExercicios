package ListasExercicios.Lista3;

public class Ex43 {
    public static void main(String[] args){

        int num = 30;

        while(num >= 0) {
            if (num % 4 == 0 && num != 0) {
                System.out.print("[" + num + "]" + " ");
            } else {
                System.out.print(num + " ");
            }
            num--;
        }

        System.out.print("Finish Him!!");
    }
}

package ListasExercicios.Lista4;

public class Ex89 {
    public static void main(String[] args){
        gerador("Aprendendo Rust Um dia!!!", 3, 2);

    }

    public static void gerador(String print, int reps, int borda) {
        String bordaTipo;

        switch (borda){
            case 1:
                bordaTipo = "+---------=========---------+";
            break;
            case 2:
                bordaTipo = "~~~~~~~~~~::::::~~~~~~~~~";
            break;
            case 3:
                bordaTipo = "<<<<<<<<<--------->>>>>>>>>";
            break;
            default:
                bordaTipo = "";
        }

        System.out.println(bordaTipo);
        for(int i = 0; i < reps; i++) {
            System.out.println("  "+print);
        }
        System.out.print(bordaTipo);
    }
}

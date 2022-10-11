import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("");
        float metros = entrada.nextFloat();
        entrada.close();
        float centimetros = metros * 100;

        System.out.print(centimetros);

    }

}

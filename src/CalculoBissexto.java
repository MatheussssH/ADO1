import java.util.Scanner;

public class CalculoBissexto {
    public static void main(String[] args) {

        int ano;

        Scanner bi = new Scanner(System.in);

        System.out.println("Digite o ano e veja se ele é bissexto:");
        ano = bi.nextInt();

        if ((ano % 400 == 0 || ano % 4 == 0)) {

            System.out.println("o ano é bissexto...");

        } else {

            System.out.println("o ano não é bissexto...");
        }
        bi.close();

    }

}

import java.util.Scanner;

public class CalculoDesconto {

    public static void main(String[] args) {

        float v1, desconto, vd;

        Scanner valor = new Scanner(System.in);

        System.out.println("\nOlá cliente, digite o valor da sua compra e veja o desconto disponivel: ");
        v1 = valor.nextFloat();

        if (v1 >= 300) {
            desconto = (v1 * 20 / 100);
            vd = v1 - desconto;

            System.out.println(
                    "\nParabéns! Você recebeu um desconto de 20% (R$" + desconto + "), o valor total ficou R$" + vd
                            + ", Volte sempre!");

        } else {
            desconto = (v1 * 15 / 100);
            vd = v1 - desconto;

            System.out
                    .println("\nParabéns! Você recebeu um desconto de 15% (R$" + desconto + "), o valor ficou R$" + vd +
                            ", Volte sempre!");

        }
        valor.close();

    }

}

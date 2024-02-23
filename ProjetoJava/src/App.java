import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double valorUm;
        Double valorDois;
        String operacao;
        boolean continuar;

    try {
        do {
            System.out.println("Digite o primeiro valor: ");
            valorUm = scanner.nextDouble();

            System.out.println("Digite uma das operaçoes ( +, -, / ou * ): ");
            operacao = scanner.next();

            System.out.println("Digite o segundo valor: ");
            valorDois = scanner.nextDouble();

            System.out.println("Resultado: " + realizarCalculo(valorUm, valorDois, operacao));

            continuar = verificarNovaOperacao();

            scanner.close();
        } while (continuar);
    } catch (InputMismatchException ex) {
        System.out.println("Os valores para calculo devem ser numericos!");
    }

       

    }

    public static boolean verificarNovaOperacao() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Desejar realizar uma nova operacao ? (S ou N)");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }

    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao){
        Double respostaCalculo = 0.0;

        switch (operacao) {
          case "+":
            respostaCalculo = valorUm + valorDois;
            break;

          case "-":
            respostaCalculo = valorUm - valorDois;
            break;

          case "/":
            respostaCalculo = valorUm / valorDois;
            break;

          case "*":
            respostaCalculo = valorUm * valorDois;
            break;

          default:
            System.out.println("Operaçao e invalida!");
        }

        return respostaCalculo;
    }
}

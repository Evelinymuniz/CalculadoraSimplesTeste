import java.util.Scanner;
public class CalculadoraSimples {

    public static void main(String[] args) {
        double n1, n2;
        int opcao;
        double soma, subtracao, multiplicacao, divisao;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o preimeiro valor: ");
        n1 = sc.nextDouble();
        System.out.println("Digite o segundo valor: ");
        n2 = sc.nextDouble();

        System.out.println("###### Selecione uma operação ######");

        System.out.println("(1) - SOMA");
        System.out.println("(2) - SUBTRAÇÃO");
        System.out.println("(3) - MULTIPLICAÇÃO");
        System.out.println("(4) - DIVISÃO");

        System.out.println("######## Digite sua opção: ########");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                soma = n1 + n2;
                System.out.println("A soma é : " + soma);
                break;
            case 2:
                subtracao = n1 - n2;
                System.out.println("A subtração é : " + subtracao);
                break;
            case 3:
                multiplicacao = n1 * n2;
                System.out.println("A MULTIPLICAÇÃO é : " + multiplicacao);
                break;
            case 4:
                divisao = n1 / n2;
                System.out.println("A DIVISÃO é : " + divisao);
                break;
            default:
                System.out.println("Operação invalida");

        }
    }
}

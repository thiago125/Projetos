import java.util.*;

public class CalcTest {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double n1, n2;
		char operacao;

		System.out.println("Escolha sua operação [+ * / -]: ");
		operacao = ler.nextLine().charAt(0);

		System.out.println("Entre com o primeiro numero: ");
		n1 = ler.nextDouble();
		System.out.println("Entre com o segundo numero: ");
		n2 = ler.nextDouble();

		switch (operacao) {
		case '+':
			System.out.printf("%.2f + %.2f = %.2f", n1, n2, n1 + n2);
			break;
		case '*':
			System.out.printf("%.2f * %.2f = %.2f", n1, n2, n1 * n2);
			break;
		case '/':
			System.out.printf("%.2f / %.2f = %.2f", n1, n2, n1 / n2);
			System.out.printf("O resto da divisão é %.2f % %.2f", n1 % n2);
			break;
		case '-':
			System.out.printf("%.2f - %.2f = %.2f", n1, n2, n1 - n2);
			break;

		default:
			System.out.println("Opção de operacao inválida!");
		}

	}
}

// PESQUISAR FORMATAÇÃO DE NUMEROS REAIS PELO PRINTF
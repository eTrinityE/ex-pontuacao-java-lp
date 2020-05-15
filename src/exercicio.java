import java.util.Locale;
import java.util.Scanner;

public class exercicio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdcompra, atrasopgt;
		double ticketm;
		char metodopgt;
		
		//Cabecalho
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ULTIMO ANO");
		
		//Leitura do volume
		System.out.printf("%n");
		System.out.println("Quantas compras o cliente fez no ultimo ano?");
		qtdcompra = sc.nextInt();
		
		System.out.println("Qual foi o ticket médio?");
		ticketm = sc.nextDouble();
		
		//Leitura dos outros dados
		System.out.printf("%n");
		System.out.println("Quantas vezes o cliente atrasou pagamento?");
		atrasopgt = sc.nextInt();
		
		System.out.println("A maioria das compras foi em dinheiro, cartão ou boleto (D/C/B)?");
		metodopgt = sc.next().charAt(0);
		
		sc.close();
	}

}

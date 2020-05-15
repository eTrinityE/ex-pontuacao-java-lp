import java.util.Locale;
import java.util.Scanner;

public class exercicio {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdcompra, atrasopgt, scorevdc;
		double ticketm, valortotalgasto;
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
		
		//Score de volume de compras
		valortotalgasto = qtdcompra * ticketm;
		
		if (qtdcompra == 0) {
			scorevdc = 0;
		} else if(qtdcompra > 0 && qtdcompra <= 2 && valortotalgasto < 3000) {
			scorevdc = 20; 
		} else if(qtdcompra > 2 && valortotalgasto < 3000) {
			scorevdc = 40;
		} else {
			scorevdc = 60;
		}
		
		System.out.printf("Score de volume de compras : %d pontos %n", scorevdc);
		
		
		
		sc.close();
	}

}

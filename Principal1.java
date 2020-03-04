import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		double horas, dinheiro, salario;
		
		System.out.println("Informe seu nome: \n");
		nome = teclado.next();
		System.out.println("Informe o número de horas trabalhadas: \n");
		horas = Double.parseDouble(teclado.next());
		System.out.println("Informe quanto você ganha por hora: \n");
		dinheiro = Double.parseDouble(teclado.next());
		
		salario = horas * dinheiro;
		
		System.out.println("Seu nome é: "+nome+"\nVocê trabalhou "+horas+" horas\nSeu salário é: "+salario);
	}

}

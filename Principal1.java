import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		double horas, dinheiro, salario;
		
		System.out.println("Informe seu nome: \n");
		nome = teclado.next();
		System.out.println("Informe o n�mero de horas trabalhadas: \n");
		horas = Double.parseDouble(teclado.next());
		System.out.println("Informe quanto voc� ganha por hora: \n");
		dinheiro = Double.parseDouble(teclado.next());
		
		salario = horas * dinheiro;
		
		System.out.println("Seu nome �: "+nome+"\nVoc� trabalhou "+horas+" horas\nSeu sal�rio �: "+salario);
	}

}

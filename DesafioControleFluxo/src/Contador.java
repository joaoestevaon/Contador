import java.util.Scanner;

public class Contador{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um número inteio: ");
		int parametroUm = sc.nextInt();
		System.out.println("Escreva outro número inteio: ");
		int parametroDois = sc.nextInt();
		
		
		try {
			contar(parametroUm, parametroDois);
		}catch(ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
		}
		int contagem = parametroDois - parametroUm;
		
		//realizar o for para imprimir os números com base na variável contagem
		for(int i = 0;i < contagem;i++) {
			System.out.println("Imprindo o número "+(i+1+parametroUm));
		}
	}
	
	public static class ParametrosInvalidosException extends Exception {
		public ParametrosInvalidosException(String message) {
			super(message);
		}
	}
}
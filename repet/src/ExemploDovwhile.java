// ExemploDoWhile.java
//import java.util.Random; que é uma classe que gera números aleatórios;
import java.util.Random;
public class ExemploDovwhile {
public static void main(String[] args) {
	
		System.out.println("Discando...");
		
		do {
		
			System.out.println("Telefone tocando");
		
		}while(tocando());
		
		System.out.println("Alô !!!");
	}
    //método que retorna um valor booleano
    //se a pessoa atendeu, retorna true
	private static boolean tocando() {
        //gera um número aleatório entre 0 e 2
        //se o número for 1, a pessoa atendeu
        //se o número for 0 ou 2, a pessoa não atendeu
        //retorna o valor booleano

		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? " + atendeu);
		//negando o ato de continuar tocando
		return ! atendeu;
	}
}
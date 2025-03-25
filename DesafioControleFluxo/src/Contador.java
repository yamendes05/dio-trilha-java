
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm =terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
        
        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        //para tratar a exceção lançada pelo método contar
        }catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            //lançar a exceção ParametrosInvalidosException
            throw new Contador().new ParametrosInvalidosException();
        }
		
		int contagem = parametroDois - parametroUm;

        for(int i=0; i<=contagem; i++){
            System.out.println("Imprimindo o número"+ i);
        }
		//realizar o for para imprimir os números com base na variável contagem
	}//fim do método contar
    public class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException() {
            //construtor da classe ParametrosInvalidosException
            super("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}
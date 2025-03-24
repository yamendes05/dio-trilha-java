
    // ExemploWhile.java

// import java.util.concurrent.ThreadLocalRandom que é uma classe que gera números aleatórios;
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
public static void main(String[] args) {
	double mesada = 50.0;
    //enquanto a mesada for maior que 0
        while(mesada>0) {
            //vou pegar um doce de valor aleatorio
            Double valorDoce = valorAleatorio();
            //se o valor do doce for maior que a mesada
            if(valorDoce > mesada)
            //o valor do doce é igual a mesada
                valorDoce = mesada;
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        

   }
   private static double valorAleatorio() {
    //gera um valor aleatório entre 2 e 8
	return ThreadLocalRandom.current().nextDouble(2, 8);
   }
}


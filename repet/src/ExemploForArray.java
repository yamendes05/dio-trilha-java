public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = {"Ana", "Bia", "Carlos", "Daniel", "Eduardo"};
       //percorre o array de alunos
        for(int i = 0; i < alunos.length; i++) {
          //imprime o aluno no indice x
          
            System.out.println("o aluno no indice x= " + i + " é " + alunos[i]);
        }
    }
}

import java.util.Stack;
import java.io.PrintStream;
import java.util.Scanner;

public class MainQuestao1 {
    public static void main(String[] args) throws Exception {
        //A FRASE QUE VAI TER AS PALAVRAS INVERTIDAS
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Digite uma frase: ");
        String entrada = scanner.nextLine();
        scanner.close();

        //DIVIDIR A FRASE EM PALAVRAS
        String[] palavras = entrada.split(" ");
        StringBuilder resultado = new StringBuilder();

        for (String palavra : palavras) {
            Stack<Character> pilha = new Stack<>();

            for (char c : palavra.toCharArray()) {
                pilha.push(c);
            }

            while (!pilha.isEmpty()) {
                resultado.append(pilha.pop());
            }

            resultado.append(" ");

        }
        //SO NÃO PODE USAR ACENTO NA PALAVRA
        System.out.println(resultado.toString().trim());
    } 
}

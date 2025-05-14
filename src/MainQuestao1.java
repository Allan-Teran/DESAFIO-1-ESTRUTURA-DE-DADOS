import java.util.Stack;

public class MainQuestao1 {
    public static void main(String[] args) throws Exception {
        //A FRASE QUE VAI TER AS PALAVRAS INVERTIDAS
        String entrada = "ESTE EXERCICIO É MUITO FACIL";

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

        System.out.println(resultado.toString().trim());
    } 
}

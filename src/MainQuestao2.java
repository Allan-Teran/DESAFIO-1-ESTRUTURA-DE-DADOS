import java.util.Scanner;
import java.util.Stack;

public class MainQuestao2 {
    
    public static void ordenarPilha(Stack<Integer> pilha) {
        Stack<Integer> pilhaAuxiliar = new Stack<>();

        while(!pilha.isEmpty()) {
            int elemento = pilha.pop();
        
            while(!pilhaAuxiliar.isEmpty() && pilhaAuxiliar.peek() < elemento) {
                pilha.push(pilhaAuxiliar.pop());
            }

            pilhaAuxiliar.push(elemento);
        }

        while(!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }
    }
    
    
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros para a pilha: ");
        int quantidade = scan.nextInt();

        System.out.println("Digite os numeros: ");
        for (int i = 0; i < quantidade; i++) {
            int numero = scan.nextInt();
            pilha.push(numero);
        }

        System.out.println("Pilha original: " + pilha);
        ordenarPilha(pilha);
        System.out.println("Pilha ordenada: " + pilha);

        scan.close();
    }
}

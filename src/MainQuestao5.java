import java.util.Scanner;
import java.util.Stack;

public class MainQuestao5 {
    public static void qualPilhaEhMaior(Stack<Integer> p1 , Stack<Integer> p2) {
        if (p1.size() > p2.size()) {
            System.out.println("A pilha 1 é maior");
        } else if (p1.size() < p2.size()) {
            System.out.println("A pilha 2 é maior");
        } else {
            System.out.println("As pilhas são iguais");
        }
    }

    public static void calculaElementos(Stack<Integer> pilha) {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
    ;
        for (int valor : pilha) {
            if (valor > maior) maior = valor;
            if (valor < menor) menor = valor;
            soma += valor;
        }
        
        double media = (double) soma / pilha.size();

        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento " + menor);
        System.out.println("Média dos elementos " + media);
    }

    public static void transfereElementos(Stack<Integer> pilha1, Stack<Integer> pilha2) {
        while (!pilha1.isEmpty()) {
            pilha2.push(pilha1.pop());
        }
    }

    public static void verificaSePilhaEhImparERetornaNumeroDeElementos(Stack<Integer> pilha) {
        if (pilha.size() % 2 == 0) {
            System.out.println("A pilha é Par");
        } else {
            System.out.println("A pilha é Impar");
            System.out.println("Número de elementos: " + pilha.size());
        }
    }

    public static void verificaSePilhaEhParERetornaNumeroDeElementos(Stack<Integer> pilha) {
        if (pilha.size() % 2 == 0) {
            System.out.println("A pilha é Par");
            System.out.println("Número de elementos: " + pilha.size());
        } else {
            System.out.println("A pilha é Impar");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> p1 = new Stack<>();
        Stack<Integer> p2 = new Stack<>();
        System.out.println("Digite a quantidade de elementos da pilha 1: ");
        int quantidade1 = scan.nextInt();
        System.out.println("Digite os elementos da pilha 1: ");
        for (int i = 0; i < quantidade1; i++) {
            int elemento = scan.nextInt();
            p1.push(elemento);
        }
        System.out.println("Digite a quantidade de elementos da pilha 2: ");
        int quantidade2 = scan.nextInt();
        System.out.println("Digite os elementos da pilha 2: ");
        for (int i = 0; i < quantidade2; i++) {
            int elemento = scan.nextInt();
            p2.push(elemento);
        }

        System.out.println("Pilha 1: " + p1);
        System.out.println("Pilha 2: " + p2);

        qualPilhaEhMaior(p1, p2);
        calculaElementos(p2);
        calculaElementos(p1);
        verificaSePilhaEhImparERetornaNumeroDeElementos(p2);
        verificaSePilhaEhImparERetornaNumeroDeElementos(p1);
        verificaSePilhaEhParERetornaNumeroDeElementos(p1);
        verificaSePilhaEhParERetornaNumeroDeElementos(p2);

        transfereElementos(p1, p2);
    }
}

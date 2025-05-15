import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainQuestao6 {
    public static void qualFilaEhMaior(Queue<Integer> f1, Queue<Integer> f2) {
        if (f1.size() > f2.size()) {
            System.out.println("A fila 1 é maior");
        } else if (f1.size() < f2.size()) {
            System.out.println("A fila 2 é maior");
        } else {
            System.out.println("As filas são iguais");
        }
    }

    public static void calculaElementos(Queue<Integer> fila) {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
            return;
        }
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        for (int valor : fila) {
            if (valor > maior) maior = valor;
            if (valor < menor) menor = valor;
            soma += valor;
        }

        double media = (double) soma / fila.size();

        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);
        System.out.println("Média dos elementos: " + media);
    }

    public static void transfereElementos(Queue<Integer> fila1, Queue<Integer> fila2) {
        while (!fila1.isEmpty()) {
            fila2.add(fila1.poll());
        }
    }

    public static void verificaSeFilaEhImparERetornaNumeroDeElementos(Queue<Integer> fila) {
        if (fila.size() % 2 == 0) {
            System.out.println("A fila é Par");
        } else {
            System.out.println("A fila é Impar");
            System.out.println("Número de elementos: " + fila.size());
        }
    }

    public static void verificaSeFilaEhParERetornaNumeroDeElementos(Queue<Integer> fila) {
        if (fila.size() % 2 == 0) {
            System.out.println("A fila é Par");
            System.out.println("Número de elementos: " + fila.size());
        } else {
            System.out.println("A fila é Impar");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue<Integer> f1 = new LinkedList<>();
        Queue<Integer> f2 = new LinkedList<>();
        System.out.println("Digite a quantidade de elementos da fila 1: ");
        int quantidade1 = scan.nextInt();
        System.out.println("Digite os elementos da fila 1: ");
        for (int i = 0; i < quantidade1; i++) {
            int elemento = scan.nextInt();
            f1.add(elemento);
        }
        System.out.println("Digite a quantidade de elementos da fila 2: ");
        int quantidade2 = scan.nextInt();
        System.out.println("Digite os elementos da fila 2: ");
        for (int i = 0; i < quantidade2; i++) {
            int elemento = scan.nextInt();
            f2.add(elemento);
        }

        System.out.println("Fila 1: " + f1);
        System.out.println("Fila 2: " + f2);

        qualFilaEhMaior(f1, f2);
        calculaElementos(f2);
        calculaElementos(f1);
        verificaSeFilaEhImparERetornaNumeroDeElementos(f2);
        verificaSeFilaEhImparERetornaNumeroDeElementos(f1);
        verificaSeFilaEhParERetornaNumeroDeElementos(f1);
        verificaSeFilaEhParERetornaNumeroDeElementos(f2);

        transfereElementos(f1, f2);
    }
}

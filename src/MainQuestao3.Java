public class MainQuestao3 {
    public static void main(String[] args) throws Exception {
        Pilha pilha = new Pilha();

        pilha.adicionar("Jony");
        pilha.adicionar("Giovanna");
        pilha.adicionar("Davi");
        pilha.adicionar("Elis");
        pilha.adicionar("Luana");

        System.out.println("topo: " + pilha.get());
        pilha.remover();
        System.out.println("topo: " + pilha.get());

    }
}
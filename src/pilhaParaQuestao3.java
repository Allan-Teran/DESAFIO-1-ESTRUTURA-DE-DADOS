public class pilhaParaQuestao3 {
    private listaLigadaparaQuestao3 lista;

    public pilhaParaQuestao3() {
        this.lista = new listaLigadaparaQuestao3();
    }

    public void adicionar(String novoValor) {
        this.lista.adicionarComeco(novoValor);
    }

    public void remover() {
        this.lista.remover(this.get());
    }

    public String get() {
        return this.lista.getPrimeiro().getValor();
    }
}

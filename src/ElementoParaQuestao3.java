public class ElementoParaQuestao3 {
    private String valor;
    private ElementoParaQuestao3 proximo;

    public ElementoParaQuestao3(String novoValor) {
        this.valor = novoValor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public ElementoParaQuestao3 getProximo() {
        return proximo;
    }

    public void setProximo(ElementoParaQuestao3 proximo) {
        this.proximo = proximo;
    }
}

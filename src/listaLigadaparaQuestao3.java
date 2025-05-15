public class listaLigadaparaQuestao3 {
    private ElementoParaQuestao3 primeiro;
    private ElementoParaQuestao3 ultimo;
    private int tamanho;

    public listaLigadaparaQuestao3() {
        this.tamanho = 0;
    }

    public ElementoParaQuestao3 getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(ElementoParaQuestao3 primeiro) {
        this.primeiro = primeiro;
    }

    public ElementoParaQuestao3 getUltimo() {
        return ultimo;
    }

    public void setUltimo(ElementoParaQuestao3 ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor) {
        ElementoParaQuestao3 novoElemento = new ElementoParaQuestao3(novoValor);
        if (primeiro == null && ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;
    }

    public void adicionarComeco( String novoValor) {
        ElementoParaQuestao3 novoElemento = new ElementoParaQuestao3(novoValor);
        if (primeiro == null && ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            novoElemento.setProximo(novoElemento);
            this.primeiro = novoElemento;
        }
        this.tamanho++;
    }

    public void remover(String valorProcurado){
        ElementoParaQuestao3 anterior = null;
        ElementoParaQuestao3 atual = this.primeiro;
        for(int i=0; i < this.getTamanho(); i++){            
            if (atual.getValor().equalsIgnoreCase(valorProcurado)){
                if (this.tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;
                }else if (atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                }else if (atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public ElementoParaQuestao3 get(int posicao){
        ElementoParaQuestao3 atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            if(atual.getProximo() != null) {
                atual = atual.getProximo();
            } else {
                throw new IndexOutOfBoundsException("Posição fora dos limites da lista.");
            }
        }
        return atual;
    }


}

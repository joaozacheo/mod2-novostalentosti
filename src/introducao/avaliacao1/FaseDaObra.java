package introducao.avaliacao1;

import java.util.ArrayList;

public class FaseDaObra {
    private String nome;
    private Engenheiro encarregado;
    private ArrayList<Construtor> listaConstrutores = new ArrayList<>();
    private ArrayList<ItemDeConstrucao> listaItens = new ArrayList<>();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float calcularValorDaFaseDaObra(){
        float valorTotalDaFase = 0;
        float valorMateriais = 0;
        float valorEncarregado = getEncarregado().getSalario();
        float valorConstrutores = 0;
        for(int i = 0; i < getListaItens().size(); i++){
            valorMateriais = valorMateriais + (getListaItens().get(i).getQuantidade() * getListaItens().get(i).getProduto().getPreco());
        }
        for(int i = 0; i < getListaConstrutores().size(); i++){
            valorConstrutores = valorConstrutores + getListaConstrutores().get(i).getSalario();
        }
        valorTotalDaFase = valorMateriais + valorEncarregado + valorConstrutores;
        return valorTotalDaFase;
    }

    public Engenheiro getEncarregado() {
        return encarregado;
    }
    public void setEncarregado(Engenheiro encarregado) {
        this.encarregado = encarregado;
    }

    public ArrayList<Construtor> getListaConstrutores() {
        return listaConstrutores;
    }
    public void setListaConstrutores(ArrayList<Construtor> listaConstrutores) {
        this.listaConstrutores = listaConstrutores;
    }

    public ArrayList<ItemDeConstrucao> getListaItens() {
        return listaItens;
    }
    public void setListaItens(ArrayList<ItemDeConstrucao> listaItens) {
        this.listaItens = listaItens;
    }

    
}

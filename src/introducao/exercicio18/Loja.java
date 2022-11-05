package introducao.exercicio18;

import java.util.ArrayList;

public class Loja {
    private ArrayList<Setor> listaSetores = new ArrayList<>();

    public static void main(String[] args) {
        Fornecedor forn1 = new Fornecedor();
        forn1.setNome("Karsten");

        Fornecedor forn2 = new Fornecedor();
        forn2.setNome("Dohler");

        Produto prod1 = new Produto();
        prod1.setNome("Travesseiro");
        prod1.setPreco(70f);
        prod1.setFornecedor(forn1);

        Produto prod2 = new Produto();
        prod2.setNome("Cobertor");
        prod2.setPreco(250f);
        prod2.setFornecedor(forn1);

        Produto prod3 = new Produto();
        prod3.setNome("Toalha");
        prod3.setPreco(100f);
        prod3.setFornecedor(forn1);

        Produto prod4 = new Produto();
        prod4.setNome("Toalha de Banho");
        prod4.setPreco(60f);
        prod4.setFornecedor(forn2);

        Produto prod5 = new Produto();
        prod5.setNome("Toalha de Rosto");
        prod5.setPreco(30f);
        prod5.setFornecedor(forn2);

        Setor setor1 = new Setor();
        setor1.setNome("Cama");
        setor1.getListaProdutos().add(prod1);
        setor1.getListaProdutos().add(prod2);

        Setor setor2 = new Setor();
        setor2.setNome("Mesa");
        setor2.getListaProdutos().add(prod3);

        Setor setor3 = new Setor();
        setor3.setNome("Banho");
        setor3.getListaProdutos().add(prod4);
        setor3.getListaProdutos().add(prod5);

        Loja loja1 = new Loja();
        loja1.getListaSetores().add(setor1);
        loja1.getListaSetores().add(setor2);
        loja1.getListaSetores().add(setor3);
        
        String loja = loja1.gerarCatalogo();

        System.out.println(loja);
    }

    public String gerarCatalogo(){
        StringBuilder montador = new StringBuilder();
        montador.append("CATÁLOGO");
        for(int i = 0; i < getListaSetores().size(); i++){
            montador.append("\n\n");
            montador.append(i+1);
            montador.append(". Setor: ");
            montador.append(getListaSetores().get(i).getNome());
            for(int j = 0; j < getListaSetores().get(i).getListaProdutos().size(); j++){
                montador.append("\n- ");
                montador.append(getListaSetores().get(i).getListaProdutos().get(j).getNome());
                montador.append("\t Preço: R$");
                montador.append(getListaSetores().get(i).getListaProdutos().get(j).getPreco());
                montador.append("\t Fornecedor: ");
                montador.append(getListaSetores().get(i).getListaProdutos().get(j).getFornecedor().getNome());
            }
        }
        return montador.toString();
    }

    public ArrayList<Setor> getListaSetores() {
        return listaSetores;
    }
    public void setListaSetores(ArrayList<Setor> listaSetores) {
        this.listaSetores = listaSetores;
    }
}

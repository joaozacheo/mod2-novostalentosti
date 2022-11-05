package introducao.exercicio17;

import java.util.ArrayList;

public class Cardapio {
    private ArrayList<ItemCardapio> listaItensCardapio = new ArrayList<>();

    public static void main(String[] args) {
        Prato prato1 = new Prato();
        prato1.setNome("Bifão");
        prato1.setPreco(10f);

        Prato prato2 = new Prato();
        prato2.setNome("Feijoada");
        prato2.setPreco(30f);

        Prato prato3 = new Prato();
        prato3.setNome("Dobradinha");
        prato3.setPreco(50f);

        Prato prato4 = new Prato();
        prato4.setNome("Hamburguer");
        prato4.setPreco(20f);

        ItemCardapio item1 = new ItemCardapio();
        item1.setDisponivel(true);
        item1.setPrato(prato1);

        ItemCardapio item2 = new ItemCardapio();
        item2.setDisponivel(true);
        item2.setPrato(prato2);

        ItemCardapio item3 = new ItemCardapio();
        item3.setDisponivel(false);
        item3.setPrato(prato3);

        ItemCardapio item4 = new ItemCardapio();
        item4.setDisponivel(true);
        item4.setPrato(prato4);

        Cardapio card = new Cardapio();
        card.getListaItensCardapio().add(item1);
        card.getListaItensCardapio().add(item2);
        card.getListaItensCardapio().add(item3);
        card.getListaItensCardapio().add(item4);

        String cardapio = card.gerarCardapio();

        System.out.println(cardapio);
    }

    public String gerarCardapio(){
        StringBuilder montador = new StringBuilder();
        montador.append("CARDÁPIO");
        int j = 1;
        for(int i = 0; i < getListaItensCardapio().size(); i++){
            if(getListaItensCardapio().get(i).isDisponivel()){
                montador.append("\n");
                montador.append(j + ". ");
                montador.append(getListaItensCardapio().get(i).getPrato().getNome());
                montador.append("\tR$");
                montador.append(getListaItensCardapio().get(i).getPrato().getPreco());
                j++;
            }
        }
        return montador.toString();
    }

    public ArrayList<ItemCardapio> getListaItensCardapio() {
        return listaItensCardapio;
    }
    public void setListaItensCardapio(ArrayList<ItemCardapio> listaItensCardapio) {
        this.listaItensCardapio = listaItensCardapio;
    }
    
}

package introducao.exercicio16;

import java.util.ArrayList;

public class GuardaVolumes {
    private ArrayList<Item> listaItens = new ArrayList<>();

    public static void main(String[] args) {
        Proprietario prop1 = new Proprietario();
        prop1.setNome("Zezinho");

        Proprietario prop2 = new Proprietario();
        prop2.setNome("Mariazinha");

        Item item1 = new Item();
        item1.setNome("Chave de Casa");
        item1.setProprietario(prop1);

        Item item2 = new Item();
        item2.setNome("Celular");
        item2.setProprietario(prop1);

        Item item3 = new Item();
        item3.setNome("Chave de Casa");
        item3.setProprietario(prop2);

        Item item4 = new Item();
        item4.setNome("Celular");
        item4.setProprietario(prop2);

        Item item5 = new Item();
        item5.setNome("Carteira");
        item5.setProprietario(prop2);

        Item item6 = new Item();
        item6.setNome("Escova de cabelos");
        item6.setProprietario(prop2);

        GuardaVolumes guarda = new GuardaVolumes();
        guarda.getListaItens().add(item1);
        guarda.getListaItens().add(item2);
        guarda.getListaItens().add(item3);
        guarda.getListaItens().add(item4);
        guarda.getListaItens().add(item5);
        guarda.getListaItens().add(item6);

        String listaFinal = guarda.gerarListaItens();

        System.out.println(listaFinal);
    }

    public String gerarListaItens(){
        StringBuilder montador = new StringBuilder();
        montador.append("Lista de Itens:");
        for(int i = 0; i < getListaItens().size(); i++){
            montador.append("\n");
            montador.append(i + 1 + ". ");
            montador.append(getListaItens().get(i).getNome());
            montador.append("\tProprietario: ");
            montador.append(getListaItens().get(i).getProprietario().getNome());
        }
        return montador.toString();
    }

    public ArrayList<Item> getListaItens() {
        return listaItens;
    }
    public void setListaItens(ArrayList<Item> listaItens) {
        this.listaItens = listaItens;
    }
    
}

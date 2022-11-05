package introducao.exercicio10;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public static void main(String[] args) {
        Produto prod1 = new Produto();
        prod1.setNome("banana");
        prod1.setValor(3.5f);

        Produto prod2 = new Produto();
        prod2.setNome("laranja");
        prod2.setValor(2.2f);

        Produto prod3 = new Produto();
        prod3.setNome("maçã");
        prod3.setValor(7.2f);

        Produto prod4 = new Produto();
        prod4.setNome("Pêra");
        prod4.setValor(25f);

        Pedido pedido1 = new Pedido();
        pedido1.getListaProdutos().add(prod1);
        pedido1.getListaProdutos().add(prod2);
        pedido1.getListaProdutos().add(prod3);
        pedido1.getListaProdutos().add(prod4);

        float resultadoPedido = pedido1.calcSomaProduto();
        System.out.println(resultadoPedido);
    }

    public float calcSomaProduto(){
        float somaProdutos = 0;
        for(int i = 0; i < getListaProdutos().size(); i++){
            somaProdutos = somaProdutos + getListaProdutos().get(i).getValor();
        }
        return somaProdutos;
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
    
}

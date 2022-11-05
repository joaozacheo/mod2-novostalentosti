package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;
import introducao.exercicio3.Comprador;
import introducao.exercicio3.ItemPedido;
import introducao.exercicio3.Pedido;
import introducao.exercicio3.Produto;

public class App6 {
    public static void main(String[] args) {
        //Comprador 1
        Comprador zezinho = new Comprador();
        zezinho.setId(300);
        zezinho.setNome("Zezinho da Silva");
        zezinho.setEndereco("Rua Lalala, 100");

        //Comprador 2
        Comprador luizinho = new Comprador();
        luizinho.setId(555);
        luizinho.setNome("Luizinho");
        luizinho.setEndereco("Rua dos Alfeneiros, 218");

        //Produto 1
        Produto produto1 = new Produto();
        produto1.setId(1001);
        produto1.setNome("Playstation 5");
        produto1.setValor(8000f);

        //Produto 2
        Produto produto2 = new Produto();
        produto2.setId(1002);
        produto2.setNome("Xbox Series X");
        produto2.setValor(5000f);

        //Produto 3
        Produto produto3 = new Produto();
        produto3.setId(1003);
        produto3.setNome("Bola de Futebol");
        produto3.setValor(85.50f);

        //Produto 4
        Produto produto4 = new Produto();
        produto4.setId(1004);
        produto4.setNome("Tela de Pintura");
        produto4.setValor(38.25f);

        //Produto 5
        Produto produto5 = new Produto();
        produto5.setId(1005);
        produto5.setNome("Kit Tinta Acrílica");
        produto5.setValor(154f);

        //Item 1
        ItemPedido item1 = new ItemPedido();
        item1.setId(1);
        item1.setQuantidade(1);
        item1.setValorVenda(7500f);
        item1.setProduto(produto1);

        //Item 2
        ItemPedido item2 = new ItemPedido();
        item2.setId(2);
        item2.setQuantidade(1);
        item2.setValorVenda(4000f);
        item2.setProduto(produto2);

        //Item 3
        ItemPedido item3 = new ItemPedido();
        item3.setId(3);
        item3.setQuantidade(1);
        item3.setValorVenda(82.40f);
        item3.setProduto(produto3);

        //Item 4
        ItemPedido item4 = new ItemPedido();
        item4.setId(4);
        item4.setQuantidade(3);
        item4.setValorVenda(34.15f);
        item4.setProduto(produto4);

        //Item 5
        ItemPedido item5 = new ItemPedido();
        item5.setId(5);
        item5.setQuantidade(1);
        item5.setValorVenda(138f);
        item5.setProduto(produto5);

        //Pedido 1
        Pedido pedido1 = new Pedido();
        Calendar data1 = GregorianCalendar.getInstance();
        data1.set(2022,03,29);
        pedido1.setId(1);
        pedido1.setData(data1.getTime());
        pedido1.setCliente(zezinho);
        pedido1.getListaItens().add(item1);
        pedido1.getListaItens().add(item2);
        
        var resultado = pedido1.calcValorTotal();
        System.out.println("O valor total do primeiro pedido é: R$" + resultado);

        //Pedido 2
        Pedido pedido2 = new Pedido();
        Calendar data2 = GregorianCalendar.getInstance();
        data2.set(2022,6,04);
        pedido2.setId(2);
        pedido2.setData(data2.getTime());
        pedido2.setCliente(luizinho);
        pedido2.getListaItens().add(item3);
        pedido2.getListaItens().add(item4);
        pedido2.getListaItens().add(item5);

        var resultado2 = pedido2.calcValorTotal();
        System.out.println("O valor total do segundo pedido é: R$" + resultado2);
    }
}

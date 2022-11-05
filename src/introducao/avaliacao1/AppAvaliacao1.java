package introducao.avaliacao1;

public class AppAvaliacao1 {
    public static void main(String[] args) {
        
        MaterialDeConstrucao mat2 = new MaterialDeConstrucao();
        mat2.setNome("Saco de cimento");
        mat2.setPreco(80);

        MaterialDeConstrucao mat3 = new MaterialDeConstrucao();
        mat3.setNome("Vergalhão de Aço");
        mat3.setPreco(50);

        ItemDeConstrucao item3 = new ItemDeConstrucao();
        item3.setQuantidade(900);
        item3.setProduto(mat2);

        ItemDeConstrucao item4 = new ItemDeConstrucao();
        item4.setQuantidade(1000);
        item4.setProduto(mat3);

        Engenheiro eng2 = new Engenheiro();
        eng2.setNome("Emmett Brown");
        eng2.setNumero(4321);
        eng2.setSalario(15000);
        eng2.setFormacao("Engenheiro Civil");

        Construtor cons3 = new Construtor();
        cons3.setNome("Zezinho");
        cons3.setNumero(3333);
        cons3.setSalario(3000);
        cons3.setTerceirizado(false);

        FaseDaObra fase1 = new FaseDaObra();
        fase1.setNome("Fundação");
        fase1.getListaItens().add(item3);
        fase1.getListaItens().add(item4);
        fase1.setEncarregado(eng2);
        fase1.getListaConstrutores().add(cons3);

        MaterialDeConstrucao mat1 = new MaterialDeConstrucao();
        mat1.setNome("Viga de madeira");
        mat1.setPreco(20);

        ItemDeConstrucao item1 = new ItemDeConstrucao();
        item1.setQuantidade(500);
        item1.setProduto(mat1);

        ItemDeConstrucao item2 = new ItemDeConstrucao();
        item2.setQuantidade(800);
        item2.setProduto(mat2);

        Engenheiro eng1 = new Engenheiro();
        eng1.setNome("Rick Sanchez");
        eng1.setNumero(1234);
        eng1.setSalario(10000);
        eng1.setFormacao("Engenheiro Civil");

        Construtor cons1 = new Construtor();
        cons1.setNome("Huguinho");
        cons1.setNumero(1111);
        cons1.setSalario(3000);
        cons1.setTerceirizado(false);

        Construtor cons2 = new Construtor();
        cons2.setNome("Luizinho");
        cons2.setNumero(2222);
        cons2.setSalario(2500);
        cons2.setTerceirizado(true);

        FaseDaObra fase2 = new FaseDaObra();
        fase2.setNome("Primeiro Andar");
        fase2.getListaItens().add(item1);
        fase2.getListaItens().add(item2);
        fase2.setEncarregado(eng1);
        fase2.getListaConstrutores().add(cons1);
        fase2.getListaConstrutores().add(cons2);

        Obra obra1 = new Obra();
        obra1.getListaFases().add(fase1);
        obra1.getListaFases().add(fase2);

        var valorDaObra = obra1.calcularValorTotalDaObra();
        var dadosObra = obra1.listarDadosDaObra();

        System.out.println(String.format("Valor total da obra: R$%.2f", valorDaObra));
        System.out.println(dadosObra);
    }
}

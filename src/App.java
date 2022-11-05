import introducao.Aplicativo;
import introducao.Celular;
import introducao.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        //instanciação
        Pessoa zezinho = new Pessoa("Zezinho da Silva Sauro");
        zezinho.setNome("Zezinho da Silva Sauro");
        zezinho.setCPF("555.555.555-55");
        zezinho.setAltura(1.8f);
        zezinho.setIdade(22);
        zezinho.setRaca("A");
        //zezinho.mostraRaca();
        Pessoa.mostraRaca();
        
        Pessoa luizinho = new Pessoa("Luizinho da Silva Sauro");
        luizinho.setNome("Luizinho da Silva Sauro");;
        luizinho.setCPF("222.222.222-22");
        luizinho.setIdade(14);
        luizinho.setRaca("B");
        System.out.println(zezinho.getNome() + " Raça:" + zezinho.getRaca());
        System.out.println(luizinho.getNome() + " Raça:" + luizinho.getRaca());

        System.out.println(zezinho.getNome());
        System.out.println(zezinho.getCPF());
        System.out.println(zezinho.getAltura());
        System.out.println(zezinho.getIdade());
        System.out.println(luizinho.getNome());
        System.out.println(luizinho.getCPF());
        System.out.println(luizinho.getIdade());

        String guardaResultado = zezinho.podeDirigir();
        System.out.println(guardaResultado);
        guardaResultado = luizinho.podeDirigir();
        System.out.println(guardaResultado);

        zezinho.mostraCPF();
        luizinho.mostraCPF();

        Celular startak = new Celular("(47) 99999-9999");
        startak.setModelo("PT 550");
        startak.setMarca("Motorola");
        startak.setDono(zezinho);

        Aplicativo app1 = new Aplicativo("Pássaros Bravos");
        Aplicativo app2 = new Aplicativo("Oquezap");
        Aplicativo app3 = new Aplicativo("Tecoteco");
        Aplicativo app4 = new Aplicativo("Postafoto");

        startak.getListaAplicativos().add(app1);
        startak.getListaAplicativos().add(app2);
        startak.getListaAplicativos().add(app3);
        startak.getListaAplicativos().add(app4);
        /*startak.getListaAplicativos().add("Laranja");
        startak.getListaAplicativos().add("Banana");
        startak.getListaAplicativos().add(1234);
        startak.getListaAplicativos().add(1200.05f);
        startak.getListaAplicativos().add(true);*/

        for(int i=0; i < startak.getListaAplicativos().size() ; i++){
            System.out.println(startak.getListaAplicativos().get(i).getNome());
        }
        //for each = PARA CADA
        for(Aplicativo umApp : startak.getListaAplicativos()){
            System.out.println(umApp);
        }

        /*var app = new Aplicativo("");
        app.nome = "lalala"; */
    }
}

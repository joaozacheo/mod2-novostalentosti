package introducao.exercicio13;

import java.util.ArrayList;

public class Cidade {
    private String nome;
    //Coleção deve ser instanciada(criada) antes de conter qualquer coisa
    private ArrayList<Municipe> listaMunicipes = new ArrayList<>();

    public static void main(String[] args) {
        TipoResidencia tipo1 = new TipoResidencia();
        tipo1.setNome("Apartamento");

        TipoResidencia tipo2 = new TipoResidencia();
        tipo2.setNome("Casa");

        Municipe mun1 = new Municipe();
        mun1.setNome("Zezinho");
        mun1.setTipo(tipo1);

        Municipe mun2 = new Municipe();
        mun2.setNome("Mariazinha");
        mun2.setTipo(tipo1);

        Municipe mun3 = new Municipe();
        mun3.setNome("Huguinho");
        mun3.setTipo(tipo1);

        Municipe mun4 = new Municipe();
        mun4.setNome("Zezinho");
        mun4.setTipo(tipo2);

        Municipe mun5 = new Municipe();
        mun5.setNome("Luizinho");
        mun5.setTipo(tipo2);

        Cidade cid1 = new Cidade();
        cid1.setNome("Joinville");
        cid1.getListaMunicipes().add(mun1);
        cid1.getListaMunicipes().add(mun2);
        cid1.getListaMunicipes().add(mun3);
        cid1.getListaMunicipes().add(mun4);
        cid1.getListaMunicipes().add(mun5);
        
        int apartamentos = cid1.contaApartamento();
        int casas = cid1.contaCasa();

        System.out.println(String.format("Qtd apartamentos: %d", apartamentos));
        System.out.println(String.format("Qtd casas: %d", casas));
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int contaApartamento(){
        int qtdApartament = 0;
        for(int i = 0; i < getListaMunicipes().size(); i++){
            if(getListaMunicipes().get(i).getTipo().getNome().matches("(?i)Apartamento")){
                qtdApartament++;
            }
        }
        return qtdApartament;
    }

    public int contaCasa(){
        int qtdCasa = 0;
        for(int i = 0; i < getListaMunicipes().size(); i++){
            if(getListaMunicipes().get(i).getTipo().getNome().matches("(?i)Casa")){
                qtdCasa++;
            }
        }
        return qtdCasa;
    }

    public ArrayList<Municipe> getListaMunicipes() {
        return listaMunicipes;
    }
    public void setListaMunicipes(ArrayList<Municipe> listaMunicipes) {
        this.listaMunicipes = listaMunicipes;
    }
    
}

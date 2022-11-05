package introducao.exercicio5;

import java.util.ArrayList;

public class Planilha {
    private ArrayList<ContaDeLuz> listaContaDeLuz = new ArrayList<>();

    public ArrayList<ContaDeLuz> getListaContaDeLuz() {
        return listaContaDeLuz;
    }
    public void setListaContaDeLuz(ArrayList<ContaDeLuz> listaContaDeLuz) {
        this.listaContaDeLuz = listaContaDeLuz;
    }

    public float calculaUltimaMediaConsumo(){
        float soma = 0;
        float media = 0;
        for(int i = 0; i < listaContaDeLuz.size(); i++){
            soma = soma + listaContaDeLuz.get(i).getValor();
        }
        media = soma/listaContaDeLuz.size();
        return media;
    }

    public float calculaMaiorValor(){
        float maiorValor = 0;

        //Outra forma de fazer:
        /*
        for(ContaDeLuz umaConta : listaContasDeLuz){
            if(maiorValor < umaConta.getValor()){
                maiorValor = umaConta.getValor();
            }
        }
        return maiorValor;*/

        for(int i = 0; i < getListaContaDeLuz().size(); i++){
            for(int j = 0; j < getListaContaDeLuz().size(); j++){
                if( getListaContaDeLuz().get(i).getKwGastos() < getListaContaDeLuz().get(j).getKwGastos()){
                    maiorValor = getListaContaDeLuz().get(j).getKwGastos();
                }
            }
        }
        return maiorValor;
    }

    public float calculaMenorValor(){
        float menorValor = 0;

        //Outra forma de fazer:
        /*if(listaContasDeLuz.size() >= 1){ //Verificca se existe uma conta
            menorValor = listaContasDeLuz.get(0).getValor();
        } 
        for(ContaDeLuz umaConta : listaContasDeLuz){
            if(menorValor > umaConta.getValor()){
                menorValor = umaConta.getValor();
            }
        }
        return menorValor;*/

        for(int i = 0; i < getListaContaDeLuz().size(); i++){
            for(int j = 0; j < getListaContaDeLuz().size(); j++){
                if( getListaContaDeLuz().get(i).getKwGastos() > getListaContaDeLuz().get(j).getKwGastos()){
                    menorValor = getListaContaDeLuz().get(j).getKwGastos();
                }
            }
        }
        return menorValor;
    }
}

package introducao.avaliacao1;

import java.util.ArrayList;

public class Obra {
    private ArrayList<FaseDaObra> listaFases = new ArrayList<>();

    public String listarDadosDaObra(){
        StringBuilder montadorString = new StringBuilder();
        for(int i = 0; i < listaFases.size(); i++){
            montadorString.append("\nFASE DA OBRA: ");
            montadorString.append(getListaFases().get(i).getNome());
            montadorString.append("\n\nValor da fase: R$");
            montadorString.append(getListaFases().get(i).calcularValorDaFaseDaObra());
            montadorString.append("\n\nLista de itens:");

            for(int j = 0; j < getListaFases().get(i).getListaItens().size(); j++){ //Montador de Itens
                montadorString.append("\n");
                montadorString.append(getListaFases().get(i).getListaItens().get(j).getProduto().getNome());
                montadorString.append("   Quantidade: ");
                montadorString.append(getListaFases().get(i).getListaItens().get(j).getQuantidade());
                montadorString.append("   Preço: R$");
                montadorString.append(getListaFases().get(i).getListaItens().get(j).getProduto().getPreco());
            }
            montadorString.append("\n"); //Montador de encarregado
            montadorString.append("\nEncarregado:");
            montadorString.append("\nNome: ");
            montadorString.append(getListaFases().get(i).getEncarregado().getNome());
            montadorString.append("\nFormação: ");
            montadorString.append(getListaFases().get(i).getEncarregado().getFormacao());
            montadorString.append("\nNúmero: ");
            montadorString.append(getListaFases().get(i).getEncarregado().getNumero());
            montadorString.append("\nSalário: R$");
            montadorString.append(getListaFases().get(i).getEncarregado().getSalario());
            montadorString.append("\n");
            montadorString.append("\nLista de Costrutores:");

            for(int j = 0; j < getListaFases().get(i).getListaConstrutores().size(); j++){ //Montador de Construtores
                montadorString.append("\n");
                montadorString.append("\nNome: ");
                montadorString.append(getListaFases().get(i).getListaConstrutores().get(j).getNome());
                montadorString.append("\nTercerizado: ");

                if(getListaFases().get(i).getListaConstrutores().get(j).isTerceirizado() == true){
                    montadorString.append("Sim");
                }else{
                    montadorString.append("Não");
                }
                montadorString.append("\nNúmero: ");
                montadorString.append(getListaFases().get(i).getListaConstrutores().get(j).getNumero());
                montadorString.append("\nSalário: R$");
                montadorString.append(getListaFases().get(i).getListaConstrutores().get(j).getSalario());
            }
            montadorString.append("\n");
        }
        return montadorString.toString();
    }

    public float calcularValorTotalDaObra(){
        float valorTotal = 0;
        for(int i = 0; i < getListaFases().size(); i++){
            valorTotal = valorTotal + getListaFases().get(i).calcularValorDaFaseDaObra();
        }
        return valorTotal;
    }
    
    public ArrayList<FaseDaObra> getListaFases() {
        return listaFases;
    }
    public void setListaFases(ArrayList<FaseDaObra> listaFases) {
        this.listaFases = listaFases;
    }
}

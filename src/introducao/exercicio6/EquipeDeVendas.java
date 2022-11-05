package introducao.exercicio6;

import java.util.ArrayList;

public class EquipeDeVendas {
    private Gerente gestor;
    private ArrayList<Vendedor> listaVendedores = new ArrayList<>();

    public Gerente getGestor() {
        return gestor;
    }
    public void setGestor(Gerente gestor) {
        this.gestor = gestor;
    }
    
    public ArrayList<Vendedor> getListaVendedores() {
        return listaVendedores;
    }
    public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public String listarEquipe(){
        StringBuilder montadorDeStrings = new StringBuilder();
        //CONCATENAÇÃO DE STRING (muito pesado pro java)
        //umString = umString + this.getGestor().getNome() + this.getGestor().getSetor()

        //completar GERENTE + SETOR + VENDEDOR
        montadorDeStrings.append("GERENTE\n");
        montadorDeStrings.append("Nome: " + this.getGestor().getNome() + "\n");
        montadorDeStrings.append("Setor: " + this.getGestor().getSetor() + "\n");
        montadorDeStrings.append("Telefone: " + this.getGestor().getTelefone() + "\n");
        montadorDeStrings.append("ID: " + this.getGestor().getId() + "\n");

        for(var umVendedor : this.getListaVendedores()){
            montadorDeStrings.append("VENDEDOR\n");
            montadorDeStrings.append(String.format("ID: %s \n", umVendedor.getId()));
            montadorDeStrings.append(String.format("Nome: %s \n", umVendedor.getNome()));
            montadorDeStrings.append(String.format("Telefone: %s \n", umVendedor.getTelefone()));
            montadorDeStrings.append(String.format("Meta de Venda: %.2f \n", umVendedor.getMetaVenda()));
            montadorDeStrings.append(String.format("Comissão: %.2f \n", umVendedor.getPercComissao()));

            var valComissao = (umVendedor.getMetaVenda() * umVendedor.getPercComissao()) / 100f;
            montadorDeStrings.append(String.format("Valor da comissão: %.2f \n", valComissao));
        }

        return montadorDeStrings.toString();
    }
}

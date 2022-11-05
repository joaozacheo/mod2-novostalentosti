package introducao.avaliacao20;

import java.util.ArrayList;

public class Curriculo {
    private Pessoa pessoa;
    private ArrayList<ExperienciaProfissional> listaExperienciasProfissionais = new ArrayList<>();
    private ArrayList<Formacao> listaFormacoes = new ArrayList<>();

    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ArrayList<ExperienciaProfissional> getListaExperienciasProfissionais() {
        return listaExperienciasProfissionais;
    }
    public void setListaExperienciasProfissionais(ArrayList<ExperienciaProfissional> listaExperienciasProfissionais) {
        this.listaExperienciasProfissionais = listaExperienciasProfissionais;
    }

    public ArrayList<Formacao> getListaFormacoes() {
        return listaFormacoes;
    }
    public void setListaFormacoes(ArrayList<Formacao> listaFormacoes) {
        this.listaFormacoes = listaFormacoes;
    }

    public String gerarCurriculo(){
        StringBuilder montador = new StringBuilder();
        montador.append("\nCURRÍCULO\n\n");
        montador.append("Nome: ");
        montador.append(pessoa.getNome());
        montador.append("\nData de Nascimento: ");
        montador.append(pessoa.getDataNascimento());
        montador.append("\n\nFormacões:");
        for(int i = 0; i < listaFormacoes.size(); i++){
            montador.append("\n");
            montador.append(i + 1 + ". ");
            montador.append(listaFormacoes.get(i).getNome());
            montador.append("\t\tAno de Conclusão: ");
            montador.append(listaFormacoes.get(i).getAnoConclusao());
        }
        montador.append("\n\nExperiências Profissionais:");
        montador.append("\t\tNúmero de Experiências Profissionais: ");
        montador.append(contarNumExperienciasProfissionais());
        for(int i =  0; i < listaExperienciasProfissionais.size(); i++){
            montador.append("\n");
            montador.append(i + 1 + ". ");
            montador.append(listaExperienciasProfissionais.get(i).getNome());
            montador.append("\t\tAno de Conclusão: ");
            montador.append(listaExperienciasProfissionais.get(i).getAnoConclusao());
        }
        montador.append("\n-------------------------------------------");
        return montador.toString();
    }

    public int contarNumExperienciasProfissionais(){
        int numExp = listaExperienciasProfissionais.size();
        return numExp;
    }
}

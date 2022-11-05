package introducao.exercicio12;

import java.util.ArrayList;

public class Turma {
    private String serie;
    private ArrayList<Crianca> listaCriancas = new ArrayList<>();

    public static void main(String[] args) {
        Crianca crianca1 = new Crianca();
        crianca1.setNome("Zezinnho");
        crianca1.setSexo("Masculino");

        Crianca crianca2 = new Crianca();
        crianca2.setNome("Mariazinha");
        crianca2.setSexo("Feminino");

        Crianca crianca3 = new Crianca();
        crianca3.setNome("Aninha");
        crianca3.setSexo("Feminino");

        Crianca crianca4 = new Crianca();
        crianca4.setNome("Julinha");
        crianca4.setSexo("feminino");

        Turma turma1 = new Turma();
        turma1.setSerie("5 série");
        turma1.getListaCriancas().add(crianca1);
        turma1.getListaCriancas().add(crianca2);
        turma1.getListaCriancas().add(crianca3);
        turma1.getListaCriancas().add(crianca4);

        int meninos = turma1.contaMeninos();
        int meninas = turma1.contaMeninas();

        System.out.println(String.format("Qtd meninos: %d", meninos));
        System.out.println(String.format("Qtd meninas: %d", meninas));
    }

    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int contaMeninos(){
        int qtdMeninos = 0;
        for(int i = 0; i < getListaCriancas().size(); i++){
            if(getListaCriancas().get(i).getSexo().matches("(?i)Masculino")){
                qtdMeninos++;
            }
        }
        return qtdMeninos;
    }

    public int contaMeninas(){
        int qtdMeninas = 0;
        for(int i = 0; i < getListaCriancas().size(); i ++){
            if(getListaCriancas().get(i).getSexo().matches("(?i)Feminino")){
                qtdMeninas++;
            }
        }
        return qtdMeninas;
    }

    public ArrayList<Crianca> getListaCriancas() {
        return listaCriancas;
    }
    public void setListaCriancas(ArrayList<Crianca> listaCriancas) {
        this.listaCriancas = listaCriancas;
    }
    
}

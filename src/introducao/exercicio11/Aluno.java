package introducao.exercicio11;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Nota> listaNotas = new ArrayList<>();

    public static void main(String[] args) {
        Nota nota1 = new Nota();
        nota1.setValor(5);

        Nota nota2 = new Nota();
        nota2.setValor(7);

        Nota nota3 = new Nota();
        nota3.setValor(6);

        Aluno zezinho = new Aluno();
        zezinho.setNome("Zezinho da Silva");
        zezinho.getListaNotas().add(nota1);
        zezinho.getListaNotas().add(nota2);
        zezinho.getListaNotas().add(nota3);

        float resultado = zezinho.calcMediaNotas();
        System.out.println(resultado);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public float calcMediaNotas(){
        float somaNotas = 0;
        float mediaFinal = 0;
        for(int i = 0; i < getListaNotas().size(); i++){
            somaNotas = somaNotas + getListaNotas().get(i).getValor();
        }
        mediaFinal = somaNotas/getListaNotas().size();
        return mediaFinal;
    }

    public ArrayList<Nota> getListaNotas() {
        return listaNotas;
    }
    public void setListaNotas(ArrayList<Nota> listaNotas) {
        this.listaNotas = listaNotas;
    }
    
}

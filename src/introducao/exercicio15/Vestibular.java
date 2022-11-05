package introducao.exercicio15;

import java.util.ArrayList;

public class Vestibular {
    private ArrayList<Vestibulando> listaVestibulandos = new ArrayList<>();

    public static void main(String[] args) {
        Vestibulando vest1 = new Vestibulando();
        vest1.setNome("Zezinho");
        vest1.setNota(7);

        Vestibulando vest2 = new Vestibulando();
        vest2.setNome("Pedrinho");
        vest2.setNota(5);

        Vestibulando vest3 = new Vestibulando();
        vest3.setNome("Huguinho");
        vest3.setNota(10);

        Vestibulando vest4 = new Vestibulando();
        vest4.setNome("Luizinho");
        vest4.setNota(8);

        Vestibular acafe = new Vestibular();
        acafe.getListaVestibulandos().add(vest1);
        acafe.getListaVestibulandos().add(vest2);
        acafe.getListaVestibulandos().add(vest3);
        acafe.getListaVestibulandos().add(vest4);

        String aprovados = acafe.gerarListaAprovados();

        System.out.println(aprovados);
    }

    public String gerarListaAprovados(){
        StringBuilder montador = new StringBuilder();
        montador.append("----LISTA DE APROVADOS----");
        montador.append("\n");
        for(int i = 0; i < getListaVestibulandos().size(); i++){
            if(getListaVestibulandos().get(i).getNota() >= 7){
                montador.append(i+1 + "- ");
                montador.append(getListaVestibulandos().get(i).getNome());
                montador.append("\tNota: ");
                montador.append(getListaVestibulandos().get(i).getNota());
                montador.append("\n");
            }
        }
        return montador.toString();
    }

    public ArrayList<Vestibulando> getListaVestibulandos() {
        return listaVestibulandos;
    }
    public void setListaVestibulandos(ArrayList<Vestibulando> listaVestibulandos) {
        this.listaVestibulandos = listaVestibulandos;
    }
}

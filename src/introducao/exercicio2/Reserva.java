package introducao.exercicio2;

import java.util.ArrayList;
import java.util.Date;

public class Reserva {
    private int numero;
    private Date dataInicial;
    private Date dataFinal;
    private ArrayList<Hospede> listaHospedes = new ArrayList<>();
    private Quarto quarto;

    public Reserva(int numero){
        setNumero(numero);
    }

    public ArrayList<Hospede> getListaHospedes() {
        return listaHospedes;
    }

    public void setListaHospedes(ArrayList<Hospede> listaHospedes) {
        this.listaHospedes = listaHospedes;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
    
    public String toString(){
        StringBuilder montadorString = new StringBuilder();
        montadorString.append("Reserva: ");
        montadorString.append(getNumero());
        montadorString.append("\nQuarto: ");
        montadorString.append(getQuarto().getNumero());
        montadorString.append("\nData de entrada: ");
        montadorString.append(getDataInicial());
        montadorString.append("\tData de saída: ");
        montadorString.append(getDataFinal());
        montadorString.append("\n");
        for(int i = 0; i < getListaHospedes().size();i++){
            montadorString.append("\nNome: ");
            montadorString.append(getListaHospedes().get(i).getNome());
            montadorString.append("\nCPF: ");
            montadorString.append(getListaHospedes().get(i).getCPF());
            montadorString.append("\nContato :");
            montadorString.append(getListaHospedes().get(i).getTelefone());
            montadorString.append("\n");
        }
        return montadorString.toString();        
    }

    /* + "\nNúmero do Quarto: " + getQuarto().getNumero() +
        "\nNome: " + getListaHospedes().get(0).getNome() + "\nCPF: " + getListaHospedes().get(0).getCPF() +
        "\tContato: " + getListaHospedes().get(0).getTelefone() */
}

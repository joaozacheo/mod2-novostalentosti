package introducao.exercicio5;

import java.util.Date;

public class ContaDeLuz {
    private Date dataLeitura;
    private int numLeitura;
    private float kwGastos;
    private float valor;
    private Date dataPagamento;
    private float mediaConsumo;
    private Planilha planilha;

    public ContaDeLuz(Date dataLeitura, int numLeitura,
    float kwGastos, float valor, Date dataPagamento, float mediaConsumo){
        this.dataLeitura = dataLeitura;
        this.numLeitura = numLeitura;
        this.kwGastos = kwGastos;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
        this.mediaConsumo = mediaConsumo;
        
    }

    public Date getDataLeitura() {
        return dataLeitura;
    }

    public int getNumLeitura() {
        return numLeitura;
    }

    public float getKwGastos() {
        return kwGastos;
    }

    public float getValor() {
        return valor;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public float getMediaConsumo() {
        mediaConsumo = planilha.calculaUltimaMediaConsumo();
        return mediaConsumo;
    }

}

package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import introducao.exercicio5.ContaDeLuz;
import introducao.exercicio5.Planilha;

public class App8 {
    public static void main(String[] args) {

        //Planilha
        Planilha planilha1 = new Planilha();

        //CONTA DE LUZ 1
        Calendar dataLeit1 = GregorianCalendar.getInstance();
        dataLeit1.set(2022,4,9);
        Calendar dataPag1 = GregorianCalendar.getInstance();
        dataPag1.set(2022,5,10);
        //Date dataLeit1 = new Date(2002,4,9);
        //Date dataPag1 = new Date(2022,5,10);
        ContaDeLuz conta1 = new ContaDeLuz(dataLeit1.getTime(), 1001, 500f, 150f, dataPag1.getTime(), 0);

        //CONTA DE LUZ 2
        Calendar dataLeit2 = GregorianCalendar.getInstance();
        dataLeit2.set(2022,3,9);
        Calendar dataPag2 = GregorianCalendar.getInstance();
        dataPag2.set(2022,4,10);
        //Date dataLeit2 = new Date(2002,3,9);
        //Date dataPag2 = new Date(2022,4,10);
        ContaDeLuz conta2 = new ContaDeLuz(dataLeit2.getTime(), 1002, 640f, 192f, dataPag2.getTime(), 0);

        //CONTA DE LUZ 3
        Calendar dataLeit3 = GregorianCalendar.getInstance();
        dataLeit3.set(2022,2,25);
        Calendar dataPag3 = GregorianCalendar.getInstance();
        dataPag3.set(2022,3,10);
        //Date dataLeit3 = new Date(2002,2,9);
        //Date dataPag3 = new Date(2022,3,10);
        ContaDeLuz conta3 = new ContaDeLuz(dataLeit3.getTime(), 1003, 580f, 174f, dataPag3.getTime(), 0);

        
        planilha1.getListaContaDeLuz().add(conta1);

        System.out.println("Data Leitura: "+conta1.getDataLeitura());
        System.out.println("Numero Leitura: "+conta1.getNumLeitura());
        System.out.println(String.format("kw Gastos: %.2f", conta1.getKwGastos()));
        System.out.println(String.format("Valor: R$%.2f", conta1.getValor()));
        System.out.println("Data Pagamento: "+conta1.getDataPagamento());
        System.out.println(String.format("Media Consumo: %.2f", conta1.getMediaConsumo()));
        System.out.println("");

        planilha1.getListaContaDeLuz().add(conta2);

        System.out.println("Data Leitura: "+conta2.getDataLeitura());
        System.out.println("Numero Leitura: "+conta2.getNumLeitura());
        System.out.println(String.format("kw Gastos: %.2f", conta2.getKwGastos()));
        System.out.println(String.format("Valor: R$%.2f", conta2.getValor()));
        System.out.println("Data Pagamento: "+conta2.getDataPagamento());
        System.out.println(String.format("Media Consumo: %.2f", conta2.getMediaConsumo()));
        System.out.println("");

        planilha1.getListaContaDeLuz().add(conta3);

        System.out.println("Data Leitura: "+conta3.getDataLeitura());
        System.out.println("Numero Leitura: "+conta3.getNumLeitura());
        System.out.println(String.format("kw Gastos: %.2f", conta3.getKwGastos()));
        System.out.println(String.format("Valor: R$%.2f", conta3.getValor()));
        System.out.println("Data Pagamento: "+conta3.getDataPagamento());
        System.out.println(String.format("Media Consumo: %.2f", conta3.getMediaConsumo()));
        System.out.println("");

        System.out.println(String.format("Média de Consumo: %.2f", planilha1.calculaUltimaMediaConsumo()));
        System.out.println(String.format("Maior consumo: %.2f", planilha1.calculaMaiorValor()));
        System.out.println(String.format("Menor consumo: %.2f", planilha1.calculaMenorValor()));
    }
}

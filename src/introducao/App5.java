package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import introducao.exercicio2.Hospede;
import introducao.exercicio2.Quarto;
import introducao.exercicio2.Reserva;

public class App5 {
    public static void main(String[] args) {
        Reserva reserva1 = new Reserva(1001);
        Reserva reserva2 = new Reserva(1002);
        Hospede pessoa1 = new Hospede("111.111.111-11");
        Hospede pessoa2 = new Hospede("222.222.222-22");
        Hospede pessoa3 = new Hospede("333.333.333-33");
        Hospede pessoa4 = new Hospede("444.444.444-44");
        Hospede pessoa5 = new Hospede("555.555.555-55");
        Quarto quarto1 = new Quarto();
        Quarto quarto2 = new Quarto();

        //Reserva 1
        Calendar dataInicio = GregorianCalendar.getInstance();
        dataInicio.set(2022,3,28);
        Calendar dataFinal = GregorianCalendar.getInstance();
        dataFinal.set(2022,4,05);
        reserva1.setDataInicial(dataInicio.getTime());
        reserva1.setDataFinal(dataFinal.getTime());
        reserva1.getListaHospedes().add(pessoa1);
        reserva1.getListaHospedes().add(pessoa2);
        reserva1.setQuarto(quarto1);
        pessoa1.setNome("Zezinho");
        pessoa1.setTelefone("5555-1234");
        pessoa2.setNome("Mariazinha");
        pessoa2.setTelefone("5555-4321");
        quarto1.setNumero(100);

        //Reserva 2
        Calendar dataInicio2 = GregorianCalendar.getInstance();
        dataInicio2.set(2022,3,21);
        Calendar dataFinal2 = GregorianCalendar.getInstance();
        dataFinal2.set(2022,3,28);
        reserva2.setDataInicial(dataInicio2.getTime());
        reserva2.setDataFinal(dataFinal2.getTime());
        reserva2.getListaHospedes().add(pessoa3);
        reserva2.getListaHospedes().add(pessoa4);
        reserva2.getListaHospedes().add(pessoa5);
        reserva2.setQuarto(quarto2);
        pessoa3.setNome("Luizinho");
        pessoa3.setTelefone("5555-1122");
        pessoa4.setNome("Huguinho");
        pessoa4.setTelefone("5555-2233");
        pessoa5.setNome("Paulinha");
        pessoa5.setTelefone("5555-5555");
        quarto2.setNumero(200);

        System.out.println("|| RESERVA 1 ||");
        System.out.println(reserva1.toString());
        System.out.println("");
        System.out.println("|| RESERVA 2 ||");
        System.out.println(reserva2.toString());
    }
}

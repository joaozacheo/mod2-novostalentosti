package introducao;

import introducao.exercicio1.Autor;
import introducao.exercicio1.Livro;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class App4 {
    public static void main(String[] args) {
        
        
        Livro livro3 = new Livro("Java 2 ensino didático");        
        Autor autor3 = new Autor("Grady Booch", null);

        //Livro 1
        Livro livro1 = new Livro("Java como programar");
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(1945,0,01);
        Autor autor1 = new Autor("Deitel", calendario.getTime());
        livro1.setValor(349f);
        livro1.setEsgotado(false);
        livro1.setEscritor(autor1);

        //Livro 2
        //Outra forma de criar uma data é usando o SimpleDateFormat
        /*try {
            Livro livro2 = new Livro("UML guia do usuário");
            livro2.setValor(165f);
            livro2.setEsgotado(false);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Autor autor2 = new Autor("Grady Booch",sdf.parse("27/12/1955"));
            livro2.setEscritor(autor2);
            System.out.println(livro2);
        } catch (ParseException e) {
            e.printStackTrace();
        }*/

        Livro livro2 = new Livro("UML guia do usuário");
        Calendar calendario2 = GregorianCalendar.getInstance();
        calendario2.set(1955,11,27);
        Autor autor2 = new Autor("Grady Booch",calendario2.getTime());
        livro2.setValor(165f);
        livro2.setEsgotado(false);
        livro2.setEscritor(autor2);

        //Livro3
        livro3.setValor(126f);
        livro3.setEsgotado(true);
        livro3.setEscritor(autor3);

        System.out.println(livro1.toString());
        System.out.println("");
        System.out.println(livro2.toString());
        System.out.println("");
        System.out.println(livro3.toString());

    }
}

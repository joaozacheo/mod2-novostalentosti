package introducao.avaliacao20;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class App20 {
    public static void main(String[] args) {
        ExperienciaProfissional exp1 = new ExperienciaProfissional();
        exp1.setNome("Monstro em Java            ");//Os espaços extras são só pra ficar mais bonito no sysout kkk
        exp1.setAnoConclusao("2022");

        Formacao form1 = new Formacao();
        form1.setNome("Curso Novos Talentos em TI");
        form1.setAnoConclusao(2022);

        Formacao form2 = new Formacao();
        form2.setNome("Ensino Médio         ");
        form2.setAnoConclusao(1999);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Zezinho");
        Calendar data1 = GregorianCalendar.getInstance();
        data1.set(1980,11,1);
        pessoa1.setDataNascimento(data1.getTime());

        Curriculo curr1 = new Curriculo();
        curr1.setPessoa(pessoa1);
        curr1.getListaFormacoes().add(form1);
        curr1.getListaFormacoes().add(form2);
        curr1.getListaExperienciasProfissionais().add(exp1);

        ExperienciaProfissional exp2 = new ExperienciaProfissional();
        exp2.setNome("DBA em MariaDB          ");
        exp2.setAnoConclusao("Atual");

        ExperienciaProfissional exp3 = new ExperienciaProfissional();
        exp3.setNome("Desenvolvedora FullStack");
        exp3.setAnoConclusao("2021");

        Formacao form3 = new Formacao();
        form3.setNome("Ensino Médio         ");
        form3.setAnoConclusao(2000);

        Formacao form4 = new Formacao();
        form4.setNome("Curso Novos Talentos em TI");
        form4.setAnoConclusao(2022);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Mariazinha");
        Calendar data2 = GregorianCalendar.getInstance();
        data2.set(1981,6,10);
        pessoa2.setDataNascimento(data2.getTime());

        Curriculo curr2 = new Curriculo();
        curr2.setPessoa(pessoa2);
        curr2.getListaFormacoes().add(form3);
        curr2.getListaFormacoes().add(form4);
        curr2.getListaExperienciasProfissionais().add(exp2);
        curr2.getListaExperienciasProfissionais().add(exp3);

        var curriculo1 = curr1.gerarCurriculo();
        var curriculo2 = curr2.gerarCurriculo();
        System.out.println(curriculo1);
        System.out.println(curriculo2);
    }
}

package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;
import introducao.exercicio4.EmpresaCliente;
import introducao.exercicio4.Funcionario;
import introducao.exercicio4.Pessoa;
import introducao.exercicio4.PessoaFisica;
import introducao.exercicio4.PessoaJuridica;

public class App7 {
    public static void main(String[] args) {
        //Funcionário 1
        Funcionario funcionario1 = new Funcionario();
        Calendar dataNasc1 = GregorianCalendar.getInstance();
        dataNasc1.set(1985,8,04);
        Calendar data1 = GregorianCalendar.getInstance();
        data1.set(2022,00,25);
        funcionario1.setNome("Zezinho da Silva");
        funcionario1.setTelefone("(47) 95555-5555");
        funcionario1.setDataNascimento(dataNasc1.getTime());
        funcionario1.setCPF("555.555.555-55");
        funcionario1.setEntradaNaEmpresa(data1.getTime());
        funcionario1.setSetor("Pintura");

        //Empresa 1
        EmpresaCliente empresa1 = new EmpresaCliente();
        Calendar dataCria1 = GregorianCalendar.getInstance();
        dataCria1.set(2005,11,23);
        empresa1.setNome("Antônio Pereira Costa");
        empresa1.setTelefone("(47) 94444-4444");
        empresa1.setDataCriacao(dataCria1.getTime());
        empresa1.setCNPJ("444-44");
        empresa1.setNomeEmpresa("Antônio Costa");
        empresa1.setTipoDeServico("Concerto de Eletrônicos");

        System.out.println("Pessoa 1");

        //Pessoa 1
        //POLIMORFISMO
        PessoaFisica pessoa1 = funcionario1;
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getTelefone());
        System.out.println(pessoa1.getDataNascimento());
        System.out.println(pessoa1.getCPF());

        System.out.println("Pessoa 2");

        //Pessoa 2
        PessoaJuridica pessoa2 = empresa1;
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getTelefone());
        System.out.println(pessoa2.getDataCriacao());
        System.out.println(pessoa2.getCNPJ());

        System.out.println("Pessoa 3");

        //Pessoa 3
        Pessoa pessoa3 = pessoa1;
        System.out.println(pessoa3.getNome());
        System.out.println(pessoa3.getTelefone());

        System.out.println("Pessoa 4");

        //Pessoa 4
        Pessoa pessoa4 = pessoa2;
        System.out.println(pessoa4.getNome());
        System.out.println(pessoa4.getTelefone());

        System.out.println("Funcionário 2");

        //Funcionário 2
        Funcionario funcionario2;
        funcionario2 = (Funcionario)pessoa3;
        System.out.println(funcionario2.getNome());
        System.out.println(funcionario2.getCPF());
        System.out.println(funcionario2.getDataNascimento());
        System.out.println(funcionario2.getSetor());
        System.out.println(funcionario2.getEntradaNaEmpresa());
        System.out.println(funcionario2.getTelefone());

        System.out.println("Empresa 2");

        //Empresa 2
        EmpresaCliente empresa2 = new EmpresaCliente();
        empresa2 = (EmpresaCliente)pessoa4;
        System.out.println(empresa2.getNome());
        System.out.println(empresa2.getCNPJ());
        System.out.println(empresa2.getDataCriacao());
        System.out.println(empresa2.getNomeEmpresa());
        System.out.println(empresa2.getTipoDeServico());
        System.out.println(empresa2.getTelefone());

    }
}

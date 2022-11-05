package introducao.exercicio4;

import java.util.Date;

public class Funcionario extends PessoaFisica{
    private Date entradaNaEmpresa;
    private String Setor;
    
    public Date getEntradaNaEmpresa() {
        return entradaNaEmpresa;
    }
    public void setEntradaNaEmpresa(Date entradaNaEmpresa) {
        this.entradaNaEmpresa = entradaNaEmpresa;
    }

    public String getSetor() {
        return Setor;
    }
    public void setSetor(String setor) {
        this.Setor = setor;
    }
}

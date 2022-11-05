package introducao.exercicio4;

public class EmpresaCliente extends PessoaJuridica{
    private String nomeEmpresa;
    private String tipoDeServico;
    
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }
    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getTipoDeServico() {
        return tipoDeServico;
    }
    public void setTipoDeServico(String tipoDeServico) {
        this.tipoDeServico = tipoDeServico;
    }


}

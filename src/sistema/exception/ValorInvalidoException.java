package sistema.exception;

public class ValorInvalidoException extends Exception{
    //mensagem de erro + campo + exception
    private String nomeDoCampo;

    public ValorInvalidoException(String mensagem, Exception origem) {
        super(mensagem, origem); //super se refere a SuperClasse (PAI) Exception
        //super(); chama o construtor da SuperClasse
        this.nomeDoCampo = "";
    }

    public ValorInvalidoException(String mensagem, Exception origem, String nomeDoCampo) {
        this(mensagem, origem); //super se refere a SuperClasse (PAI) Exception
        //super(); chama o construtor da SuperClasse
        this.nomeDoCampo = nomeDoCampo;
    }
}

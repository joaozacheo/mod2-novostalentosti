package introducao.exercicio1;

public class Livro {
    private String titulo;
    private float valor;
    private boolean esgotado;
    private Autor escritor;

    public Livro(String titulo){
        setTitulo(titulo);
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isEsgotado() {
        return esgotado;
    }
    public void setEsgotado(boolean esgotado) {
        this.esgotado = esgotado;
    }    

    public String toString(){
        StringBuilder montadorString = new StringBuilder();
        montadorString.append("Livro: ");
        montadorString.append(getTitulo());
        montadorString.append("\tAutor: ");
        montadorString.append(getEscritor().getNome());
        montadorString.append("\nValor: ");
        montadorString.append(getValor());
        montadorString.append("\t                Data de Nascimento: ");
        montadorString.append(getEscritor().getDataNascimento());
        montadorString.append("\nEm Estoque: ");
        montadorString.append(isEsgotado());

        return montadorString.toString();
    }
}

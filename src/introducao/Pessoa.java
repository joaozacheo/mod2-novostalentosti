package introducao;

public class Pessoa {
    //Atributos (variaveis) automaticamente inicializados com o valor padrão
    //escopo de vida de instancia
    //ENCAPSULAMENTO - POJO (Plain old Java object)
    private String nomeCompleto;
    private int idade;
    private String CPF;
    private float altura;
    private static String raca;

    public static void mostraRaca(){
        System.out.println(raca);
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    //GETTER E SETTER
    public String getNome(){
        return this.nomeCompleto;
    }
    public void setNome(String nome){
        if(!nome.equals("")){
            this.nomeCompleto = nome;
        }
    }

    //comportamento
    //CONSTRUTOR - inicializa um objeto e define valores obrigatórios
    public Pessoa(String nome){
        System.out.println("CONSTRUTOR" + nome);
        //this.nomeCompleto = nome;
        setNome(nome);
    }

    //metodo (função)
    //assinatura de um método
    //modificadordeacesso tipoderetorno nomeDoMetodo(parametros) {corpo}
    public String podeDirigir(){
        if(this.idade >= 18){
            return "Pode dirigir";
        }else{
            return "Não pode dirigir";
        }
    }

    public void mostraCPF(){
        System.out.println(this.CPF);
    }
}

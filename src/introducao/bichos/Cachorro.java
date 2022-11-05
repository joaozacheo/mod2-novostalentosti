package introducao.bichos;

public class Cachorro extends Mamífero{
    private String raca;

    public Cachorro(String raca) {
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }    
}

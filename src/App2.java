import introducao.bichos.Animal;
import introducao.bichos.Mamífero;

public class App2 {
    public static void main(String[] args) {
        //SUPERCLASSE
        Animal animal = new Animal();
        animal.setSexo("feminino");
        System.out.println(animal.getClass());
        System.out.println(animal.hashCode());

        //SUBCLASSE
        Mamífero mamifero = new Mamífero();
        mamifero.setSexo("masculino");
        mamifero.setGeraLeite(false);
        System.out.println(mamifero.getClass());
        System.out.println(mamifero.hashCode());

        Animal animal2 = mamifero;
        //CAST - Conversão
        System.out.println(((Mamífero)animal2).isGeraLeite());
        System.out.println(animal2.getSexo());
        System.out.println(animal2.getClass());
        System.out.println(animal2.hashCode());

    }
}

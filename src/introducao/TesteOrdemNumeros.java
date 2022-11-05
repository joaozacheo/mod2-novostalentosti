package introducao;

public class TesteOrdemNumeros {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,8,4,7,9,10,5,6};
        int troca;

        //Crescente
        System.out.println("Crescente: ");
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros.length; j++){
                if( numeros[i] < numeros[j]){
                    troca = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = troca;
                }
            }
        }

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        System.out.println("");

        //Decrescente
        System.out.println("Decrescente: ");
        for(int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros.length; j++){
                if( numeros[i] > numeros[j]){
                    troca = numeros[i];
                    numeros[i] = numeros[j];
                    numeros[j] = troca;
                }
            }
        }

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}

package pratica.aula;

public class PraticaAula {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int maior = maiorvalor(array);
        
        
    }
    
    public static int maiorvalor(int[] array){
        int maior = array[0];
        for (int atual : array){
            if (atual > maior){
                maior = atual;
            }
        }
        return maior;
    }
    
}


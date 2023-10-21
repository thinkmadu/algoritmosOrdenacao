//Esse código foi modificado, em listas que já estão ordenadas o algoritmo fará apenas uma verificação.

public class bubbleSort {
    public static void bubbleSort(int [] vetor){ 
        int tamanho = vetor.length;

        for (int i = 0; i < tamanho; i++) {
            boolean organizado = true;
            for (int j = 0; j < tamanho - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int auxiliar = vetor[j + 1];
                    vetor[j + 1] = vetor[j];
                    vetor[j] = auxiliar;
                    organizado = false;
                    } // fim do if
                } // fim do for interno
            if(organizado){
                break;
            }
        } // fim do for externo
    } // fim do método
} // fim da classe




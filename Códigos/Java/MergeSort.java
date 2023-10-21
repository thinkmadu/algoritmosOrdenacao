public class MergeSort {
    public static int[] mergeSort(int[] vetor){
        int tamanho = vetor.length;

        if(tamanho > 1){
            int meio = tamanho / 2;
            int [] esquerda = new int[meio];
            int [] direita = new int[tamanho - meio];

            System.arraycopy(vetor, 0, esquerda, 0, meio);

            if (vetor.length - meio >= 0) {
                System.arraycopy(vetor, meio, direita, 0, vetor.length - meio);
            }

            mergeSort(esquerda);
            mergeSort(direita);

            int i = 0, j = 0, k = 0;

            while (i < esquerda.length && j < direita.length) {
                if (esquerda[i] <= direita[j]) {
                    vetor[k] = esquerda[i];
                    i++;
                }
                else {
                    vetor[k] = direita[j];
                    j++;
                }
                k++;
            } //fim do while

            while (i < esquerda.length) {
                vetor[k] = esquerda[i];
                i++;
                k++;
            }

            while (j < direita.length) {
                vetor[k] = direita[j];
                j++;
                k++;
            }
        } //fim do if
        return vetor;
    } //fim do método
} //fim da classe

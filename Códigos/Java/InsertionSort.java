public class InsertionSort {
    public static int[] insertionSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int x = vetor[i];
            int j = i - 1;

            while (j >= 0 && x < vetor[j]) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
                vetor[j + 1] = x;
            } //fim do while
        } //fim do for
        return vetor;
    } //fim do método
} //fim da classe

public class CoutingSort {
    public static int numMax(int[] vetor) {
        if (vetor.length == 0) {
            return 0;
        }

        int max = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (max < vetor[i]) {
                max = vetor[i];
            }
        }
        return max;
    } //fim do método

    public static int[] countingSort(int[] vetor) {
        int aux = numMax(vetor);
        int n = (vetor.length > aux) ? vetor.length : aux + 1;
        int[] auxVetor = new int[n];
        for (int k : vetor) {
            auxVetor[k]++;
        }

        int j = 0;

        for (int i = 0; i < n; i++) {
            while (auxVetor[i] != 0) {
                vetor[j] = i;
                auxVetor[i]--;
                j++;
            }
        }
        return vetor;
    } //fim do método
} //fim da classe

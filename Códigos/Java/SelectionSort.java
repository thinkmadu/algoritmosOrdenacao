public class SelectionSort {
    public static int[] selectionSort(int[] vetor){
        int tamanho = vetor.length;
        for(int i = 0; i < tamanho; i++){
            int minimo = i;
            for(i +=1; i < tamanho; i++){
                if(vetor[i] < vetor[minimo]){
                    minimo = i;
                }
                vetor[i] = vetor[minimo];
                vetor[minimo] = vetor[i];
            } //fim do for interno
        } //fim do for externo
        return vetor;
    } //fim do método
}
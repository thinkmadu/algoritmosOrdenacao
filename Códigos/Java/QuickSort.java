public class QuickSort {
    public static void quickSort(int[] vetor) {
        metodoAux(vetor, 0, vetor.length - 1);
    }

    public static void metodoAux(int[] vetor, int primeiro, int ultimo) {
        if (primeiro < ultimo) {
            int meio = particionamento(vetor, primeiro, ultimo);
            metodoAux(vetor, primeiro, meio - 1);
            metodoAux(vetor, meio + 1, ultimo);
        }
    }

    public static int particionamento(int[] vetor, int primeiro, int ultimo) {
        int pivor = vetor[primeiro];
        int esquerda = primeiro + 1;
        int direita = ultimo;
        boolean pronto = false;

        while (!pronto) {
            while (esquerda <= direita && vetor[esquerda] <= pivor) {
                esquerda++;
            }

            while (direita >= esquerda && vetor[direita] >= pivor) {
                direita--;
            }

            if (direita < esquerda) {
                pronto = true;
            }
            else {
                int aux = vetor[esquerda];
                vetor[esquerda] = vetor[direita];
                vetor[direita] = aux;
            }
        } //fim do while

        int aux = vetor[primeiro];
        vetor[primeiro] = vetor[direita];
        vetor[direita] = aux;

        return direita;
    } //fim do método
} //fim da classe

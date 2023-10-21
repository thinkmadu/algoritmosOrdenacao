public class bubbleSort {
    public static void bubbleSortM(int [] vetor){ //versão melhorada
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
                return;
            }
        } // fim do for externo
    } // fim do método

    public static void bubbleSortB(int [] vetor){ //versão básica
        int tamanho = vetor.length;

        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho - 1; j++){
                if(vetor[j] > vetor[j + 1]){
                    int auxiliar = vetor[j + 1];
                    vetor[j + 1] =  vetor[j];
                    vetor[j] = auxiliar;
                } // fim do if
            } // fim do for interno
        } // fim do for externo
    } // fim do método

    public static void main(String[] args) {
        int [] vetorA = {20,510,9870,20,1,80,3,40,63,4};
        int [] vetorB = {20,510,9870,20,1,80,3,40,63,4};
//        int [] vetorA = {100,90,80,70,60,50,40,30,20,10};
//        int [] vetorB = {100,90,80,70,60,50,40,30,20,10};
//        int [] vetorA = {100,100,100,100,100,100,100,100,100,1};
//        int [] vetorB = {100,100,100,100,100,100,100,100,100,1};
//        int [] vetorA = {100,100,100,100,100,100,100,100};
//        int [] vetorB = {100,100,100,100,100,100,100,100};
//        int [] vetorA = {1,2,3,4,5,6,7,8,9,10};
//        int [] vetorB = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("- Vetor antes do Bubble sort normal: ");
        for (int i : vetorA) {
            System.out.print(i + " ");
        }
        System.out.println();

        long antesBBNormal = System.nanoTime();
        bubbleSortB(vetorA);
        long depoisBBNormal = System.nanoTime();

        System.out.print("- Vetor depois do Bubble sort normal: ");
        for (int j : vetorA) {
            System.out.print(j + " ");
        }
        System.out.println();
        long tempo1 = depoisBBNormal - antesBBNormal;
        System.out.println("- tempo em nanosegundos: " + tempo1);

        System.out.print("\n- Vetor antes do Bubble Sort melhorado: ");
        for (int i : vetorB) {
            System.out.print(i + " ");
        }
        System.out.println();

        long antesBBMelhorado = System.nanoTime();
        bubbleSortM(vetorB);
        long depoisBBMelhorado = System.nanoTime();

        System.out.print("- Vetor depois do Bubble Sort melhorado: ");
        for (int j : vetorB) {
            System.out.print(j + " ");
        }
        System.out.println();
        long tempo2 = depoisBBMelhorado - antesBBMelhorado;
        System.out.println("- tempo em nanosegundos: " + tempo2);
    }
} // fim da classe




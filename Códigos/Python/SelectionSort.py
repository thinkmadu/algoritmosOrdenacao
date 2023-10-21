def selectionSort(vetor):
    tamanho = len(vetor)

    for i in range(tamanho):
        minimo = i
        for i in range(i + 1, tamanho):
            if vetor[i] < vetor[minimo]:
                minimo = i
        (vetor[i], vetor[minimo]) = (vetor[minimo], vetor[i])
def bubbleSort(vetor):
    tamanho = len(vetor)

    for i in range(tamanho):
        organizado = True
        for j in range(tamanho - 1):
            if vetor[j] > vetor[j + 1]:
                auxiliar = vetor[j + 1]
                vetor[j + 1] = vetor[j]
                vetor[j] = auxiliar
                organizado = False
        if organizado:
            break

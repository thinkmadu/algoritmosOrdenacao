def insertionSort(vetor):
    for i in range(1, len(vetor)):
        x = vetor[i]
        j = i - 1

        while j >= 0 and x < vetor[j]:
            vetor[j + 1] = vetor[j]
            j = j - 1
        vetor[j + 1] = x

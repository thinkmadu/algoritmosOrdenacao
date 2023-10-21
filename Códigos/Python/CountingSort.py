def numMax(vetor):
    if len(vetor) == 0:
        return 0
    mx = vetor[0]
    for i in range(1, len(vetor)):
        if mx < vetor[i]:
            mx = vetor[i]
    return mx


def countingSort(vetor):
    aux = numMax(vetor)
    n = len(vetor) if len(vetor) > aux else aux + 1
    auxVetor = [0] * n
    for i in range(len(vetor)): auxVetor[vetor[i]] += 1
    j = 0
    for i in range(n):
        while auxVetor[i] != 0:
            vetor[j] = i
            auxVetor[i] -= 1
            j += 1
    return vetor

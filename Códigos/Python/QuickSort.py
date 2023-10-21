def quickSort(vetor):
    metodoAux(vetor, 0, len(vetor) - 1)


def metodoAux(vetor, primeiro, ultimo):
    if primeiro < ultimo:
        meio = particionamento(vetor, primeiro, ultimo)

        metodoAux(vetor, primeiro, meio - 1)
        metodoAux(vetor, meio + 1, ultimo)


def particionamento(vetor, primeiro, ultimo):
    pivor = vetor[primeiro]

    esquerda = primeiro + 1
    direita = ultimo

    pronto = False
    while not pronto:

        while esquerda <= direita and vetor[esquerda] <= pivor:
            esquerda = esquerda + 1

        while vetor[direita] >= pivor and direita >= esquerda:
            direita = direita - 1

        if direita < esquerda:
            pronto = True
        else:
            aux = vetor[esquerda]
            vetor[esquerda] = vetor[direita]
            vetor[direita] = aux

    aux = vetor[primeiro]
    vetor[primeiro] = vetor[direita]
    vetor[direita] = aux

    return direita

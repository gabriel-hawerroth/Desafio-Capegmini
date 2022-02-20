def imprime_escada(tamanho):
    qtd_espaco = tamanho - 1
    qtd_degrau = 1

    for item in range(tamanho):
        espaco = ' ' * qtd_espaco
        degrau = '*' * qtd_degrau
        print(espaco + degrau)
        qtd_espaco = qtd_espaco - 1
        qtd_degrau = qtd_degrau + 1

if __name__ == "__main__":
    print('com 6 linhas')
    imprime_escada(6)
    print('')
    print('com 20 linhas')
    imprime_escada(20)
    print('')
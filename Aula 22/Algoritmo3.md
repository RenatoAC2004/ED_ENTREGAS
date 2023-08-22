# **ALGORITMO 3**
Assumir que x está em A[1..n]

1.      Function BuscaBinaria(x){
2.        Esq =1 
3.        Dir =1
4.        Enquanto Esq <= Dir faça
5.            Meio = ( Esq + Dir ) /2
6.            se A[Meio] == x então 
7.                   Devolve meio
8.            Senao se x > A[meio] então
9.                   Esq = meio + 1 
10.               Senao 
11.                  Dir = meio + 1 
13.        Devolva -1

### Contagem de Instruções:

Linha 2: Executado 1 vez.

Linha 3: Executado 1 vez.

Linha 4: Executado px vezes.

Linha 5: Executado px vezes.

Linha 6: Executado px vezes

Linha 7: Executado 1 vez.  

Linha 8: Executado px - 1 vezes.

Linha 9: Executado px - 1 vezes.

Linha 11: Executado px - 1 vezes.

Linha 13: Executado 1 vez.

>#### _TOTAL DE INSTRUÇÕES:_ 2t + 1tpx + 4tpx + 2tpx + 2t(px - 1) + 2t(px - 1) + t ----> 3t + 7tpx + 2tpx - 2t + 2tpx - 2t ----> **RESPOSTA: 11tpx - t**
***
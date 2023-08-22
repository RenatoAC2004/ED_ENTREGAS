# **ALGORITMO 2**
Considerar que x esta em A[1..n]

1.     Function BuscaLinerarEmOrdem(A,n,x){
2.      i=1 
3.      enquanto i <= n e x >=A[i]
4.        se A[i] == x entao
5.              Devolva i
7.      i = i + 1 
9.      Devolva -1

### Contagem de Instruções:

Linha 2: Executado 1 vez.

Linha 3: Executado px vezes.

Linha 4: Executado px vezes.

Linha 5: Executado 1 vez.

Linha 7: Executado px - 1 vezes.

Linha 9: Executado 1 vez.

>#### _TOTAL DE INSTRUÇÕES:_ t + 4tpx + 2tpx + 2t(px - 1) + t ----> ~~2t~~ + 6tpx + 2tpx - ~~2t~~ ----> **RESULTADO: 8tpx**

>#### _PRIMEIRA POSIÇÃO:_ **RESPOSTA: 8t**

>#### _ÚLTIMA POSIÇÃO:_ **RESPOSTA: 8tn**
***
# **ALGORITMO 1**
Considerar que x está em A[1..n]

1.     Function BuscaLinerar(A,n,x){
2.       i = 1
3.       Enquanto i <= n faça
4.         Se A[i] == x então
5.              Devolva i
7.       i = i + 1
8.       Devolva -1

### Cálculo do tempo de execução:

Linha 2: 1t.

Linha 3: px vexes.

Linha 4: px vezes. 

Linha 5: 1t.

Linha 7: px - 1.

Linha 8: 1t.

>#### _TEMPO TOTAL:_ t + tpx + 2tpx + 2t(px - 1) -----> ~~t~~ + tpx + 2tpx + 2tpx - ~~2t~~ + ~~t~~ -----> **RESULTADO: 5tpx**

>#### _PRIMEIRA POSIÇÃO:_ **RESPOSTA: 5t**

>#### _ÚLTIMA POSIÇÃO:_ **RESPOSTA: 5tn**
***
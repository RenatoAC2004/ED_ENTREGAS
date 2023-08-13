# **ALGORITMO 1**

1.     Function BuscaLinerar(K){
2.       i = 1
3.       for (i < n; i++){
4.         se A[i] == k{
5.         devolve i
6.        }
7.       }
8.       devolve i
9.     }

### Contagem de Instruções:

Linha 2: Atribuição de valor para a variável "i" (**1 instrução**)

Linha 3: Nessa linha de código, o laço for começa. Ao final de **cada iteração** do laço for, é necessário executar uma instrução de incremento e uma de comparação. Sendo assim: (**2n instruções**) 

Linha 4: Nessa linha o comando "if" é executado, junto de sua expressão agregada. (**1 instrução**)  

Linha 5: Essa linha de código só será executada **caso a condição seja verdadeira**, ou seja, no pior caso, ela será executada "n" vezes. (**n instruções**)

Linha 8: Essa linha de código é sempre executada e retornará o valor da variável i. (**1 instrução**)

>#### _TOTAL DE INSTRUÇÕES:_ No pior caso, o número total de instruções que o algoritmo pode fazer é **3 + 3n instruções**.
***
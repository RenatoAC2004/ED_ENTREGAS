# **ALGORITMO 2**

1.     Function BuscaLinerarEmOrdem(K){
2.      i=1 
3.      enquanto i <= n e K >=A[i] {
4.        se A[i] == k entao
5.        devolve i
6.      }
7.      i = i + 1 7 
8.     }
9.      devolve -1
10.     }

### Contagem de Instruções:

Linha 2: Atribuição de valor para a variável "i" (**1 instrução**)

Linha 3: Nessa linha, o laço while começa. Ao final de **cada interação** do laço while, é necessário executar duas instruções de comparação. Sendo assim: (**2n instruções**)

Linha 4: Nessa linha o comando "if" é executado, junto de sua expressão agregada. (**1 instrução**)

Linha 5: Essa linha de código só será executada **caso a condição seja verdadeira**, ou seja, no pior caso, ela será executada "n" vezes. (**n instruções**)

Linha 7: Nessa linha de código, acontece uma atribuição de valor para a variável "i". (**1 instrução**)

Linha 9:  Caso não seja encontrado o elemento desejado, a função retorna -1 para indicar que o elemento não foi encontrado.. (**1 instrução**)

>#### _TOTAL DE INSTRUÇÕES:_ No pior caso, o número total de instruções que o algoritmo pode fazer é **4 + 3n instruções**.
***
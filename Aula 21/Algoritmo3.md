# **ALGORITMO 3**

1.      Function BuscaBinaria(x){
2.        esq =1 
3.        dir =n
4.        enquanto esq <= dir faca{
5.            meio = (( esq +dir ) /2)
6.            se A[ meio ] == x entao 
7.                   devolve meio
8.            senao se x > A[ meio ] entao
9.                   esq = meio + 1 
10.               senao 
11.                  dir = meio -1 
12.        }
13.        14 devolve -1
14.        }

### Contagem de Instruções:

Linha 2: Atribuição de valor para a variável "esq" (**1 instrução**)

Linha 3: Atribuição de valor para a variável "dir" (**1 instrução**)

Linha 4: Nessa linha, o laço while começa. Ao final de **cada interação** do laço while, é necessário executar uma instrução de comparação. Sendo assim: (**n instruções**)

Linha 5: Nessa linha de código, acontece uma atribuição de valor para a variável "meio". (**1 instrução**)

Linha 6: Nessa linha o comando "if" é executado, junto de sua expressão agregada. (**1 instrução**)

Linha 7: Essa linha de código só será executada **caso a condição anterior seja verdadeira**, ou seja, no pior caso, ela será executada "n" vezes. (**n instruções**)    

Linha 8: Porém, caso a condição da **linha 6** seja falsa, o comando "else if" é executado, junto de sua expressão agregada. (**1 instrução**)

Linha 9: Essa linha de código só será executada **caso a condição anteiror seja verdadeira**, ou seja, no pior caso, ela será executada "n" vezes. (**n instruções**)  

Linha 10: Linha 8: Porém, caso a condição da **linha 8** seja falsa, o comando "else" é executado, junto de sua expressão agregada. (**1 instrução**)

Linha 11: Essa linha de código só será executada **caso a condição anterior seja verdadeira**, ou seja, no pior caso, ela será executada "n" vezes. (**n instruções**)  

Linha 13: Caso não seja encontrado o elemento desejado, a função retorna -1 para indicar que o elemento não foi encontrado. (**1 instrução**)

>#### _TOTAL DE INSTRUÇÕES:_ Para que possamos considerar o pior caso, as condições da linha 6 e da linha 8 precisam ser falsas, enquanto a condição da linha 10 verdadeira. Isso resultará em um número maior de instruções. Sendo assim, no pior caso, o número total de instruções que o algoritmo pode fazer é **6 + 2n instruções**.
***
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int buscarValor(int k[], int valor) {
  for (int i = 0; i < 1000; i++) {
    if (k[i] == valor) {
      return i;
    }
  }
  return -1;
}

int main() {
  int k[1000];
  int valorInserido;
  clock_t Inicio;
  clock_t Fim;

  srand(time(NULL));
  for (int i = 0; i < 1000; i++) {
    k[i] = rand() % 1000;
  }

  printf("Digite o valor que deseja buscar: ");
  scanf("%d", &valorInserido);

  // Inicio do timer
  Inicio = clock();

  int indiceEncontrado = buscarValor(k, valorInserido);

  // Fim do timer
  Fim = clock();

  if (indiceEncontrado != -1) {
    printf("Valor encontrado no índice: %d\n", indiceEncontrado);
  } else {
    printf("Valor não encontrado no array.\n");
  }

  // Calculo para descobrir o tempo de resposta
  double tempoDeResposta = (double)(Fim - Inicio)/ CLOCKS_PER_SEC;

  printf("Tempo de resposta: %f segundos\n", tempoDeResposta);

  return 0;
}

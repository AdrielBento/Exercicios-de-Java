#Lista Estrutura
// Implementar as seguintes operacoes:
// • Operacao (funcao) que insere no inicio da lista;
// • Operacao (funcao) que insere de forma ordenada na lista;
// • Operacao (funcao) que exclui do inicio da lista;
// • Operacao (funcao) que exclui do fim da lista;
// Implementar a funcao main que faz uso desse TDA(Tipo de Dado Abstrato).
#include<stdio.h>
#define MAX_VETOR 5
// Definição da Estrutura Lista Linear Sequencial Estática
typedef struct Vetor{
  int dados[MAX_VETOR];
  int inicio, fim;
} Tipo_Lista;
//Operações que incidem sobre a estrutura
//Operação de Inserção no Final da Lista
int insere_fim_lista(Tipo_Lista *v, int dado){
  if(v->fim < MAX_VETOR){
    v->dados[v->fim] = dado;
    (v->fim)++;
    return 1;
  }
  return 0;
}

int insere_inicio_lista(Tipo_Lista *v, int dado){
  int posi;
  if(Tipo_Lista.prox[])
}

//Operação de Exclusão de um Determinado Elemento da Lista
int exclui_elem_lista(Tipo_Lista *v, int indice){
  int i, dado;
  if(v->fim != 0){
    //verifica se a lista esta vazia
    if((indice >=0) && (indice < v->fim)){
      //verifica se o indice esta correto
      if(indice == 0){
        //verifica se exclui o primeiro elemento
        if(exclui_inicio_lista(v, &dado)==1)
          printf("\nO elemento excluido da posicao %d foi: %d", indice, dado);
        return 1;
      }
      else{
        if(indice == v->fim-1){
          //verifica se exclui o ultimo elemento
          if(exclui_fim_lista(v, &dado)==1)
            printf("\nO elemento excluido da posicao %d foi: %d", indice, dado);
          return 1;
        }
        else{
          dado = v->dados[indice];
          for(i=indice; i < v->fim; i++)
          v->dados[i] = v->dados[i+1];
          (v->fim)--;
          printf("\nO elemento excluido da posicao %d foi: %d", indice, dado);
          return 1;
        }
      }
    }
    return -1;
  }
  return 0;
}
//Operação que Busca um Elemento na Lista
int busca_lista(Tipo_Lista v, int dado, int *indice){
  int i, achou = 0;
  for(i=0; i < v.fim-1; i++){
    if(v.dados[i] == dado){
      *indice = i;
      achou = 1;
      break;
    }
  }
  if(achou)
    return 1;
  return 0;
}
//Operação que Imprime os Elementos da Lista
int imprime_lista(Tipo_Lista V){
  int i;
  printf("\n\n\n");
  if(V.fim != 0){
    for(i=0; i < V.fim; i++)
    printf("\n%d", V.dados[i]);
    return 1;
  }
  return 0;
}
 

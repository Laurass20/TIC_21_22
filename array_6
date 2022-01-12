#include <stdio.h>
#include <string.h>
#include <stdlib.h>


int main(){
    //RESERVA DINAMICA DE MEMORIA
    char aux[100];//reservo una variable auxiliar para guardar de momemto la palabra
    int longitud;//defino el tamano
    printf("\nDime una palabra: ");
    scanf("%s",aux);
    longitud= strlen(aux);
    char *palabra;//palabra es un puntero (una variable que contiene una 
    //dirección de memoria de algo que es una letra
    palabra=(char*) malloc(longitud*sizeof(char)); //memory allocation
    strcpy(palabra,aux);
    printf("\nRESULTADO: ");
    printf("%s",palabra);
    return(0);
    
}

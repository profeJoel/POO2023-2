#include<stdio.h>
#include<string.h>

typedef struct jugador{
    char nombre[50];
    int numero;
    char posicion[50];
    int edad;
    float altura;
    float peso;
    char pie[10];
}futbolista;

int main(){
    printf("iniciado..\n");
    futbolista j1;
    //j1.nombre = "Alexis Sanchez";
    strcpy(j1.nombre, "Alexis Sanchez");
    j1.numero = 7;
    //j1.posicion = "delantero";
    strcpy(j1.posicion, "delantero");
    j1.edad = 34;
    j1.altura = 1.69;
    j1.peso = 62;
    //j1.pie = "derecho";
    strcpy(j1.pie,"derecho");

    printf("Valores asignados...\n");
    printf("El jugador es: %s %d %s %d %f %f %s", j1.nombre, j1.numero, j1.posicion, j1.edad, j1.altura, j1.peso, j1.pie);

    return 0;
}
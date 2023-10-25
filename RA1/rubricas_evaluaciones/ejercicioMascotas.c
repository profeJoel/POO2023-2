#include<stdio.h>

typedef struct animal{
    char nombre[20];
    char especie[50];
    char raza[50];
    char fechaNacimiento[12];
}Mascota;

int main(){
    Mascota firulais;
    printf("Ingrese nombre Mascota: ");
    gets(firulais.nombre);
    printf("Ingrese especie de la mascota: ");
    gets(firulais.especie);
    printf("Ingrese raza de la mascota: ");
    gets(firulais.raza);
    printf("Ingrese fecha de nacimiento de la mascota (dd/mm/aaaa) : ");
    gets(firulais.fechaNacimiento);

    printf("La mascota se llama %s de especie %s de la raza %s y nació el %s...", firulais.nombre, firulais.especie, firulais.raza, firulais.fechaNacimiento);

    return 0;
}
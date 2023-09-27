#include<stdio.h>

int totalCaracteres(char texto[]){
    int total;
    for(total=0; texto[total]!='\0'; total++);
    return total;
}

int totalCaracteresRecursivo(char texto[], int i){
    if(texto[i] == '\0')
        return i;
    else
        return totalCaracteresRecursivo(texto, i+1);
}

int main(){
    char palabra[30];
    printf("Ingrese una palabra por consola: ");
    gets(palabra);
    //printf("La palabra %s tiene %d caracteres", palabra, totalCaracteres(palabra));
    printf("La palabra %s tiene %d caracteres (funcion recursiva)", palabra, totalCaracteresRecursivo(palabra, 0)); return 0;
}

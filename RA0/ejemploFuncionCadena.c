#include<stdio.h>

int totalCaracteres(char texto[]){
    int total;
    for(total=0; texto[total]!='\0'; total++);
    return total;
}

int main(){
    char palabra[30];
    printf("Ingrese una palabra por consola: ");
    gets(palabra);
    printf("La palabra %s tiene %d caracteres", palabra, totalCaracteres(palabra));
    return 0;
}

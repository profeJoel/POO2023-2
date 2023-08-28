#include<stdio.h>

void ingresarMatriz(int M[3][3]){
    int i, j;
    for(i=0; i<3; i++)
        for(j=0; j<3; j++){
            printf("Ingrese el valor (%d,%d): ",i,j);
            scanf("%d", &M[i][j]);
        }
    printf("Datos Ingresados existosamente!\n");
}

void imprimirMatriz(int M[3][3]){
    int i, j;
    for(i=0; i<3; i++){
        for(j=0; j<3; j++)
            printf("%d ", M[i][j]);
        printf("\n");
    }
}

void verificarCuadradoMagico(int M[3][3]){
    int i, j;
    int sumaFila0 = 0, sumaFila1=0, sumaFila2=0;
    int sumaColumna0 = 0, sumaColumna1=0, sumaColumna2=0;
    int sumaPrincipal = 0, sumaSecundaria=0;
    for(i=0; i<3; i++){
        for(j=0; j<3; j++){
            if(i==0)
                sumaFila0 += M[i][j];
            if(i==1)
                sumaFila1 += M[i][j];
            if(i==2)
                sumaFila2 += M[i][j];

            if(j==0)
                sumaColumna0 += M[i][j];
            if(j==1)
                sumaColumna1 += M[i][j];
            if(j==2)
                sumaColumna2 += M[i][j];

            
            if(i==j)
                sumaPrincipal += M[i][j];
            if(i+j==2)
                sumaSecundaria += M[i][j];
            
        }
    }

    if(sumaFila0 == sumaFila1 && sumaFila1 == sumaFila2 && sumaFila2 == sumaColumna0 && sumaColumna0== sumaColumna1 && sumaColumna1 == sumaColumna2 && sumaColumna2== sumaPrincipal && sumaPrincipal== sumaSecundaria)
        printf("\nLa matriz M es un cuadrado magico!!!");
    else
        printf("\nLa matriz M NO ES magico!!!");

}

int main(){
    int M[3][3];
    ingresarMatriz(M);
    imprimirMatriz(M);
    verificarCuadradoMagico(M);
    return 0;
}
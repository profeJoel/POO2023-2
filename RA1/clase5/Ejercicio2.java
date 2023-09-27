import java.util.Scanner;

class Ejercicio2{

    static double fibonacci(double n){
        if(n== 1 || n==0)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double n;
        do{
            System.out.println("Ingrese un N positivo: ");
            n = lector.nextDouble();
        }while(n<=0);

        System.out.println("La serie fibonacci desde 0 hasta " + n + " es la siguiente: ");

        for(double i = 0; i<=n; i++)
            System.out.print(fibonacci(i) + ", ");

        System.out.println("Fin del programa.");
    }
}
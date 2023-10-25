def fibonacci(n:int)->int:
    if n==1 or n==0:
        return 1
    else:
        return fibonacci(n-1) + fibonacci(n-2)

if __name__ == "__main__":
    N = -1
    while(N<0):
        print("Ingrese un N positivo: ")
        N = int(input())
    
    for i in range(1,N+1):
        #print("Fib(" + str(i) + ") = " + str(fibonacci(i)))
        #print("Fib(",str(i),") = ",str(fibonacci(i)))
        print(f"Fib({i}) = {fibonacci(i)}")

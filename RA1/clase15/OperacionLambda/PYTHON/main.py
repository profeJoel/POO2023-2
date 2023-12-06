import math 

def doble(numero):
    return numero*2

def distancia(dX, dY):
    return math.sqrt(dX+dY)

if __name__ == "__main__":
    print(doble(5))

    # lambda (argumentos):(expresion)
    por_dos = lambda numero: numero*2
    print(por_dos(5))

    cuadrado = lambda a: a**2

    delta = lambda p1,p2: p2-p1

    x1, y1 = 1,1
    x2, y2 = 2,1

    print("La distancia es: ", distancia(cuadrado(delta(x1,x2)), cuadrado(delta(y1,y2))))

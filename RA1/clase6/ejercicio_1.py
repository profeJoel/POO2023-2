def potencia(b:int, e:int) -> int:
    return b**e

if __name__ == "__main__":
    base = int(input("Ingrese el valor de la base: "))
    exp = int(input("ingrese el valor del exponente: "))

    resultado = potencia(base, exp)

    print("El resultado de la potencia de " + str(base) + " exponente " + str(exp) + " es " + str(resultado))
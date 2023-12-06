from Animal import Animal
from Gato import Gato
from Perro import Perro

if __name__ == "__main__":
    arigato = Gato("Arigato", "felino", "angora", 50)
    firulais = Perro("Firulais", "canino", "Akita", 100)

    arigato.hace_sonido()
    firulais.hace_sonido()

    lista = []
    lista.append(arigato)
    lista.append(firulais)

    for a in lista:
        print(" El Animal se " + a.nombre)

    a1 = Animal()


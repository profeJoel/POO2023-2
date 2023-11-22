from Animal import Animal
from Gato import Gato
from Perro import Perro
from Erizo import Erizo

if __name__ == "__main__":

    a = Animal("","","",-1,-1)
    garfield = Gato("Garfield", "felino", "Persa", 42, 10, 10)
    clifford = Perro("Clifford", "Canino", "Labrador", 2, 113, "alto")
    Sonic = Erizo("Sonic", "Insectiboro", "Orejon", 15, 35, 6)

    garfield.sleep()
    clifford.sleep()
    Sonic.sleep()
    #a.sleep()

    garfield.eat()
    garfield.eat("Lazanna")
    """
    garfield.make_sound()
    clifford.make_sound()
    Sonic.make_sound()
    """

    lista = []
    lista = [None]*3 #Inicializacion de un arreglo vacio en python de 3 posiciones
    lista[0] = garfield
    lista[1] = clifford
    lista[2] = Sonic

    for a in lista:
        a.make_sound()
# llamar a la clase a utilizar
# from nombre_archivo import nombre_clase
from Gato import Gato

if __name__ == "__main__":
    # se crea el objeto con una variable y el constructor de la clase
    oscar = Gato("Oscar", "macho", 3, 7, "marron", "rayado")
    luna = Gato("Luna", "hembra", 2, 5, "gris", "lisa")

    print("Los nuevos gatos se llaman " + oscar.name + " y " + luna.name)

    oscar.eat()
    luna.meow()

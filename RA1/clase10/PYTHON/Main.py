# llamar a la clase a utilizar
# from nombre_archivo import nombre_clase
from Gato import Gato

if __name__ == "__main__":
    # se crea el objeto con una variable y el constructor de la clase
    oscar = Gato("Oscar", "macho", 3, 7, "marron", "rayado")
    luna = Gato("Luna", "hembra", 2, 5, "gris", "lisa")

    print("Los nuevos gatos se llaman " + oscar.get_name() + " y " + luna.get_name())

    oscar.eat()
    luna.meow()

    #Cambiar el color del gato
    oscar.set_color("verde")
    print("El color del gato " + oscar.get_name() + " es " + oscar.get_color())

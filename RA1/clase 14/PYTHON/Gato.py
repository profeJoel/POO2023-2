from Animal import Animal

class Gato(Animal):
    def __init__(self, nombre, especie, raza, flexibilidad):
        self.nombre = nombre
        self.especie = especie
        self.raza = raza
        self.flexibilidad = flexibilidad

    def hace_sonido(self):
        print(self.nombre + " esta maullando...")

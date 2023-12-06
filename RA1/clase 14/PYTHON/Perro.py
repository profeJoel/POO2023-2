from Animal import Animal

class Perro(Animal):
    def __init__(self, nombre, especie, raza, pedigri):
        self.nombre = nombre
        self.especie = especie
        self.raza = raza
        self.pedigri = pedigri

    def hace_sonido(self):
        print(self.nombre + " esta ladrando...")

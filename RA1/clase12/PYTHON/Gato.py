from Animal import Animal

class Gato(Animal):
    def __init__(self, nombre, especie, raza, edad, peso, flexibilidad):
        super().__init__(nombre, especie, raza, edad, peso)
        self.flexibilidad = flexibilidad

    def purr(self):
        print(self.nombre + " esta ronrroneando...")
    
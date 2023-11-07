from Animal import Animal

class Gato(Animal):
    def __init__(self, nombre, especie, raza, edad, peso, flexibilidad):
        super().__init__(nombre, especie, raza, edad, peso)
        self.flexibilidad = flexibilidad

    def purr(self):
        print(self.nombre + " esta ronrroneando...")

    def sleep(self):
        print(self.nombre + " es un gato que esta duermiendo.. zzz")

    
    def make_sound(self):
        print(self.nombre + " hace un miauu...")
    
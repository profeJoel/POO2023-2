from Animal import Animal

class Perro(Animal):
    def __init__(self, nombre, especie, raza, edad, peso, pedigri):
        super().__init__(nombre, especie, raza, edad, peso)
        self.pedigri = pedigri

    def bark(self):
        print(self.nombre + " esta ladrando...")
    

    def sleep(self):
        print(self.nombre + " es un perro que esta duermiendo.. zzz")

    
    def make_sound(self):
        print(self.nombre + " hace un guauu...")
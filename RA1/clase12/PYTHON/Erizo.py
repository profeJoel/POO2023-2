from Animal import Animal

class Erizo(Animal):

    def __init__(self, nombre, especie, raza, edad, peso, cant_puas):
        super().__init__(nombre, especie, raza, edad, peso)
        self.cant_puas = cant_puas

    def sleep(self):
        print(self.nombre + " es un erizo que esta duermiendo.. zzz")
    
    def make_sound(self):
        print(self.nombre + " hace quikquik..")
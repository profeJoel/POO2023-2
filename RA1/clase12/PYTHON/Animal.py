class Animal:
    def __init__(self, nombre, especie, raza, edad, peso):
        self.nombre = nombre
        self.especie = especie
        self.raza = raza
        self.edad = edad
        self.peso = peso

    def move(self):
        print(self.nombre + " se esta moviendo...")

    def eat(self):
        print(self.nombre + " se esta comiendo...")

    def make_sound(self):
        print(self.nombre + " hace un sonido...")
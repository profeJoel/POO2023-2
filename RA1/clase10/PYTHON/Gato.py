class Gato:
    # atributos
    #metodos

    def __init__(self, name, sex, age, weight, color, texture):
        self.name = name
        self.sex = sex
        self.age = age
        self.weight = weight
        self.color = color
        self.texture = texture

    def eat(self):
        print(self.name + " esta comiendo...")

    def move(self):
        print(self.name + " esta caminando...")

    def meow(self):
        print(self.name + " esta maullando...")

    def purr(self):
        print(self.name + " esta ronrroneando...")

    def hunt_mice(self):
        print(self.name + " esta cazando ratones...")
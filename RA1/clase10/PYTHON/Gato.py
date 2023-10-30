class Gato:
    # atributos
    #metodos

    def __init__(self, name, sex, age, weight, color, texture):
        self.__name = name
        self.__sex = sex
        self.age = age
        self.weight = weight
        self.__color = color
        self.__texture = texture

    def eat(self):
        print(self.__name + " esta comiendo...")

    def move(self):
        print(self.__name + " esta caminando...")

    def meow(self):
        print(self.__name + " esta maullando...")

    def purr(self):
        print(self.__name + " esta ronrroneando...")

    def hunt_mice(self):
        print(self.__name + " esta cazando ratones...")
    
    # Getter en Python

    def get_name(self):
        return self.__name
    
    def get_sex(self):
        return self.__sex

    def get_color(self):
        return self.__color

    def get_texture(self):
        return self.__texture

    
    #Setters

    def set_name(self, new_name):
        self.__name = new_name
    
    def set_sex(self, new_sex):
        if new_sex == "macho" or new_sex == "hembra":
            self.__sex = new_sex
        else:
            print("Cambio denegado.. :(")

    def set_color(self, new_color):
        if new_color in ["naranjo", "blanco", "negro", "gris", "marron"]:
            self.__color = new_color
        else:
            print("Cambio denegado.. :(")
            
    def set_texture(self, new_texture):
        if new_texture in ["rayado", "lisa", "pelado"]:
            self.__texture = new_texture
        else:
            print("Cambio denegado.. :(")


    
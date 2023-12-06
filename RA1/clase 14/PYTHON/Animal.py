from abc import ABC, abstractmethod

class Animal(ABC):
    nombre: str
    especie: str
    raza: str

    @abstractmethod
    def hace_sonido(self):
        pass
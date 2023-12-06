import sys

from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QWidget, QMainWindow, QVBoxLayout, QLabel, QPushButton

class Ventana(QMainWindow):
    def __init__(self):
        super().__init__()
        self.setWindowTitle("ejemplo 1 con PyQt6")
        self.setFixedSize(QSize(500,500))

        contenedor = QVBoxLayout()

        texto1 = QLabel("Hola, este es el ejemplo")
        boton1 = QPushButton("OK")

        contenedor.addWidget(texto1)
        contenedor.addWidget(boton1)

        escena = QWidget()
        escena.setLayout(contenedor)
        self.setCentralWidget(escena)
        self.show()

if __name__ == "__main__":
    app = QApplication(sys.argv)
    ventana = Ventana()
    app.exec()


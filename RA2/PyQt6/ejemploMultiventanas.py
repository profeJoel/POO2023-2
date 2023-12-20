import sys
from random import randint

from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QLabel, QPushButton, QVBoxLayout, QWidget, QLineEdit, QMessageBox, QDialog, QDialogButtonBox, QGridLayout

# QMainWindow: otorga el comportamiento de una ventana de inicio.
# QMessage : permiten mostrar informacion
# QDialog: Permiten intereacctuar con el usuario con botones simples.

#Ventana modal emergente
class OtraVentana(QWidget):
    def __init__(self, title):
        super().__init__()
        self.title = title
        self.setWindowTitle(self.title)

        panel = QGridLayout()

        texto = QLabel(f"Hola, estoy en la ventana: {self.title} -> {randint(0,100)}")
        panel.addWidget(texto, 0,0)
        self.setLayout(panel)
        #self.show()


class VentanaPrincipal(QMainWindow):

    def __init__(self):
        super().__init__()
        #self.nuevaVentana = None
        self.nuevaVentana = OtraVentana("Probando otra ventana")

        self.setWindowTitle("Probando QMessageBox y QDialog")
        self.setFixedSize(QSize(500,500))

        panel = QVBoxLayout()

        texto = QLabel("Bienvenido a probar las ventanas emergentes")
        boton = QPushButton("Aceptar")
        panel.addWidget(texto)
        panel.addWidget(boton)

        boton.clicked.connect(self.lanzar_ventana)

        escena = QWidget()
        escena.setLayout(panel)
        self.setCentralWidget(escena)
    
    def lanzar_ventana(self):
        # Primer opcion 
        # creación de ventanas en cada ocurrencia del evento
        #self.nuevaVentana = OtraVentana("Probando otra ventana")

        # Segunda Opcion
        # Revisión de existencia de ventanas
        # if self.nuevaVentana is None:# Se crea la ventana
        #     self.nuevaVentana = OtraVentana("Probando otra ventana")
        # else:# Se elimina la ventana
        #     self.nuevaVentana = None

        # Tercera OPcion 
        #Lanzar una única ventana y alterar su visibilidad
        if self.nuevaVentana.isVisible():
            self.nuevaVentana.hide()
        else:
            self.nuevaVentana.show()

if __name__ == "__main__":
    app = QApplication(sys.argv)
    ventana = VentanaPrincipal()
    ventana.show()
    app.exec()
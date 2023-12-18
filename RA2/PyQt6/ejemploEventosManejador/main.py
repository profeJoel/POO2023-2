from VentanaCreada import Ui_MainWindow

import sys
from PyQt6 import QtWidgets, uic

class Ventana(QtWidgets.QMainWindow, Ui_MainWindow):
    def __init__(self, *args, obj=None, **kwargs):
        super(Ventana, self).__init__(*args, **kwargs)

        self.setupUi(self) # Se genera la implementacion de la interfaz creada

        #Interaccion
        #Slots
        self.boton.clicked.connect(self.saludar)

    def saludar(self):
        self.texto.setText(self.campo.text())


if __name__ =="__main__":
    app = QtWidgets.QApplication(sys.argv)
    vista =Ventana()
    vista.show()
    app.exec()


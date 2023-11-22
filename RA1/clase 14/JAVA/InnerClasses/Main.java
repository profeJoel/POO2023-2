
public class Main {
    public static void main(String[] args) {
        //Coordenada punto1 = new Coordenada(0,0); No es posible

        //Exterior.Coordenada punto1 = new Exterior.Coordenada(0,0); No es posible

        Exterior filtro = new Exterior("Filtro exterior");

        //Exterior.Coordenada punto1 = filtro.new Coordenada(0,0);

        Exterior.Coordenada punto1 = filtro.getCoordenada(0,0);
    }    
}

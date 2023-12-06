class Main{
    public static void main(String[] args) {
        // Operacion lambda : (variable)->(accion)
        SerVivo perro = (comida) -> ("El perro se come : " + comida);
        implementarMetodoAbstracto(perro, " la tarea...");

    }

    public static void implementarMetodoAbstracto(SerVivo a, String comida){
        String nuevoString = a.come(comida);
        System.out.println(">>> " + nuevoString);
    }
}
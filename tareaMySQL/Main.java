package Tareas.tareaPoo;

public class Main {
    public static void main(String[] args) {
        ConexionBaseDeDatos conect = new ConexionBaseDeDatos();
        //conect.obtenerEstudiante();
        //conect.obtenerEstudianteApellido("Lopez");
        conect.obtenerEstudianteNombre("Breiner");
    }
}

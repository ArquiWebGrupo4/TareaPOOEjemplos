public class CEstudiante extends CPersona{
    private int CodigoEstudiante;

    // constructor
    public CEstudiante(String nombre, String apellido, int edad, int CodigoEstudiante) {
        super(nombre, apellido, edad);
        this.CodigoEstudiante = CodigoEstudiante;
    }

    public void mostrar() {
        System.out.println("Nombre: " + getNombre() +
                "\nApellido: " + getApellido() +
                "\nEdad: " + getEdad() +
                "\nCodigoEstudiante: " + CodigoEstudiante);
    }
}

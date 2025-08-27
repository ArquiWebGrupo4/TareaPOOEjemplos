//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class  estudiante {
    String nombre;
    int edad;
    public void Datos()
    {
        System.out.println("Nombre: "+nombre + " ,su edad es "+ edad);
    }
        public static void main(String[] args) {
            estudiante obj = new estudiante();
            obj.nombre = "Jairo";
            obj.edad = 20;
            obj.Datos();
        }
    }

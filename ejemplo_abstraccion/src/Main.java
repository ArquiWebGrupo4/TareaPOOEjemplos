abstract class Persona {
    public abstract void leer();

    public void dormir() {
        System.out.println("*durmiendo zzzz*");
    }
}
class Accion extends Persona {
    public void leer() {
        System.out.println("*leyendo macizo*");
    }
}
class Main{
    public static void main(String[] args) {
        Accion obj = new Accion();
        obj.leer();
        obj.dormir();
        System.out.println("https://www.w3schools.com/java/java_abstract.asp");
    }
}


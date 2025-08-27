//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Area {

    private int largo;
    private int ancho;

    // constructor to initialize values
    Area(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    public void SetLargo(int largo) {
        this.largo = largo;
    }
    public void SetAncho(int ancho) {
        this.ancho = ancho;
    }
    // method to calculate area
    public void getArea() {
        int area = largo * ancho;
        System.out.println("Area: " + area);
    }
    //Fuente: https://www.programiz.com/java-programming/encapsulation
}


public class Main {
    public static void main(String[] args) {
        Area area = new Area(50, 50);
        area.getArea();
        area.SetAncho(10);
        area.getArea();
    }
}
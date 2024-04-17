import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Presione '1' para seleccionar 'circulo' ");
        System.out.println("Presione '2' para seleccionar 'cuadrado' ");
        System.out.println("Presione '3' para seleccionar 'triangulo' ");
        System.out.println("Presione '4' para seleccionar 'rectangulo' ");
        System.out.println("Presione '5' para seleccionar 'pentagono' ");
        short e = sc.nextShort();

        switch (e) {
            case 1:
                System.out.println("Presiona 'p' para calcular el perimetro");
                System.out.println("Presiona 'a' para calcular el area");
                char a = sc.next().charAt(0);
                if (a=='p') {
                    System.out.println("Introduzca el valor del diametro(cm)");
                    double d = sc.nextDouble();
                    d = 3.1416*d;
                    System.out.println("El valor del perimetro es: " +d+"cm");
                }
                else {
                    System.out.println("Introduzca el valor del radio(cm)");
                    double r = sc.nextDouble();
                    r= 3.1416*(r*r);
                    System.out.println("El valor del area es: " +r+"cm2");
                }
                break;
            case 2:
                System.out.println("Presiona 'p' para calcular el perimetro");
                System.out.println("Presiona 'a' para calcular el area");
                a = sc.next().charAt(0);
                if (a=='p') {
                    System.out.println("Introduzca el valor del lado del cuadrado(cm)");
                    double d = sc.nextDouble();
                    d = d+d+d+d;
                    System.out.println("El valor del perimetro es: " +d+"cm");
                }
                else {
                    System.out.println("Introduzca el valor del lado del cuadrado(cm)");
                    double r = sc.nextDouble();
                    r= r*r;
                    System.out.println("El valor del area es: " +r+"cm2");
                }
                break;
            case 3:
                System.out.println("Presiona 'p' para calcular el perimetro");
                System.out.println("Presiona 'a' para calcular el area");
                a = sc.next().charAt(0);
                if (a=='p') {
                    System.out.println("Introduzca el valor del primer lado(cm)");
                    double d = sc.nextDouble();
                    System.out.println("Introduzca el valor del segundo lado(cm)");
                    double t = sc.nextDouble();
                    System.out.println("Introduzca el valor del tercer lado(cm)");
                    double f = sc.nextDouble();
                    d = d+t+f;
                    System.out.println("El valor del perimetro es: " +d+"cm");
                }
                else {
                    System.out.println("Introduzca el valor de la base(cm)");
                    double r = sc.nextDouble();
                    System.out.println("Introduzca el valor de la altura(cm)");
                    double h = sc.nextDouble();
                    r= (r*h)/2;
                    System.out.println("El valor del area es: " +r+"cm2");
                }
                break;
            case 4:
                System.out.println("Presiona 'p' para calcular el perimetro");
                System.out.println("Presiona 'a' para calcular el area");
                a = sc.next().charAt(0);
                if (a=='p') {
                    System.out.println("Introduzca el valor del lado horizontal(cm)");
                    double d = sc.nextDouble();
                    System.out.println("Introduzca el valor del lado vertical(cm)");
                    double t = sc.nextDouble();
                    d = (d*2)+(t*2);
                    System.out.println("El valor del perimetro es: " +d+"cm");
                }
                else {
                    System.out.println("Introduzca el valor de la base(cm)");
                    double r = sc.nextDouble();
                    System.out.println("Introduzca el valor de la altura(cm)");
                    double h = sc.nextDouble();
                    r= r*h;
                    System.out.println("El valor del area es: " +r+"cm2");
                }
                break;
            case 5:
                System.out.println("Presiona 'p' para calcular el perimetro");
                System.out.println("Presiona 'a' para calcular el area");
                a = sc.next().charAt(0);
                if (a=='p') {
                    System.out.println("Introduzca el valor de los lados(cm)");
                    double d = sc.nextDouble();
                    d = d*5;
                    System.out.println("El valor del perimetro es: " +d+"cm");
                }
                else {
                    System.out.println("Introduzca el valor del perimetro(cm)");
                    double r = sc.nextDouble();
                    System.out.println("Introduzca el valor de la apotema(cm)");
                    double h = sc.nextDouble();
                    r= (r*h)/2;
                    System.out.println("El valor del area es: " +r+"cm2");
                }
                break;
            default:
                System.out.println(("Por favor, introduzca una opcion valida"));
        }

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        String titulo;
        String autor;
        int añoPublicacion;
        int opcionMenu;
        String regresar;

        do {
            System.out.println("Biblioteca");
            System.out.println("Selecciona la opcion de tu preferencia");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros");
            System.out.println("3. Salir");
            opcionMenu = scanner.nextInt();

            do{
                switch (opcionMenu){
                    case 1:
                        System.out.println("1. Agregar libro");
                        System.out.println("Titulo:");
                        titulo = scanner.nextLine();
                        scanner.nextLine();
                        System.out.print("Autor:");
                        autor = scanner.nextLine();
                        System.out.print("Año de publicacion:");
                        añoPublicacion = scanner.nextInt();
                        Libro libro1 = new Libro(titulo,autor,añoPublicacion);
                        break;
                    case 2:
                        System.out.println("2. Mostrar libros");
                        biblioteca.mostrarLibros();
                        break;
                    case 3:
                        System.out.println("3. Salir");
                        break;
                    default:
                }
            }while(opcionMenu > 3 || opcionMenu< 1);

                System.out.println("Quieres hacer otra operacion? S/N");
                regresar=scanner.next();

        }while(regresar.equalsIgnoreCase("S"));

    }
}
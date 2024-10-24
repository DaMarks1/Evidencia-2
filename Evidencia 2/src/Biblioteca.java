import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca(){
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public void mostrarLibros(){
        if(libros.isEmpty()){
            System.out.println("No hay libros en la biblioteca");
        }else{
        }
        for(Libro i: libros){
            System.out.println(i);
        }
    }


}

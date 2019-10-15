
public class Seleccion
{
    Integer id;
    String nombre, apellido;
    Short edad;

    public Seleccion(){}
    
    public Seleccion(Integer id, String nombre, String apellido, Short edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Short getEdad() {
        return edad;
    }

    public void setEdad(Short edad) {
        this.edad = edad;
    }
    
    public void espacios(){
    System.out.println("La seleccion esta en un espacio de concentracion");
    }
    
    public void viajes(){
    System.out.println("La seleccion viaja");
    }
}

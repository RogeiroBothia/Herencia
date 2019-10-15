
public class Futbolistas extends Seleccion
{
    Short dorsal;
    String posicion;
    
    public Futbolistas(){}
    
    public Futbolistas(Integer id, String nombre, String apellido, Short edad, Short dorsal, String posicion){
    
    super(id,nombre,apellido,edad);
    this.dorsal= dorsal;
    this.posicion= posicion;
    }
    
    public Short getDorsal(){
    return dorsal;
    }
    
    public void setDorsal(Short dorsal){
    this.dorsal=dorsal;
    }
    
    public String getPosicion(){
    return posicion;
    }
    
    public void setPosicion(String Posicion){
    this.posicion=posicion;
    }
    
    @Override
     public void espacios(){
    System.out.println("concentrandose");
    }
    
    @Override
    public void viajes(){
    System.out.println("Viajando");
    }
    
    public void entrenar(){
    System.out.println("Entrenando");
    }
}


public class Masajistas 
{
    String titulacion;
    Short experiencia;
    
    public Masajistas(){}
    
    public Masajistas(String titulacion,Short experiencia){
    
    this.titulacion=titulacion;
    this.experiencia=experiencia;
    }
    
    public String getTitulacion(){
    return titulacion;
    }
    
    public void setTitulacion(String titulacion){
    this.titulacion=titulacion;
    }
    
    public Short getExperiencia(){
    return experiencia;
    }
    
    public void setExperiencia(Short experiencia){
    this.experiencia=experiencia;
    }
    
    public void masajear(){
    System.out.println("masajeando");
    }
}

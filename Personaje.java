public class Personaje {
    public String nombre;
    public String raza;
    public Integer nivel;
    public String edad;
    private String secreto;
    private String habilidades;
    
    public Personaje(String nombre, String raza, Integer nivel, String edad, String secreto, String habilidades){
        this.nombre = nombre;
        this.raza = raza;
        this.nivel = nivel;
        this.edad = edad;
        this.secreto = secreto;
        this.habilidades = habilidades;
    }

    public String getSecreto(){
        return secreto;
    }

    public String getHabilidades(){
        return habilidades;
    }
    public void mostrarInforPersonaje(){
        System.out.println("Nombre del personaje: " + nombre);
        System.out.println("Raza del personaje: " + raza);
        System.out.println("Nivel del personaje: " + nivel);
        System.out.println("Secreto del personaje: " + getSecreto());
        System.out.println("Habilidades del personaje: " + getHabilidades());
    }
    public void personajeActuando(){
        System.out.println("El personaje" + nombre + "esta quieto");
    }
}

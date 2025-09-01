public class Bruja extends Personaje{
    Bruja(String nombre, String raza, Integer nivel, String edad, String secreto, String habilidades) {
        super(nombre, raza, nivel, edad, secreto, habilidades);
    }
    
     @Override
    public void personajeActuando(){
        System.out.println("El personaje " + nombre + " " + raza + " de nivel " + nivel + " esta haciendo una posión");
    }
}

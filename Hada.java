public class Hada extends Personaje{

        Hada(String nombre, String raza, Integer nivel, String edad, String secreto, String habilidades){
             super(nombre, raza, nivel, edad, secreto, habilidades);
        }
    
     @Override
    public void personajeActuando(){
        System.out.println("El personaje " + nombre + " " + raza + "de nivel " + nivel + " esta volando");
    }
}

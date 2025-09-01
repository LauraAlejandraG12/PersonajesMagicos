public class Main{
    public static void main(String[]args){
        Personaje hada = new Hada("Elary", "Hada", 250, "100 años", "Tiene el poder de hacer olvidar los recuerdos", "Rejuvenece cada 2 años");
        Personaje bruja = new Bruja("Syrell", "Bruja", 400, "550 años", "Hace pociones para que las personas se vuelvan inmortale", "Cambia de apariencia");
        Personaje mounstruo = new Mounstruo("mike wasouski", "Mounstruo", 700, "180 años", "Tortura a las hadas en secreto", "Fuerza");
        hada.mostrarInforPersonaje();
        bruja.mostrarInforPersonaje();
        mounstruo.mostrarInforPersonaje();

        Personaje[] Personaje = new Personaje[3];

        Personaje[0] = new Hada("Elary", "Hada", 250, "100 años", "Tiene el poder de hacer olvidar los recuerdos", "Rejuvenece cada 2 años");
        Personaje[1] = new Bruja("Syrell", "Bruja", 400, "550 años", "Hace pociones para que las personas se vuelvan inmortale", "Cambia de apariencia");
        Personaje[2] = new Mounstruo("mike wasouski", "Mounstruo", 700, "180 años", "Tortura a las hadas en secreto", "Fuerza");

        for(Integer i = 0; i< Personaje.length; i++){
            Personaje[i].personajeActuando();
        }
    }

}
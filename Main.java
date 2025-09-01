public class Main{
    public static void main(String[]args){
        Personaje hada = new Hada("Elary", "Hada", 250, "100 años", "Tiene el poder de hacer olvidar los recuerdos", "Rejuvenece cada 2 años");
        Personaje bruja = new Bruja("Syrell", "Bruja", 400, "550 años", "Hace pociones para que las personas se vuelvan inmortale", "Cambia de apariencia");
        Personaje mounstruo = new Mounstruo("mike wasouski", "Mounstruo", 700, "180 años", "Tortura a las hadas en secreto", "Fuerza");
        hada.mostrarInforPersonaje();
        bruja.mostrarInforPersonaje();
        mounstruo.mostrarInforPersonaje();

        hada.personajeActuando();
        bruja.personajeActuando();
        mounstruo.personajeActuando();
    }

}
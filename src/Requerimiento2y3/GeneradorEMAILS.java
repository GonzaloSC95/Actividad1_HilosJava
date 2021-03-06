package Requerimiento2y3;

import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public final class GeneradorEMAILS {

    ///////////////////////////////////////////////////////////////////////////////
    private final LinkedList<String> destinatarios = new LinkedList<>();
    private final LinkedList<String> remitentes = new LinkedList<>();
    private final LinkedList<String> asuntos = new LinkedList<>();
    private final LinkedList<String> cuerpos = new LinkedList<String>();

    //////////////////////////////////////////////////////////////////////////////
    //CONSTRUCTOR
    public GeneradorEMAILS() {
        cargarDestinatarios();
        cargarRemitentes();
        cargarAsuntos();
        cargarCuerpos();
        //---------------------
    }

    //METODOS----------------------------------
    public String getDestinatario() {
        int ramd, desde, hasta;
        desde = 0;
        hasta = destinatarios.size();
        ramd = ThreadLocalRandom.current().nextInt(desde, hasta);

        String nombre = destinatarios.get(ramd);
        destinatarios.remove(nombre);

        return nombre;
    }

    public String getRemitente() {
        int ramd, desde, hasta;
        desde = 0;
        hasta = remitentes.size();
        ramd = ThreadLocalRandom.current().nextInt(desde, hasta);

        String nombre = remitentes.get(ramd);
        remitentes.remove(nombre);

        return nombre;
    }

    public void cargarDestinatarios() {
        String[] nombres = {"Gonzalo", "Pedro", "Juan", "Ramiro", "Julio", "Ramon", "Pepe",
            "Julius", "Sandocan", "Sara", "Miguel", "Rubencio", "Venom", "Spiderman", "Steve", "Sandra",
            "Susana", "Pepa", "Juancar", "Santiago", "Carmelo", "Ironman", "Roberto", "Alex", "Maria", "Chus",
            "Mar", "Carmen", "Ramona", "pikachu@gmail.com"};
        String[] apellidos = {"Solis", "Campos", "Garcia", "Moreno", "Rosas", "Cardenal", "Hierro",
            "Villa", "Martin", "Sanz", "el Flaco", "el Gordo", "Venancio", "el Alto", "el Bueno", "el Listo",
            "Admin", "Ramirez", "Cesar", "Marcos", "Hielo", "Fuego", "Random", "Hippie", "Chivas", "Rogers",
            "Gertru", "Carca", "Ramona", "El Verde"};
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals("pikachu@gmail.com")) {
                destinatarios.add(nombres[i]);
            } else {
                destinatarios.add(nombres[i] + " " + apellidos[i]);
            }

        }
    }

    public void cargarRemitentes() {
        String[] nombres = {"Gonzalo", "Pedro", "Juan", "Ramiro", "Julio", "Ramon", "Pepe",
            "Julius", "Sandocan", "Sara", "Miguel", "Rubencio", "Venom", "Spiderman", "Steve", "Sandra",
            "Susana", "Pepa", "Juancar", "Santiago", "Carmelo", "Ironman", "Roberto", "Alex", "Maria", "Chus",
            "Mar", "Carmen", "Ramona", "Hulk"};
        String[] apellidos = {"Solis", "Campos", "Garcia", "Moreno", "Rosas", "Cardenal", "Hierro",
            "Villa", "Martin", "Sanz", "el Flaco", "el Gordo", "Venancio", "el Alto", "el Bueno", "el Listo",
            "Admin", "Ramirez", "Cesar", "Marcos", "Hielo", "Fuego", "Random", "Hippie", "Chivas", "Rogers",
            "Gertru", "Carca", "Ramona", "El Verde"};
        for (int i = 0; i < nombres.length; i++) {
            remitentes.add(nombres[i] + " " + apellidos[i]);
        }
    }

    ///------------------------------------------
    public void cargarAsuntos() {
        String[] asunt = {"Urgente", "Importante", "Aviso", "Comunicado", "Urgencia Maxima", "Notificaci??n"};
        for (int i = 0; i < asunt.length; i++) {
            asuntos.add(asunt[i]);
        }
    }

    public String getAsunto() {
        int ramd, desde, hasta;
        desde = 0;
        hasta = asuntos.size();
        ramd = ThreadLocalRandom.current().nextInt(desde, hasta);

        String asunto = asuntos.get(ramd);
        //remitentes.remove(nombre);

        return asunto;
    }

    public void cargarCuerpos() {
        String[] frases = {"Wikipedia en espa??ol es la edici??n en espa??ol de Wikipedia", "Al igual que las versiones existentes de Wikipedia en otros idiomas",
            "Comenz?? su andadura en mayo de 2001", "Alegria ,Alegria!", "!EXAMEN??", "Wikipedia en espa??ol tiene 6 353 231 usuarios",
            "la mayor??a de los participantes de esta edici??n mostraron su desacuerdo", "participaci??n en la pol??tica de Wikipedia y la fundaci??n que la sostiene de financiarse", "!URRA!",
            "Clasificaci??n por n??mero de art??culos", "Wikipedia en espa??ol volvi?? a superar a Wikipedia en portugu??s", "!SARANDONGA NOS VAMO A COME??", "Venom el venas", "Spiderman es un friki",
            "Steve es el capi", "Sandra es muy guapa", "Ninguna pol??tica debe estar en contradicci??n con estos pilares", "Pepa y agua pa la seca!", "Juancarlitros!!!",
            "Rumba Rumba!!", "Carmelo", "Se recomienda el uso de GITHUB para realizar el trabajo de grupo", "Roberto es un crack!", "Alex es la leche", "Carolina! tratame bien!",
            "Este mensaje esta vacio", "Maricarmen!!", "Carmencita de mis amores!!", "Ahihop ahihop!!", "Hulk es un tio fuerte"};
        for (int i = 0; i < frases.length; i++) {
            cuerpos.add(frases[i]);
        }
    }

    public String getCuerpo() {
        int ramd, desde, hasta;
        desde = 0;
        hasta = cuerpos.size();
        ramd = ThreadLocalRandom.current().nextInt(desde, hasta);

        String cuerpo = cuerpos.get(ramd);
        cuerpos.remove(cuerpo);

        return cuerpo;
    }
    //--------------------------------------------
}

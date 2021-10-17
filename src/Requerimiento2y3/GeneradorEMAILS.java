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
        String[] asunt = {"Urgente", "Importante", "Aviso", "Comunicado", "Urgencia Maxima", "Notificación"};
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
        String[] frases = {"Wikipedia en español es la edición en español de Wikipedia", "Al igual que las versiones existentes de Wikipedia en otros idiomas",
            "Comenzó su andadura en mayo de 2001", "Alegria ,Alegria!", "!EXAMEN¡", "Wikipedia en español tiene 6 353 231 usuarios",
            "la mayoría de los participantes de esta edición mostraron su desacuerdo", "participación en la política de Wikipedia y la fundación que la sostiene de financiarse", "!URRA!",
            "Clasificación por número de artículos", "Wikipedia en español volvió a superar a Wikipedia en portugués", "!SARANDONGA NOS VAMO A COME¡", "Venom el venas", "Spiderman es un friki",
            "Steve es el capi", "Sandra es muy guapa", "Ninguna política debe estar en contradicción con estos pilares", "Pepa y agua pa la seca!", "Juancarlitros!!!",
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

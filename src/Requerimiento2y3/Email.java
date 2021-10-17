package Requerimiento2y3;

public class Email {

    ///////////////////////////////
    private static int contador = 1;
    //ATRIBUTOS
    private String destinatario, remitente;
    private String asunto, cuerpo;
    private int id;

    //CONSTRUCTOR
    public Email() {
        GeneradorEMAILS email = new GeneradorEMAILS();
        this.destinatario = email.getDestinatario();
        this.remitente = email.getRemitente();
        this.asunto = email.getAsunto();
        this.cuerpo = email.getCuerpo();
        this.id = contador;
        contador++;
    }

    //GETTER
    public String getDestinatario() {
        return destinatario;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public int getId() {
        return id;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Email-id: " + id + " {"
                + ConsolaCOLOR.letraAzul + "Destinatario: " + ConsolaCOLOR.letraNegro + destinatario
                + ConsolaCOLOR.letraAzul + "| Remitente: " + ConsolaCOLOR.letraNegro + remitente
                + ConsolaCOLOR.letraAzul + "| Asunto: " + ConsolaCOLOR.letraNegro + asunto
                + ConsolaCOLOR.letraAzul + "| Cuerpo: " + ConsolaCOLOR.letraNegro + cuerpo + ".}\n";
    }

    public String stringFile() {
        return "\nEmail ----> " + id + " {"
                + "Destinatario: " + destinatario
                + "| Remitente: " + remitente
                + "| Asunto: " + asunto
                + "| Cuerpo: " + cuerpo + ".}\n";
    }

    //SETTER
    public void setDestinatario(String dest) {
        this.destinatario = dest;
    }

}

package Requerimiento2y3;

import java.util.LinkedList;
import java.util.Queue;

public class Buzon {

    private final static int MAX_EMAILS = 5;
    private final Queue<Email> ColaBuzon = new LinkedList<>();

    //INTRODUCIR MENSAJE
    public synchronized void insertar_Mensaje(Email em) {
        //CONTROLANDO EL DESTINATARIO PROHIBIDO
        String destinatarioProhibido = "pikachu@gmail.com";
        if (em.getDestinatario().equals(destinatarioProhibido)) {
            System.err.println("ERROR!! EL DESTINATARIO " + destinatarioProhibido + " NO ES BIEN RECIBIDO EN ESTA COMUNIDAD, TU MENSAJE SERÁ DESECHADO :(\n");
            //-----------------------------------------------------
            //em = new Email();
            em.setDestinatario("Darth Vader");
            while (ColaBuzon.size() == MAX_EMAILS) { //Nº MAX DE EMAILS = 5           
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }

            try {
                Thread.sleep(500);
                ColaBuzon.offer(em);
            } catch (InterruptedException ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }

            //-----------------------------------------------------------------------------
        } else {//MIENTRAS EL BUZON ESTE LLENO, LOS PRODUCTORES PARAN DE INSERTAR MENSAJES
            while (ColaBuzon.size() == MAX_EMAILS) { //Nº MAX DE EMAILS = 5           
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }

            try {
                Thread.sleep(500);
                ColaBuzon.offer(em);
            } catch (InterruptedException ex) {
                System.out.println("ERROR: " + ex.getMessage());
            }

        }
        //--------------------------------------------------------------------------------
        notify();
    }

    //SACAR MENSAJE
    public synchronized Email sacar_Mensaje() {

        while (ColaBuzon.isEmpty()) { //SOLO SE CONSUMEN EMAILS, SI HAY EMAILS           
            try {

                wait();

            } catch (InterruptedException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        Email email = ColaBuzon.poll();
        notify();
        return email;
    }

}

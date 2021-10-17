package Requerimiento2y3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Consumidor extends Thread {

    //----------------------------------------------------------------
    private Buzon buzon;

    //CONSTRUCTOR
    public Consumidor(String nombre, Buzon buzon) {
        super();
        this.setName(nombre);
        this.buzon = buzon;

    }

    @Override
    public void run() {
        //ESCRIBIMOS FICHERO PARA COMPROBAR TODOS LOS EMAILS QUE SE HAN ESCRITO
        File file = new File("Emails.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));

            for (int i = 0; i < 15; i++) {

                Email e = buzon.sacar_Mensaje();
                System.out.println(Thread.currentThread().getName() + " LEYENDO EMAIL -----> " + e);
                bw.write(e.stringFile());

            }

            bw.close();
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }

    }
}

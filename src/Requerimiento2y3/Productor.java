package Requerimiento2y3;

public class Productor extends Thread {

    private Buzon buzon;

    public Productor(String nombre, Buzon buzon) {
        super();
        this.setName(nombre);
        this.buzon = buzon;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Email e = new Email();
            buzon.insertar_Mensaje(e);
            //System.out.println(Thread.currentThread().getName() + " CARGANDO EMAIL ------> " + e);
            System.out.println(Thread.currentThread().getName() + " CARGANDO EMAIL CON ID " + e.getId() + "\n");

        }

    }
}

package Requerimiento1;

public class Numero extends Thread {

    //CONTADOR
    private static int contador = 1;
    //ATRIBUTOS
    private final int numero;
    private final int mostrarContador;

    //CONSTRUCTOR
    public Numero(int numero) {
        super();
        this.numero = numero;
        this.mostrarContador = contador;
        this.setName("Hilo " + mostrarContador);
        contador++;
    }

    //METODO RUN DEL HILO/OBJETO
    //METODO PARA AVERIGUAR SI ES UN NUMERO PRIMO O NO
    @Override
    public void run() {
        //COLORES DE FORMATEO - TERMINAL
        String blue = "\u001B[34m";
        String black = "\u001B[0m";
        //INICIO - FIN - TIEMPO DE EJECUCION
        long inicio = System.nanoTime();
        long fin, tiempoDeEjecucion;
        //PARA SABER SI UN NUMERO ES PRIMO O NO TENEMOS QUE DIVIDIRLO ENTRE TODOS LOS NUMEROS
        //QUE LE PRECEDEN, SI TIENE MAS DE 2 DIVISORES 1 O SI MISMO, NO ES PRIMO.
        int contadorDePrimos = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0 && numero != 0 && numero != 1) {
                contadorDePrimos++;
            }
        }
        
        if (contadorDePrimos <= 2 && numero != 1 && numero != 0) {
            //TIEMPO DE EJECUCION
            fin = System.nanoTime();
            tiempoDeEjecucion = fin - inicio;
            //---------------------------------------
            System.out.println("El nº " + numero + ", corresponde al " + Thread.currentThread().getName() + " y es primo. - "
                    + blue + "TIEMPO DE EJECUCION: " + (tiempoDeEjecucion) + " NanoSegundos\n" + black);
            
        } else {
            //TIEMPO DE EJECUCION
            fin = System.nanoTime();
            tiempoDeEjecucion = fin - inicio;
            //----------------------------------------
            System.out.println("El nº " + numero + ", corresponde al " + Thread.currentThread().getName() + " y no es primo. - "
                    + blue + "TIEMPO DE EJECUCION: " + (tiempoDeEjecucion) + " NanoSegundos\n" + black);
        }
        
    }

    //TO STRING

    @Override
    public String toString() {
        return "Numero{" + "numero = " + numero + ", Contador = " + mostrarContador + '}';
    }
    
    
}

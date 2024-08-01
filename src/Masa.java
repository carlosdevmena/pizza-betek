package src;

public class Masa {
    private int pesoHarina; //gramos
    private int agua; //mili litros
    private int aceiteOliva; //cucharadas
    private int levadura; // gramos
    private int sal; // pizca

    public Masa() {
        this.pesoHarina = 400;
        this.agua = 200;
        this.aceiteOliva = 2;
        this.levadura = 15;
        this.sal = 1;
    }

    public Masa(int pesoHarina, int agua, int aceiteOliva, int levadura, int sal) {
        this.pesoHarina = pesoHarina;
        this.agua = agua;
        this.aceiteOliva = aceiteOliva;
        this.levadura = levadura;
        this.sal = sal;
    }

    public void mezclarIngredientes(int pesoHarina, int agua, int aceiteOliva, int levadura, int sal){
        try {
            System.out.println("Los ingredientes se estan mezclando...");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("El hilo fue interrumpido.");
        }
        System.out.println("Se han mezclado bien los ingrediente.");
    }

    public void amasarMasa(){
        try {
            System.out.println("Se debe amasar para que la masa quede bonita");
            System.out.println("Es cansado pero necesario only wait.");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("El hilo fue interrumpido.");
        }
        System.out.println("Se ha mezclado correctamente la masa.");
    }

    public void estirarMasa(){
        try {
            System.out.println("Se debe estirar la masa para poner los ingredientes.");
            System.out.println("Es cansado pero necesario only wait.");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("El hilo fue interrumpido.");
        }
        System.out.println("Se ha estirado correctamente la masa.");
        System.out.println("Ahora agrega los ingredientes.");
    }
}

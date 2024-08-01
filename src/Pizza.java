package src;

public class Pizza {
        private Tomate tomate;
        private Champiñones champiñones;
        private Mozzarella mozzarella;

        // Constructor de la clase Pizza
        public Pizza() {
            this.tomate = new Tomate();
            this.champiñones = new Champiñones();
            this.mozzarella = new Mozzarella();
        }

        // Método para agregar todos los ingredientes a la pizza
        public void prepararPizza() {
            tomate.agregar();
            champiñones.agregar();
            mozzarella.agregar();
            masa.agregar();
            System.out.println("Pizza lista para llevar");
        }

        // Método main para ejecutar el programa
        public static void main(String[] args) {
            Pizza pizza = new Pizza();
            pizza.prepararPizza();
        }
    }


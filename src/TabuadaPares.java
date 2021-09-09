public class TabuadaPares {

    public static void main(String[] args) {

        int cont = 0;
        int tabuada = 0;
        System.out.println("Tabuada dos pares até 20 \n");
        for (cont = 1; cont <= 20; cont++) {
            if (cont % 2 == 0) {
                System.out.println("Tabuada de " + cont);
                for (tabuada = 1; tabuada <= 10; tabuada++) {
                    System.out.println(cont + " x " + tabuada + " = " + cont * tabuada);
                }
                System.out.println("........................");
            }
        }
    }
}

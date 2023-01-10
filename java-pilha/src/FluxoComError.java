
public class FluxoComError {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException e) {
            String msg = e.getMessage();
            //System.out.println(e);
            System.out.println("Exception "+ msg);
            e.printStackTrace();
        }
        System.out.println("Fim do main");

    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("ini do método 2");
        metodo2();
        System.out.println("Fim do método 2");

        //throw new ArithmeticException("Error!");
        //System.out.println("Fim do metodo2");
    }
}

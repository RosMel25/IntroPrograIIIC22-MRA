package practicaprogra10acuario;

public class PracticaProgra10ACUARIO {

    private static boolean[] especies;
    private static String precioMayor;
    private static String precioMenor;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(especies[i]);

            System.out.println("Número Mayor es: " + precioMayor);
            System.out.print("Número Menor es: " + precioMenor);
            System.out.println("");
        }
    }
}

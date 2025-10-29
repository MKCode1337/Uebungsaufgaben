package lektion3;
import java.util.Scanner;
public class pizzaRechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final float PI = 3.1414f;

        System.out.println("Geben Sie den Durchmesser der ersten Pizza in cm ein:");
        float durchmesserPizza1 = scanner.nextFloat();
        float flaechePizza1 = PI*(durchmesserPizza1/2);
        System.out.println("Geben Sie den Preis der ersten Pizza in Euro ein:");
        float preisPizza1 = scanner.nextFloat();

        System.out.println("Geben Sie den Durchmesser der zweiten Pizza in cm ein:");
        float durchmesserPizza2 = scanner.nextFloat();
        float flachePizza2 = PI*(durchmesserPizza2/2);
        System.out.println("Geben Sie den Preis der zweiten Pizza in Euro ein:");
        float preisPizza2 = scanner.nextFloat();

        float pizzaProEuro1 = flaechePizza1/preisPizza1;
        float pizzaProEuro2 = flachePizza2/preisPizza2;

        // Pizzapreise pro cm² ausgeben
        //System.out.println("Pizza pro Euro 1: " + pizzaProEuro1);
        //System.out.println("Pizza pro Euro 2: " + pizzaProEuro2);

        if  (pizzaProEuro1 == pizzaProEuro2) {
            System.out.println("Beide Pizzen haben das gleiche Preis-/Leistungsverhältnis");
        }
        else if (pizzaProEuro1 > pizzaProEuro2) {
            System.out.println("Pizza 1 hat das bessere Preis-/Leistungsverhältnis");
        }
        else {
            System.out.println("Pizza 2 hat das bessere Preis-/Leistungsverhältnis");
        }
        scanner.close();
    }
}

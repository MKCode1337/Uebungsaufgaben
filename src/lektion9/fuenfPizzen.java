package lektion9;

public class fuenfPizzen {
    public static void main(String[] args) {
        int anzahlPizzen = 5;
        Pizza[] pizzas = new Pizza[anzahlPizzen];
        pizzas[0] = new Pizza("Salami", new int[]{24, 28, 32}, new float[]{4.5f, 6.0f, 7.0f});
        pizzas[1] = new Pizza("Schinken", new int[]{26, 28, 32}, new float[]{5.5f, 6.0f, 7.2f});
        pizzas[2] = new Pizza("Spezial", new int[]{26, 28, 32}, new float[]{4.5f, 6.0f, 7.5f});
        pizzas[3] = new Pizza("Verdura", new int[]{26, 28, 32}, new float[]{5.5f, 6.5f, 7.8f});
        pizzas[4] = new Pizza("Hawaii", new int[]{26, 28}, new float[]{6.0f, 8.0f});

        for (Pizza pizza : pizzas) {
            pizza.getBestePreisLeistung();
            System.out.println();
        }
    }
}

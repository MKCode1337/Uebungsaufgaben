package lektion8.auto;

public class lieblingsauto {
        public static  void main(String args[]) {
        Auto mustang = new Auto();
        mustang.Marke = "Ford";
        mustang.Modell = "Mustang";
        mustang.Farbe = "Rot";
        mustang.Hubraum = 12000;
        mustang.ps =  300;
        mustang.Getriebe= "Automatik";

        Auto jimny = new Auto();
        jimny.Marke = "Suzuki";
        jimny.Modell = "Jimny";
        jimny.Farbe = "Grün";
        jimny.Hubraum = 1300;
        jimny.ps =  86;
        jimny.Getriebe= "Schaltgetriebe";

        Auto astra = new Auto();
        astra.Marke = "Opel";
        astra.Modell = "Astra";
        astra.Farbe = "Weiß";
        astra.Hubraum = 1600;
        astra.ps =  125;
        astra.Getriebe= "Schaltgetriebe";

        int groessterHubraum = Math.max(mustang.Hubraum, Math.max(jimny.Hubraum, astra.Hubraum));

        if (mustang.Hubraum == groessterHubraum) {
            System.out.println(mustang);
            }
        else if(astra.Hubraum == groessterHubraum) {
            System.out.println(astra);
            }
        else if (jimny.Hubraum == groessterHubraum) {
            System.out.println(jimny);
            }

        }
}

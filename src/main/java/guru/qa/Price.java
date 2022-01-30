package guru.qa;

/**
 * Подбор тур-пакета для путешествия
 */
public class Price {

    private String person;
    private boolean child;
    private int childAge;

    public static void main(String[] args){

        Variations sriLanka = new Variations();
        sriLanka.insurance = true;
        sriLanka.country = "Sri Lanka";
        sriLanka.city = "Hikkaduwa";
        sriLanka.price = 750;
        sriLanka.days = 7;
        sriLanka.airline = "AirAstana";
        sriLanka.printInfo();

        Variations turkie = new Variations();
        turkie.insurance = true;
        turkie.country = "Turkie";
        turkie.city = "Kemer";
        turkie.price = 1050;
        turkie.days = 10;
        turkie.airline = "Scat";
        turkie.printInfo();

        Variations egipt = new Variations();
        egipt.insurance = true;
        egipt.country = "Egipt";
        egipt.city = "Hurgada";
        egipt.price = 550;
        egipt.days = 13;
        egipt.airline = "Scat";
        egipt.printInfo();

        Variations thailand = new Variations();
        thailand.insurance = false;
        thailand.country = "Thailand";
        thailand.city = "Phuket";
        thailand.price = 650;
        thailand.days = 10;
        thailand.airline = "AirAstana";
        thailand.printInfo();

    }

}

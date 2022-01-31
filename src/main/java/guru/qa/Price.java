package guru.qa;
import java.util.*;

/**
 * Подбор тур-пакета для путешествия
 */
public class Price {

    public static void main(String[] args){

        Variations sriLanka = new Variations();
        sriLanka.insurance = true;
        sriLanka.country = "Sri Lanka";
        sriLanka.city = "Hikkaduwa";
        sriLanka.airline = "AirAstana";
        sriLanka.priceInDay = 50;
        sriLanka.days = 7;
        sriLanka.person = 1;
        sriLanka.printInfoTour();
        sriLanka.printPriceInfoOnePerson();
        sriLanka.person = 2;
        sriLanka.printPriceInfoTwoPerson();
        sriLanka.child = true;
        sriLanka.printPriceInfoTwoPersonWithChild();

//        Variations turkie = new Variations();
//        turkie.insurance = true;
//        turkie.country = "Turkie";
//        turkie.city = "Kemer";
//        turkie.price = 1050;
//        turkie.days = 10;
//        turkie.airline = "Scat";
//        turkie.printPriceInfoOnePerson();
//        turkie.printPriceInfoTwoPerson();
//        turkie.printPriceInfoTwoPersonWithChild();
//
//        Variations egipt = new Variations();
//        egipt.insurance = true;
//        egipt.country = "Egipt";
//        egipt.city = "Hurgada";
//        egipt.price = 550;
//        egipt.days = 13;
//        egipt.airline = "Scat";
//        egipt.printPriceInfoOnePerson();
//        egipt.printPriceInfoTwoPerson();
//        egipt.printPriceInfoTwoPersonWithChild();
//
//        Variations thailand = new Variations();
//        thailand.insurance = false;
//        thailand.country = "Thailand";
//        thailand.city = "Phuket";
//        thailand.price = 650;
//        thailand.days = 10;
//        thailand.airline = "AirAstana";
//        thailand.printPriceInfoOnePerson();
//        thailand.printPriceInfoTwoPerson();
//        thailand.printPriceInfoTwoPersonWithChild();

    }

}

package guru.qa;

/**
 * Варианты тур-пакетов
 */
public class Variations {

    protected boolean insurance = true;
    protected boolean child = false;
    protected int priceInDay;
    protected int days;
    protected int person;
    protected String country;
    protected String city;
    protected String airline;

    //region price calculation
    public double setPriceTour() {
        return (((child) ? 1: 0) * days * priceInDay * 0.5) + (person * days * priceInDay);
    }
    //endregion

    //region print info
    public void printInfoTour() {
        System.out.println("[Страна - " + country + "/г. " + city + " (" + airline + ").]");
    }

    public void printPriceInfoOnePerson() {
        System.out.println("[1 взр.] Кол-во дней: " + days + ". Страховка: " + ((insurance) ? "есть" : "нет") +
                ". Стоимость - $" + setPriceTour() + "]");
    }

    public void printPriceInfoTwoPerson() {
        System.out.println("[2 взр.] Кол-во дней: " + days + ". Страховка: " + ((insurance) ? "есть" : "нет") +
                ". Стоимость - $" + setPriceTour() + "]");
    }

    public void printPriceInfoTwoPersonWithChild() {
        System.out.println("[2 взр. + 1 реб.] Кол-во дней: " + days + ". Страховка: " + ((insurance) ? "есть" : "нет") +
                ". Стоимость - $" + setPriceTour() + "]");
    }
    //endregion

}

package guru.qa;

/**
 * Варианты тур-пакетов
 */
public class Variations {

    boolean insurance = true;
    int price;
    int days;
    String country;
    String city;
    String airline;

    public void printInfo() {
        System.out.println("[Страна - " + country + "/город " + city + " (" + airline + "). Стоимость - $"
                + price + ". Количество дней: " + days + ". Наличие страховки: " + ((insurance) ? "есть" : "нет") + "]");
    }

}

public class Main implements Constants {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setName(CAT_NAME);
        cat.setAge(CAT_AGE);
        cat.setOwnerName(OWNER_NAME);

        cat.printGreeting();
        cat.Soundmaking();
        cat.Stepmaking();
        cat.AnimalCare();
        cat.AnimalCall();
    }
}
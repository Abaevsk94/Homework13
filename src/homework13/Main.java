package homework13;

public class Main {
    public static void main(String[] args) {
        Author alexandrPushkin = new Author ("Александр","Пушкин");
        Author williamShakespeare = new Author("Уильям", "Шекспир");
        Book onegin = new Book("Евгений Онегин", alexandrPushkin, 1830);
        Book romeoAndJuliette = new Book("Ромео и Джульетта", williamShakespeare, 1597);
        onegin.setPublishingYear(1833);
        System.out.println(onegin);
        System.out.println(romeoAndJuliette);
    }
}

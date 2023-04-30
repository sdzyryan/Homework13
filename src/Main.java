public class Main {
    public static void main(String[] args) {

        Author authorNineteenEightyFour = new Author("Джордж", "Оруэлл");
        Book nineteenEightyFour = new Book(authorNineteenEightyFour, "1984", 2019);
        System.out.println(nineteenEightyFour);

        Author authorFahrenheit451 = new Author("Рэй", "Брэдбери");
        Book fahrenheit451 = new Book(authorFahrenheit451, "451 градус по фаренгейту",
                2016);
        System.out.println(fahrenheit451);

        fahrenheit451.setYear(2017);
        System.out.println(fahrenheit451);

        Author authorQuantumWarrior = new Author("Джон", "Кехо");
        Book quantumWarrior = new Book(authorQuantumWarrior, "Квантовый воин. Cознание будущего",
                2015);
        System.out.println(quantumWarrior);
    }
}
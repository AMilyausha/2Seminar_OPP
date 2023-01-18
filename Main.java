public class Main {
    public static void main(String[] args) {
        Persona papa = new Persona("Ivan", "Man", 33, "№1","dog");
        Persona son = new Persona("Petr", "Man", 13, "№2","cat");

        papa.PersLibr.AddBook("Пушкин", "Собрание сочинений", "RU");
        son.PersLibr.AddBook("Носов", "Незнайка на луне", "RU");

        papa.Catt.AddAnimal("Chappy", "sheepdog", 12);
        son.Catt.AddAnimal("Murka", "scottish", 2);
     

        System.out.println("*".repeat(15));
        view.personView(papa);
        view.bookView(papa);
        view.animalView(papa);
        System.out.println("*".repeat(15));
        view.personView(son);
        view.bookView(son);
        view.animalView(son);
    }
}
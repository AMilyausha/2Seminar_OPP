
import java.util.ArrayList;


public class Persona extends Human {
    public Library PersLibr;
    public Cat Catt;

    public Persona(String Name, String Sex, int Age, String persLibr, String cat) {
        SetSex(Sex);
        SetName(Name);
        SetAge(Age);
        this.PersLibr = new Library(persLibr);
        this.Catt = new Cat(cat);
    }
    ArrayList<Persona> listName = new ArrayList<>();

    public void AddName(Persona persona) {
        listName.add(persona);
    }

    public ArrayList<Persona> getListName() {
        return listName;
    }

    public void Voice() {
        String name = GetName();
        System.out.println("Меня зовут " + name);
    }

    public void pBook(){

    }
}
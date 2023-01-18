import java.util.ArrayList;

class Animals{
    public String bNickname;
    public String bBreed;
    public int bAge;
} 

public class Cat extends Animal {
    public String animal;
    public Cat (String nameAnimal){
        this.animal=nameAnimal;
    }

ArrayList<Animals> list = new ArrayList<>();

public void AddAnimal(String name, String breed, int age){
    Animals a = new Animals();
    SetNicname(name);
    SetBred(breed);
    SetAge(age);
    a.bNickname= GetNickname();
    a.bBreed = GetBred();
    a.bAge =GetAge();
    list.add(a);
}

    public ArrayList<Animals> getAnimalList(){
        return list;
    }
}
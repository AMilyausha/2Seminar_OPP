public class view {
    public static void treeView(Persona root, int num){
        String line = "_".repeat(num);
//        System.out.println(line + root.FullName);
        System.out.println(line + root.GetName());
        for (Persona a: root.getListName()) {
            treeView(a, num + 1);
        }
    }

    public static void personView(Persona root){
        System.out.println( root.GetName()+" "+ root.GetSex()+" "+ root.GetAge() );
        for (var a: root.getListName()) {
            System.out.println(a.GetName()+" "+ a.GetSex()+" "+ a.GetAge());
        }
    }

    public static void bookView(Persona root){
        System.out.println("имя библиотеки " + root.PersLibr.LibraryName);
        for (LibraryBooks a: root.PersLibr.listBook) {
            System.out.println(a.bAutor + " " + a.bName);
        }
    }

    public static void animalView(Persona root){
        System.out.println("животное:" + root.Catt.animal);
        for (var a: root.Catt.list) {
            System.out.println(a.bNickname + " " + a.bBreed+ " " + a.bAge);
        }
    }
}
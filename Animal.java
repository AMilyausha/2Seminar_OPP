public class Animal {
    private String nickname;
    private String bred;
    private int age;

    public void SetNicname(String nick){
        this.nickname=nick;
    }
    public void SetBred(String bred){
        this.bred=bred;
    }
    public void SetAge(int age){
        this.age=age;
    }
   
    public String GetNickname(){
        return nickname;
    }
    public String GetBred(){
        return bred;
    }
    public int GetAge(){
        return age;
    }
}

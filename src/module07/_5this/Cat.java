package module07._5this;

public class Cat {
    // has a
    private String name;
    private String voice;
    private int age;
    private Cat mother;
    public Cat(String name, String voice){
        this.name = name;
        this.voice = voice;
        // an instance variable
        age = 0;
    }
    public static void main(String[] args){
        Cat miso = new Cat("miso", "MEOW");
        Cat phoebe = new Cat("Phoebe","Mrow");
    }
}

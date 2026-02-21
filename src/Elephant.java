public class Elephant extends Animal{
    public void makeSound(){
        System.out.println("'Свист'");
    }
    public String getType(){
        return "Elephant";
    }
    public Elephant (String name, int age){
        setName(name);
        setAge(age);
    }
}

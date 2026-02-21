public class Lion extends Animal{
    public void makeSound(){
        System.out.println("Рррр");
    }
    public String getType(){
        return "Lion";
    }
    public Lion(String name, int age){
        setName(name);
        setAge(age);
    }
}

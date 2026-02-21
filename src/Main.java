import java.util.List;
import java.util.ArrayList;

public static void main() {
    ZooEnc <Animal> zoo = new ZooEnc<>();
    zoo.addAnimal(new Lion("Mufasa",10));
    zoo.addAnimal(new Lion ("Simba", 5));
    zoo.addAnimal(new Elephant("Chokoboy", 11));
    zoo.makeAllSounds();
    zoo.getType();
    zoo.info();
}

public static class ZooEnc <T extends Animal>{
    private List <T> animals = new ArrayList<>();

    public void addAnimal(T animal){
        animals.add(animal);
    }

    public void makeAllSounds(){
        for (T Animal : animals){
            Animal.makeSound();
        }
    }
    public void getType(){
        for (T Animal : animals){
            Animal.getType();
            System.out.println(Animal.getType());
        }
    }

    public void info(){
        for (T Animal : animals){
            System.out.println(Animal.getType()+ " - name " + Animal.getName()+ ", " + Animal.getAge()+ " age." );
        }
    }
}

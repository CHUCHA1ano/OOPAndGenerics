import java.util.List;
import java.util.ArrayList;

public static void main() {
    ZooEnc <Animal> zoo = new ZooEnc<>();
    zoo.addAnimal(new Lion());
    zoo.addAnimal(new Elephant());
    zoo.makeAllSounds();
    zoo.getType();
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
}

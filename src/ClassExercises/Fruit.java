package ClassExercises;

public class Fruit {

    private String name;

    Fruit(String name){
        this.name = name;
    }
    public String toString(){
        return "Fruit[name= " + this.name + "]";
    }
}
class Apple extends Fruit{

    Apple(String name) {
        super(name);
    }

    public String getApplePieRecipe(){
        return "recipe";
    }
}

class Orange extends Fruit{

    Orange(String name) {
        super(name);
    }

    public String orangeJuiceRecipe(){
        return "recipe";
    }
}

class GoldenDelicious extends Apple{

    GoldenDelicious(String name) {
        super(name);
    }
}
class Macintosh extends Apple{

    Macintosh(String name) {
        super(name);
    }

}

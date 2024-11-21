public class Animal {
    String name;
    float weight;
    int height;
    int age;

    public Animal(String first, float w, int h, int a){
        this.name = first + "Bird";
        this.weight = w;
        this.height = h;
        this.age = a;
    }

    public Animal(){
        this.weight = 100;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}

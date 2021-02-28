public class Main extends Human {
    public Main(int age, int weight) {
        super(age, weight);
    }

    public static void main(String[] args){
        Human human1 = new Human(20, 76);
        human1.ageFilter(20,76);
        human1.ageFilter(22,76);
        human1.ageFilter(23,76);
        human1.ageFilter(21,76);
    }

}


// 1) класс Human (int age, String firstName, String
//lastName, LocalDate birthDate, int weight); Фильтрация по признаку «вес больше, чем возраст», сортировка по
//фамилии в обратном порядке, сумма всех весов.//
import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.*;

public class Human {
    int age;
    String firstName;
    String lastName;
    LocalDate birthDate;
    int weight;
    int[] resultArray = new int[]{};

    public Human(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void ageFilter(int age, int weight) {
        int[] ageArray = new int[]{};
        for (int i = 0; i < 4; i++) {
            ageArray[i] = age;
        }
        int[] weightArray = new int[]{};
        for (int i = 0; i < 4; i++) {
            weightArray[i] = age;
        }
        IntStream weightStream = Arrays.stream(weightArray);
        IntStream ageStream = Arrays.stream(ageArray);
        ageStream.filter(x -> weightArray[x] > x).forEach(System.out::println);
    }
}
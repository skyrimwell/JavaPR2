import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Task {
    private String[] firstNames = {"Алиса", "Маша", "Геннадий", "Валентин", "Вася", "Яша", "Борис", "Вазген", "Андрей", "Юлия", "Димитрий", "Николай", "Никита", "Серега", "Паша"};
    private String[] lastNames = {"Иванов", "Васильев", "Шинкаренко", "Городнов", "Котов", "Ампилов", "Русских", "Виленко", "Дятлов","Воробьев","Кобанов","Соколов","Волков", "Кузнецов", "Морозов" , "Медведев"};

    private List<Human> setList(int size) {
        List<Human> result = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i < size; i++) {
            LocalDate date = LocalDate.of(random.nextInt(30) + 1970, random.nextInt(12) + 1, random.nextInt(27) + 1);
            result.add(new Human(random.nextInt(99), firstNames[random.nextInt(firstNames.length)], lastNames[random.nextInt(lastNames.length)], date, random.nextInt(70) + 20));
        }
        return result;
    }

    public void getList(int size) {
        List<Human> array = setList(size);
        Stream<Human> stream1 = array.stream();
        Stream<Human> stream2 = array.stream();
        Stream<Human> stream3 = array.stream();

        System.out.println("Список до применения методов stream: ");
        array.forEach(System.out::println);

        System.out.println("\nСписок после применения методов stream:");

        //Task 1
        System.out.println("\nФильтрация по признаку «вес больше, чем возраст»");
        stream1.filter(o -> o.getWeight() >o.getAge()).forEach(System.out::println);

        //Task 2
        System.out.println("\nСортировка по фамилии в обратном порядке");
        stream2.map(o -> o.getLastName()).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //Task 3
        System.out.println("\nCумма всех весов: ");
        int sum = stream3
                .mapToInt(e -> e.getWeight())
                .sum();
        System.out.println(sum);


    }
}
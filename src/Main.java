import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Множество всех животных task_0820

1. Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без
параметров.
2. Реализовать метод createCats, который должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
4. Реализовать метод join, который должен возвращать объединенное множество всех
котов и собак.
животных - всех
5. Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в
множестве cats.
6. Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
Каждое животное с новой строки.
Требования:
1. Программа должна выводить текст на экран.
2. Внутри класса Solution должны быть созданы public static классы Cat, Dog.
3. Метод createCats() класса Solution должен возвращать множество (Set) содержащее
4 кота.
4. Метод createDogs() класса Solution должен возвращать множество (Set) содержащее 3 собаки.
5. Метод join() класса Solution должен возвращать объединенное множество всех животных - всех котов и
собак.
6. Метод removeCats() должен удалять из множества pets всех котов, которые есть в множестве cats.
7. Метод printPets() должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой
строки.
*/

public class Main {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);
        System.out.println();
        System.out.println();


        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        //напишите тут ваш код
        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogs = new HashSet<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        //напишите тут ваш код

        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> sum = new HashSet<>();
        sum.addAll(cats);
        sum.addAll(dogs);
        return sum;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Iterator<Object> petsIter = pets.iterator();
        for (int i = 0; i < cats.size(); i++) {
            while (petsIter.hasNext()) {
                Object pet = petsIter.next();
                if (pet.getClass() == Cat.class) {
                    petsIter.remove();
                    break;
                }
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object e : pets) {
            System.out.println(e);
        }
    }

    public static class Cat {

    }

    public static class Dog {

    }
    //напишите тут ваш код
}
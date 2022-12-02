import java.util.*;

public class Main {
  public static void main(String[] args) {
    Integer[] arr = { 3, 6, 2, 8, 0, 4, 2, 9, 2, 19 };
    List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));

    for (int i = 0; i < list.size(); i++) {
      for (int j = i; j < list.size(); j++) {
        if (list.get(i) > list.get(j)) {
          int t = list.get(i);
          list.set(i, list.get(j));
          list.set(j, t);
        }
      }
    }

    System.out.println(list);
    Set<Person> set = new HashSet<Person>();
    set.add(new Person("Alex", 9));
    set.add(new Person("Jack", 34));
    set.add(new Person("John", 70));
    set.add(new Person("Rick", 40));
    set.add(new Person("Adrew", 11));
    set.add(new Person("August", 25));
    set.add(new Person("Mike", 5));
    set.add(new Person("Andrei", 21));
    set.add(new Person("Nikita", 19));


    System.out.println(verify(set));
  }

  private static List<Person> verify(Set<Person> set) {
    List<Person> list = new LinkedList<Person>();
    for (Person person : set) {
      if (person.age > 10 && person.name.startsWith("A")) {
        list.add(person);
      }
    }

    return list;
  }
}

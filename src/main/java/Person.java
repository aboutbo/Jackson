public class Person {
    public int age;
    public String name;

    @Override
    public String toString() {
        return String.format("Person.age=%s, Person.name=%s", age, name);
    }
}

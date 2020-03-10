import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class Person {
    public int age;
    public String name;
    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
    public Object object;
    @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
    public Sex sex;

    //    输出对象
    @Override
    public String toString() {
        return String.format("Person.age=%s, Person.name=%s, Person.object=%s, Person.sex=%s", age, name, object == null ? "null" : object, sex == null ? "null" : sex);
    }
}

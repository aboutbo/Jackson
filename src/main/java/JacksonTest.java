import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTest {
    public static void main(String args[]) throws Exception {
        Person p = new Person();
        p.age = 22;
        p.name = "xiwu";

        ObjectMapper mapper = new ObjectMapper();

        String json = mapper.writeValueAsString(p);
        System.out.println(json);

        Person p2 = mapper.readValue(json, Person.class);
        System.out.println(p2);
    }
}

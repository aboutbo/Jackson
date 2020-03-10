import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTest {
    public static void main(String args[]) throws Exception {
//        Person p = new Person();
//        p.age = 22;
//        p.name = "xiwu";
//        Game games = new Game();
//        p.object = games;
//        Sex sex = new MySex();
//        p.sex = sex;

        ObjectMapper mapper = new ObjectMapper();

//        设置JAVA_LANG_OBJECT
//        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.JAVA_LANG_OBJECT);
//        设置OBJECT_AND_NON_CONCRETE
//        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
//        设置NON_CONCRETE_AND_ARRAYS
//        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_CONCRETE_AND_ARRAYS);
//        设置NON_FINAL
//        mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//        String json = mapper.writeValueAsString(p);
        String json = "{\"age\":22,\"name\":\"xiwu\",\"object\":{\"@class\":\"Vul\",\"cmd\":\"gnome-calculator\"},\"sex\":{\"@class\":\"MySex\",\"sex\":\"man\"}}";
//        System.out.println(json);

        Person p2 = mapper.readValue(json, Person.class);
        System.out.println(p2);
    }
}

package animals;

public class Tomcat extends Cat {
    private static final String GENDER = "Male";

    public Tomcat(String name, int age) {
        super(name, age, "Male");
    }

    public String produceSound() {
        return "MEOW";
    }
}

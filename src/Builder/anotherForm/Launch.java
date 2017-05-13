package Builder.anotherForm;

public class Launch {
    public static void main(String[] args) {
        Person.PersonBuilder builder = new Person.PersonBuilder();
        builder.firstName("Bohdan").secondName("Savshak").age(100);
        Person p = builder.build();
        System.out.println(p);
    }
}

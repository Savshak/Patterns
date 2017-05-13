package Builder.anotherForm;

public class Person {
    private String firstName;
    private String secondName;
    private int age;

    public static class PersonBuilder {
        private String firstName;
        private String secondName;
        private int age;

        public PersonBuilder() {

        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder secondName(String secondName) {
            this.secondName = secondName;
            return this;
        }

        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }

    }

    private Person(PersonBuilder builder) {
        firstName = builder.firstName;
        secondName = builder.secondName;
        age = builder.age;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + "\nSecond Name: " + secondName + "\nAge: " + age;
    }
}

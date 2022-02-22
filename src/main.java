public class main {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Max";
        person.age = 24;
        person.info();
        int yea = person.calcuyearstoretr();
        System.out.println(yea);

    }
}

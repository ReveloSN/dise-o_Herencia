public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ana", "Quito");
        Student student = new Student("Luis", "Bogota", "Ingenieria", 3, 1250.50);
        Staff staff = new Staff("Marta", "Medellin", "Colegio Central", 2300.00);

        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);
    }
}

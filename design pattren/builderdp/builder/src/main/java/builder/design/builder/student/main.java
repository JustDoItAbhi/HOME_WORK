package builder.design.builder.student;

public class main {
    public static void main(String[] args) {
        Students s= new Students.Builder()
                .id(1)
                .gradYear(2025)
                .name("rahul")
                .age(18)
                .email("email@gmail.com")
                .password("123451")
                .build();

        System.out.println(s+" ");
    }

}

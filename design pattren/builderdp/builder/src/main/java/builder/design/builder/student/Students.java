package builder.design.builder.student;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Students {
    private int id;
    private String name;
    private String password;
    private String email;
    private int age;
    private int gradYear;

    public Students(int id, String name, String password, String email, int age, int gradYear) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.age = age;
        this.gradYear = gradYear;
    }



    public static Builder builder(){
        return new Builder();
    }
    public static class Builder{
        private int id;
        private String name;
        private String password;
        private String email;
        private int age;
        private int gradYear;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder gradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
        public void validate(){
          if(this.gradYear<2025){
              throw new RuntimeException("lower grad year");
          }
          if(this.age<18){
              throw new RuntimeException("lower age year");
          }
          if(this.name==null){
              throw new RuntimeException("name cannot be null");
          }
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(this.email);
            if(!matcher.matches()){
                throw new RuntimeException("invalid email");
            }

        }
        public Students build(){
            validate();
            return new Students(this.id,this.name,this.password,this.email,this.age,this.gradYear);
        }
    }
}

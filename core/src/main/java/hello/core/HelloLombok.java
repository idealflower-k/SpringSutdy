package hello.core;

import lombok.Getter;
import lombok.Setter;

import javax.management.ConstructorParameters;

@Getter
@Setter
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
       HelloLombok helloLombok = new HelloLombok();

       helloLombok.setName("asd");
        String name1 = helloLombok.getName();
        System.out.println("name1 = " + name1);
    }
}

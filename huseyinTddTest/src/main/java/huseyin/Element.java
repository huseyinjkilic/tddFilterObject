package huseyin;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Element {

    private int num;
    private String name;
    private  int age;


    public Element(int num, String name, int age) {
        this.num = num;
        this.name = name;
        this.age = age;
    }


    public Element() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}

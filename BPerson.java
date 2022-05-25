package saunak.patel.ep2;

public class BPerson {

    public String name;
    private int age;

    public BPerson(String Name, int Age){
        name = Name;
        age = Age;
    }
    public void printName(){
        System.out.println(this.name);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("Name: %s, Age: %d",name,age);
    }
}

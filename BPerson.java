package saunak.patel.ep2;

public class BPerson {

    public String name;
    private int age;
    
    //indentifies the parameter values of an object
    public BPerson(String name, int age){
        this.name = name;
        this.age = age;
    }
    //prints name only
    public void printName(){
        System.out.println(this.name);
    }
    //fetches the name only (alternative for print name, getter version)
    public String getName(){
        return name;
    }
    //fetches the age only
    public int getAge(){
        return age;
    }
    //sets a new name value
    public void setName(String name){
        this.name = name;
    }
    //sets a new age value
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format("Name: %s, Age: %d",name,age);
    }
}

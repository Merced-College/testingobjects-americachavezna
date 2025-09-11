//America Chavez
//9/9/2025
//CPSC-39-12705

public class Dog {

    //data variables, to describe our Dog object in the computer
    public String name;
    public int age; 
    public String breed; 

    //constructor
    public Dog () {
        this.name = "Hank";
        this.age = 1;
        this.breed = "Lab";
    }

    //nondefault constructor
    public Dog (String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    //setters - accessors 
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed (String breed) {
        this.breed = breed;
    }

    //getters - mutators
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
            return name + ", " + age + ", " + breed;
        }

} //end Dog class


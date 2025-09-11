//America Chavez
//9/9/2025
//CPSC-39-12705

public class ObjectTester {

    public static void main (String[] args) {

        //make a Dog object - instantiation
        Dog dog1 = new Dog();
        System.err.println(dog1);

       //make a Dog object -use nondefault constructor
        Dog dog2 = new Dog("Karl", 3,  "golden retriever");
        System.err.println(dog2);

        dog2.setName("Paul");
        System.out.println(dog2);

        //only print dog's name
        System.out.println(dog2.getName());

        //switch to my code, class 'Book'

         //make a Book object - instantiate
        Book book1 = new Book();
        System.err.println(book1);

        //make a Book object - use nondefault constructor
        Book book2 = new Book("The Sorcerer's Stone", "J.K. Rowling", 363);
        System.err.println(book2);

        book2.setTitle ("The Hunger Games");
        System.out.println(book2);

        //only print book's title
        System.out.println(book2.getTitle());

    }//end main

}//end class
package a2_access_modifier;
 class Pet {
    // protected method
    protected void display() {
        System.out.println("I am an pet");
    }
}

class Dog extends Pet {
    public static void main(String[] args) {

        // create an object of Dog class
        Dog dog = new Dog();
         // access protected method
        dog.display();
    }
}




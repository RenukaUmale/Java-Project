package a2_access_modifier;
public class PublicAccess {
    public static void main( String[] args ) {
        // accessing the public class Animal1.java
        Pet animal = new Pet();

        // accessing the public variable
        animal.legCount = 4;
        // accessing the public method
        animal.display();
    }
}

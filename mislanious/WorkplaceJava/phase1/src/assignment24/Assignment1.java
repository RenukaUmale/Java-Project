package assignment24;
import java.util.Scanner;

public class Assignment1
{
    private int product_code;
    private String flavour;
    private String pack_type;
    private int pack_size;
    private int product_price;
    
    public Assignment1() {
        product_code = 0;
        flavour = "";
        pack_type = "";
        pack_size = 0;
        product_price = 0;
    }
    
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Flavour: ");
        flavour = in.nextLine();
        System.out.print("Enter Pack Type: ");
        pack_type = in.nextLine();
        System.out.print("Enter Product Code: ");
        product_code = in.nextInt();
        System.out.print("Enter Pack Size: ");
        pack_size = in.nextInt();
        System.out.print("Enter Product Price: ");
        product_price = in.nextInt();
    }
    
    public void discount() {
        product_price -= 10;
    }
    
    public void display() {
        System.out.println("Product Code: " + product_code);
        System.out.println("Flavour: " + flavour);
        System.out.println("Pack Type: " + pack_type);
        System.out.println("Pack Size: " + pack_size);
        System.out.println("Product Price: " + product_price);
    }
    
    public static void main(String args[]) {
        Assignment1 obj = new Assignment1();
        obj.input();
        obj.discount();
        obj.display();
    }
}

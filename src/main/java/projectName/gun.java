package projectName;
import java.util.Scanner;
public class gun{
    private int ammo;
    private double price;
    private String name;
public gun (String newName, int newAmmo, double newPrice){
ammo = newAmmo;
price = newPrice;
name= newName;
}
public String toString(){
    return "Name: "+ name +"\nPrice: " + price +"\nAmmo: "+ ammo;
    }
    public void showOptions(){
        System.out.println("What would you like to buy?");
        System.out.println("Choose from the list: 1000, 2000, 3000, 4000, 5000");
        System.out.println("Type the price range of the gun or press 0 to exit the menu.");
    }
    public void showPurchase(){
        System.out.println("Which gun would you like to purchase?");
                
    }
    public void buyGun() {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        showOptions();
        choice = input.nextInt();
        while(choice!=0){
            if(choice != 0 && choice !=1000 && choice !=2000 && choice !=3000 && choice !=4000 && choice !=5000){
                System.out.println("Choose a valid choice from the list or exit the menu.");
                showOptions();
            }
            if(choice == 1000){
                System.out.println("Classic, Shorty, Frenzy, Ghost, Sherriff");
                showPurchase();
                String buyGun = input.next();
                System.out.println(buyGun);
            }
            if(choice ==2000){
                System.out.println("Bucky, Marshall, Stinger, Spectre, Judge");
                showPurchase();
                String buyGun = input.next();
                System.out.println(buyGun);
            }
            if(choice == 3000){
                System.out.println("Bulldog, Guardian, Phantom, Vandal");
                showPurchase();
                String buyGun = input.next();
                System.out.println(buyGun);
            }
            if(choice==4000){
                System.out.println("Odin");
                showPurchase();
                String buyGun = input.next();
                System.out.println(buyGun);
            }
            if(choice==5000){
                System.out.println("Operator");
                showPurchase();
                String buyGun = input.next();
                System.out.println(buyGun);
            }
            showOptions();
        choice = input.nextInt();
        }
        System.out.println("Closing menu.");
        input.close();
    }
}


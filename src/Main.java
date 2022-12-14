import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;
        int i = 0;


        System.out.println("WELCOME TO RIYA'S PIZZA");
        do {
            System.out.println("ENTER YOUR CHOICE");
            System.out.println("1.BASE PIZZA      2.DELUXE PIZZA");
            s = sc.nextInt();
            switch (s) {
                case 1:
                    BasePizza bp = new BasePizza();
                    System.out.println("Press 1 for Veg-Pizza and 2 for Non-Veg Pizza");
                    int p = sc.nextInt();
                    if(p==1){
                        System.out.println("");
                    }
                    else if(p==2){
                        bp.selectNV();
                    }
                    else{
                        System.out.println("Enter the correct choice");
                        break;
                    }
                    System.out.println("Do you want to add Extra cheese? If yes press 1");
                    int c = sc.nextInt();
                    if (c == 1) {
                        bp.addExtraCheese();
                    }
                    System.out.println("Do you want to add extra toppings?If yes press 1");
                    int t = sc.nextInt();
                    if(t==1) {
                        bp.addExtraToppings();
                    }
                    System.out.println("For take away press 1");
                    int p1 = sc.nextInt();
                    if(p1==1) {
                        bp.addPack();
                    }

                    bp.getBill();
                    break;
                case 2: {
                    System.out.println("PRESS 1.VEG-PIZZA 2.NON-VEG PIZZA");
                    DeluxePizza dp = new DeluxePizza();

                    int d = sc.nextInt();
                    if(d==1){
                        System.out.println("");

                    }
                    else if(d==2){
                        dp.selectDNV();
                    }
                    else{
                        System.out.println("Enter the correct choice");
                    }
                    System.out.println("For take away press 1");
                    int h = sc.nextInt();
                    if(h==1){
                        dp.selectDBP();
                    }
                    dp.getDeluxeBill();
                    break;
                }
                default:
                    System.out.println("Enter the correct choice");
            }System.out.println("Do you want to make order/another order.If yes press 1");
            i = sc.nextInt();
        }while(i==1);

    }
}
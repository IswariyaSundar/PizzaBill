public class BasePizza {
    private int price = 300;
    private Boolean veg;
    private  int extraCheesePrice = 100;
    private int extraToppingsAdded = 150;
    private int pack = 20;
    private int nv = 100;

    BasePizza(){
    }

    public void selectNV(){
        System.out.println("Non-Veg Pizza");
        this.price = this.price+nv;
    }
   public void addExtraCheese(){
       System.out.println("Extra cheese added");
       this.price = this.price+extraCheesePrice;
   }
   public void addExtraToppings(){
       System.out.println("Extra toppings added");
       this.price = this.price+extraToppingsAdded;

   }
   public void addPack(){
       System.out.println("takeaway option is opted");
       this.price = this.price+pack;
   }
   public void getBill(){

       System.out.println("TOTAL AMOUNT:"+this.price);
       System.out.println("THANK YOU!! HAVE A NICE DAY :)");

   }
}

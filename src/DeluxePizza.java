public class DeluxePizza extends BasePizza{

    public DeluxePizza(){
        super();

    }
    public void selectDNV(){

        super.selectNV();
    }
    public void selectDBP(){
        super.addPack();
    }
    public void getDeluxeBill(){
        super.addExtraCheese();
        super.addExtraToppings();
       super.getBill();

    }


}

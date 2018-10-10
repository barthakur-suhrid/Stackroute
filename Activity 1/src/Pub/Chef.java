package Pub;

public class Chef {

    private Food foodOrder;
    private String chefName;

    Chef(String name,Food food){
        System.out.println("Order set..!");
    }

    public boolean prepareOrder(){
        System.out.println("Chef is preparing your order");
        return true;
    }

    public boolean orderPrepared(){
        System.out.println("Order prepared");
        foodOrder.setReady(true);

    }



}

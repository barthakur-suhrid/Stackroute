package Pub;

import java.util.ArrayList;
import java.util.List;

public class Food {

    private List<String> foods=new ArrayList<String>();
    private boolean ready=false;
    private boolean confirmOrder=false;

    public boolean isConfirmOrder() {
        System.out.println("Check confirmOrder");
        return confirmOrder;
    }

    public void setConfirmOrder(boolean confirmOrder) {

        this.confirmOrder = confirmOrder;
    }

    public boolean isReady() {
        System.out.println("Checking ready");
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public boolean addItem(String string){
        if(foods.add(string)) {
            System.out.println("Item Added !");
            return true;
        }else{
            System.out.println("Failure!");
            return false;
        }
    }
    public boolean removeItem(String string){
        if(foods.remove(string)) {
            System.out.println("Item removed!");
            return true;
        }else{
            System.out.println("Failure!");
            return false;
        }
    }


}

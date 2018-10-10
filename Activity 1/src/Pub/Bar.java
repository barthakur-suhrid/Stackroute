package Pub;

import java.util.*;

public class Bar {

    private List<String> drinks=new ArrayList<String>();
    private boolean ready=false;

    public boolean isReady() {
        System.out.println("Checking ready");
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public boolean addDrink(String string){
        if(drinks.add(string)) {
            System.out.println("Drink Added !");
            return true;
        }else{
            System.out.println("Failure!");
            return false;
        }
    }
    public boolean removeDrink(String string){
        if(drinks.remove(string)) {
            System.out.println("Drink removed!");
            return true;
        }else{
            System.out.println("Failure!");
            return false;
        }
    }



}

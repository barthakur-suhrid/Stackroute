package Pub;

public class Server {
    private String name;
    private Bartender bartender=null;
    private Chef chef=null;
    private int type;


    public String getName() {
        System.out.println("Fetching order...!");
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting a bartender...!");
        this.name = name;
    }

    public boolean notifyFood(String name,Food food){
        chef=new Chef(name,food);
        chef.prepareOrder();
        return true;
    }

    public boolean notifyBartender(String name,Bar bar){
        bartender=new Bartender(name,bar);
        bartender.prepareOrder();
    }

    public void takeBarOrder(){
        System.out.println("Starts taking food order..!");
        notifyBartender()

    }

    public void takeFoodOrder(){
        System.out.println("Starts taking food order..!");


    }
}

package Pub;

public class Bartender {

        private Bar barOrder;
        private String name;

        Bartender(String name,Bar barOrder){
            System.out.println("Order set...!");
        }

        public boolean prepareOrder(){
            System.out.println("Bartender is preparing your drinks");
            return true;
        }

        public boolean orderPrepared(){
            System.out.println("Order prepared");
            barOrder.setReady(true);

        }
}

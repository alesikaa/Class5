package Class5;

public class LogicalOperators1 {
    public static void main(String[] args) {

        System.out.println(true||true);
        System.out.println( true||false);
        System.out.println(false||false);

        System.out.println(false||true|false|false);

        boolean boughtCho=false;
        boolean boughtFlower=false;
        if (boughtCho||boughtFlower){
            System.out.println("I am happy");
        }else {
            System.out.println("I am sad");
        }
        boolean wifi=false;// false- gives Either connect to WIFI or to 5G
        boolean fiveG=false;
        if (wifi||fiveG){
            System.out.println("You are good for browsing");
        }else {
            System.out.println("Either connect to Wifi or to 5G");
        }
    }
}

public class Item extends Bag{
    public Item(){

    }
    public void print(int a, int b, int c){
        firstAid -= a;
        bandages -= b;
        bufAttack -= c;
        System.out.println("Your Item");
        System.out.println("firstAid: " + firstAid);
        System.out.println("bandages: "+ bandages);
        System.out.println("bufAttack: "+ bufAttack);
    }
}
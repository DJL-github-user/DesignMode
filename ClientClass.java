public class ClientClass {
    public static void main(String[] args){
        Factory factory=new Factory();
        Fruit fruit=factory.CreateFruit("A");
        fruit.eat();
    }

    public Fruit CreateFruit(String fruitname){
        if(fruitname.equals("Apple")) return new Apple();
        if(fruitname.equals("Banana")) return new Banana();
        return null;
    }
}

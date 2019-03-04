package pizzasf;

//IMPLEMENT ME
public class PizzaStore {
    private final SimplePizzaFactory factory;

    public PizzaStore() {
        this.factory = new SimplePizzaFactory();

        public Pizza orderPizza (String type){
            Pizza pizza = factory.createPizza(type);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            return pizza;
        }
    }
}

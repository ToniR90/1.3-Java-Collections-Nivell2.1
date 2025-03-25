import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Restaurant> restaurants = new HashSet<>();

        Restaurant restaurant1 = new Restaurant("Telepizza" , 5);
        Restaurant restaurant2 = new Restaurant("Telepizza" , 3);
        Restaurant restaurant3 = new Restaurant("Braseria" , 8);
        Restaurant restaurant4 = new Restaurant("Mar i muntaña" , 7);
        Restaurant restaurant5 = new Restaurant("Telepizza" , 5);

        restaurants.add(restaurant1);
        restaurants.add(restaurant2);
        restaurants.add(restaurant3);
        restaurants.add(restaurant4);
        restaurants.add(restaurant5);

        for(Restaurant restaurant : restaurants){
            System.out.println(restaurant);
        }
    }
}
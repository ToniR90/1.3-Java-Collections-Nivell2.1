import java.util.Objects;

public class Restaurant {

    private String name;
    private int score;

    public Restaurant(String name , int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object obj) {
        boolean valid = false;
        if(this == obj){
            valid = true;
        }
        if(obj == null || getClass() != obj.getClass()){
            valid = false;
        }
        Restaurant restaurant = (Restaurant) obj;
        if(this.name == restaurant.name && this.score == restaurant.score){
            valid = true;
        }
        return valid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Restaurant: " + name + "\n" + "Score: " + score;
    }
}
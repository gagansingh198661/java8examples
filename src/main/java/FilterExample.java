import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
    public static void main (String... args){
        List<String> names= Arrays.asList("Peter","Sam","kit");

        names.stream().
                filter(new Predicate<String>(){
                   public boolean test(String name){
                       return name.equals("Sam");
                   }
                }).
                forEach(name->System.out.println(name));
    }

}

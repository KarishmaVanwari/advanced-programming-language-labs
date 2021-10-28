import java.util.Collection;
import java.util.Map;

public class ObjInfo<T> {
    private T collection;

    public ObjInfo(T collection) {
        this.collection = collection;
    }

    public void printInfo() {
        if (collection instanceof Collection<?>) {
            System.out.println("---------COLLECTION---------");
            System.out.println("Size of collection is = " + ((Collection<?>) collection).size());
            System.out.println("Collection contains: ");
            ((Collection<?>) collection).forEach(System.out::println);
        } else if (collection instanceof Map<?, ?>) {
            System.out.println("------------MAP------------");
            System.out.println("Size of Map is = " + ((Map<?, ?>) collection).size());
            System.out.println("Contents of Map are: ");
            ((Map<?, ?>) collection).forEach((k, v) -> System.out.println(k + ": " + v));
        }
    }
}

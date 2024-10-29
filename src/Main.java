import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Hello world!");
        Samosa samosa = Samosa.getSomosa();
        System.out.println(samosa.hashCode());
        Samosa samosa1 = Samosa.getSomosa();
        System.out.println(samosa1.hashCode());

        A1 a = new A1();
        A2 a2 = new A2();
        String full = a2.name + a2.last;
        System.out.println(a.name == full);
        System.out.println(a.name.equals(full));

        try {
            Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            try {
               Samosa samosa2 =  constructor.newInstance();
                System.out.println(samosa2.hashCode());
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

}


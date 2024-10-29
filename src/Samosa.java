public class Samosa {

    private static Samosa samosa;

    private Samosa() {
        if(samosa != null){
            throw new RuntimeException("You are cheating me");
        }
    }

    public static Samosa getSomosa() {
        if (samosa == null)
            samosa = new Samosa();
        return samosa;
    }
}

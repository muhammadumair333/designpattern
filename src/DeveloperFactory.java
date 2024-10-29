public class DeveloperFactory {

    public static Employee getEmployee(String empType){
        if (empType.equals("Android"))
            return new AndroidDeveloper();
        else if (empType.equals("iOS"))
            return new IOSDeveloper();
        else return null;
    }
}

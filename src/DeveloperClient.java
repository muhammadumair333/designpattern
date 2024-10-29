public class DeveloperClient {

    public static void main (String[] arg){
        Employee employee = DeveloperFactory.getEmployee("Android");
        assert employee != null;
        employee.getSalary();
    }

}

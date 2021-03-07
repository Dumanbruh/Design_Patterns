package Task_1;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM medicine;");

        Database bar = Database.getInstance();
        bar.query("SELECT * FROM medicine");
    }
}

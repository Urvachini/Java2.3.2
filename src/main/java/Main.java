import java.io.Console;

public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();
        long bonus = service.calculate(100000, true);
        System.out.println(bonus);

    }
}


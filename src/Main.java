public class Main {
    public static void main(String[] args) {

            BonusMilesService service = new BonusMilesService();

            int miles = service.calculate(3456 );
            System.out.println("Ваши мили:" +miles);

    }
}

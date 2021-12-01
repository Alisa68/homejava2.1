public class BonusMilesService {
    public int calculate(int ticket) {
        int oneMile = 20;
        int miles = ticket / oneMile;
        return miles;
    }

}
package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        switch (monthNumber){
            default:
                System.out.println("Wrong month number");
                break;
            case 1,2,12:
            System.out.println("Winter");
                break;
            case 3,4,5:
            System.out.println("Spring");
                break;
            case 6,7,8:
            System.out.println("Summer");
                break;
            case 9,10,11:
            System.out.println("Autumn");
                break;
        }
    }
    public static void main (String [] args) {
        SeasonDeterminer seasonDeterminer = new SeasonDeterminer();
        int monthNumber = 1;
        seasonDeterminer.tellTheSeason(monthNumber);
    }
}

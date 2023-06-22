package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year > 0){
            boolean leap = false;
            switch (year % 4){
                case 0:
                    switch (year % 100) {
                        case 0:
                            switch (year % 400) {
                                case 0:
//                                    System.out.println("leap");
                                    leap = true;
                                    break;
                                default:
//                                    System.out.println("not leap");
                                    leap = false;
                                    break;
                            }
                            break;
                        default:
//                            System.out.println("not leap");
                            leap = true;
                            break;

                    }
                    break;
                default:
//                    System.out.println("not leap");
                    leap = false;
                    break;
            }
            if (month != 2){
                switch (month){
                    case 1,3,5,7,8,10,12:
                        System.out.println(31);
                        break;
                    case 4,6,9,11:
                        System.out.println(30);
                        break;
                    default:
                        System.out.println("invalid date");
                        break;
                }

            }
            if (month == 2){
                if (leap) {
                    System.out.println(29);
                }
                if (!leap){
                    System.out.println(28);
                }
            }
        }
        else {
            System.out.println("invalid date");
        }
    }
    public static void main (String [] args ){
        DaysInMonth daysInMonth = new DaysInMonth();
        int year = 2004;
        int mont = 2;
        daysInMonth.printDays(year, mont);
    }
}

package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide > 0 && secondSide > 0 && thirdSide > 0) {
            if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide){
                if ((int) firstSide + (int) thirdSide > (int) secondSide || (int) firstSide + (int) secondSide > (int) thirdSide || (int) secondSide + (int) thirdSide > (int) firstSide) {
                    System.out.println("this is a valid triangle");
                }
                else {
                    System.out.println("it's not a triangle");
                }
            }
            else {
                System.out.println("it's not a triangle");
            }
        }
        else{
                System.out.println("it's not a triangle");
            }
     }

        public static void main (String[]args){
            TriangleSidesValidator validator = new TriangleSidesValidator();
            double first = 1.0D;
            double second = 4.0D;
            double third = 4.0D;
            validator.validate(first, second, third);
        }

    }

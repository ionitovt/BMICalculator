public class IdealBMI {

    public static void IdealBMI(double height, int gender) {
        double IdMen;
        double IdWomen;
        if (gender == 1) {

            IdMen = (50 + 2.3*((height*100/2.54) - 60));

            if(height < 1.52400){

                System.out.println("Sorry the calculations are only " +
                        "accurate for those who are at least 153 cm (5 ft) tall.");
                return;
            }

            System.out.println("Your ideal body Weight is : " + IdMen +
                    "kg (" + (IdMen * 2.20462262) + "lb)");

        } else if(gender == 2){

            IdWomen = (45.5 + 2.3*((height*100/2.54) - 60));

            if(height < 1.52400){

                System.out.println("Sorry the calculations are only " +
                        "accurate for those who are at least 153 cm (5 ft) tall.");
                return;
            }

            System.out.println("Your ideal body Weight is : " + IdWomen +
                    "kg (" + (IdWomen * 2.20462262) + "lb)");
        }
    }
}

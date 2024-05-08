
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int startmonays = 1000;
        int loop = 1; // gör så while loopen kör om och om igen

        Scanner tgb = new Scanner(System.in);
        System.out.println("hello to gambel game");
        System.out.println("you have 1000kr to gambel press 1 to start");
        int monays = tgb.nextInt(); // hur måmga monays man gamblar

        while (monays > startmonays) { // gör så man inte kan gambla mer pengar än man har
            System.out.println("you dont have that kind of monays try again");
            System.out.println("how much monays you want to gambel");
            monays = tgb.nextInt(); // hur många monays man gamblar
        }

      while (loop == 1) {
          if(startmonays == 0) //gör så mna kan förlora
          {
              System.out.println("you got no monays left");
              break;
          }
          System.out.println("how much monays you want to gambel");
          monays = tgb.nextInt(); // här väljer du hur mycket du vill gambla

          while (monays > startmonays) {  // gör så man inte kan gambla mer pengar än man har
              System.out.println("you dont have that kind of monays try again");
              System.out.println("how much monays you want to gambel");
              monays = tgb.nextInt();
          }
          startmonays -= monays; // gör så man tapar pengar när man lägger in dom för att gamba

              // valen av vad man kan göra
            System.out.println("1 for 50% chance to win you. win 2x");
            System.out.println("2 for 25% chance to win you. win 3x");
          System.out.println("3 if you want to leave with your monays");



            int whatloop = tgb.nextInt(); // gör så jag har kan ha många olika spel

            if(whatloop == 1) {  // 50/50 gambel mode


                int min = 1;
                int max = 4;
                int randomNum = (int) (Math.random() * (max - min + 1)) + min; // gör så det blir random number

                if (randomNum > 2) { //gör så det är 50% chans att vinna
                    System.out.println("you won");
                    startmonays +=  monays  * 2; // ger dig pengar om du vinner
                    System.out.println("you now have " + startmonays + " monays");
                } else {
                    System.out.println("you lose");

                    System.out.println("you now have " + startmonays + " monays");
                }
            }

            if(whatloop == 2){  // 25% chanse att vinna mode

                int min = 1;
                int max = 4;
                int randomNum = (int) (Math.random() * (max - min + 1)) + min; // gör så det blir random number

           if (randomNum == 1) { // gör så det är 25% chans att vinna
               System.out.println("you won");
               startmonays +=  monays * 3; // ger dig pengar om di vinner
               System.out.println("you now have " + startmonays + " monays");

           } else {
               System.out.println("you lose");


               System.out.println("you now have " + startmonays + " monays");
           }

                if(whatloop == 3) { // om man skriver 3 går man ut med pengar
                 startmonays += monays;
                    System.out.println("you left with " + startmonays + " monays");
                    break; //slutar koden
                }



          }
      }
    }
}











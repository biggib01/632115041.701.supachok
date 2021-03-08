import java.util.*;

public class bicycle2 extends bicycle {
    private int gear;

    @Override
    public void speedUp(){
        this.currentSpeed = this.currentSpeed + (this.gear*5);
    }

    public void setGear(int gear){
        this.gear = gear;
    }

    public int getGear(){
        return this.gear;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        bicycle2 bicTwo = new bicycle2();
        System.out.println("Now current speed is : "+bicTwo.getCurrentSpeed());

        System.out.print("Please enter the inital current speed : ");
        int k = in.nextInt();
        bicTwo.setCurrentSpeed(k);

        //use new variable to keep boolean thing and when want to end loop just change it to "false"
        boolean con = true;

        while(con){
            System.out.print("Enter option : ");
            String l = in.next();

            if(l.equals("speedup") || l.equals("Speedup")){
                //idk why 99 not work, but change condition to 98, it's work so fine... thank you java.
                if(bicTwo.getCurrentSpeed()>98){
                    System.out.println("Sorry, you can't go faster than 99 km/hr");
                }else{
                    bicTwo.speedUp();
                    System.out.println("Now speed up to : "+bicTwo.getCurrentSpeed());  
                }
            }else if(l.equals("brake") || l.equals("Brake")){
                bicTwo.brake();
                System.out.println("Now speed down to : "+bicTwo.getCurrentSpeed());
            }else if(l.equals("Checkspeed") || l.equals("checkspeed")){
                System.out.println("Now speed at : "+bicTwo.getCurrentSpeed());
            }else if(l.equals("help") || l.equals("Help")){
                System.out.print("===Command==="+"\n-speedup/Speedup"+"\n-brake/Brake"+"\n-checkspeed/Checkspeed"+"\n-Setgear/setgear"+"\n");
            }else if(l.equals("quit") || l.equals("Quit") || l.equals("end") || l.equals("End")){
                con = false;
            }else if(l.equals("Setgear") || l.equals("setgear")){
                System.out.print("Enter gear : ");
                int n = in.nextInt();
                if(n>5){
                    System.out.println("Sorry, gear has only 5 gear.");
                }else{
                    bicTwo.setGear(n);
                }
            }else{
                System.out.println("Sorry, can not find this command"+"\nTry 'help'");
            }
            
        }
        
        in.close();
    }
}

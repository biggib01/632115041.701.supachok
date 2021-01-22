import java.util.*;
/**
 * bicycle
 */
public class bicycle {
    public int currentSpeed;

    public void setCurrentSpeed(int in){
        this.currentSpeed = in;
    }
    
    public int getCurrentSpeed(){
        return this.currentSpeed;
    }

    public void brake(){
        this.currentSpeed = this.currentSpeed - 5;
    }

    public void speedUp(){
        this.currentSpeed = this.currentSpeed + 5;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        bicycle bicOne = new bicycle();
        System.out.println("Now current speed is : "+bicOne.getCurrentSpeed());

        System.out.print("Please enter the inital current speed : ");
        int k = in.nextInt();
        bicOne.setCurrentSpeed(k);

        //use new variable to keep boolean thing and when want to end loop just change it to "false"
        boolean con = true;

        while(con){
            System.out.print("Enter option : ");
            String l = in.next();

            if(l.equals("speedup") || l.equals("Speedup")){
                //idk why 99 not work, but change condition to 98, it's work so fine... thank you java.
                if(bicOne.getCurrentSpeed()>98){
                    System.out.println("Sorry, you can't go faster than 99 km/hr");
                }else{
                    bicOne.speedUp();
                    System.out.println("Now speed up to : "+bicOne.getCurrentSpeed());  
                }
            }else if(l.equals("brake") || l.equals("Brake")){
                bicOne.brake();
                System.out.println("Now speed down to : "+bicOne.getCurrentSpeed());
            }else if(l.equals("Checkspeed") || l.equals("checkspeed")){
                System.out.println("Now speed at : "+bicOne.getCurrentSpeed());
            }else if(l.equals("help") || l.equals("Help")){
                System.out.print("===Command==="+"\n-speedup/Speedup"+"\n-brake/Brake"+"\n-checkspeed/Checkspeed"+"\n");
            }else if(l.equals("quit") || l.equals("Quit") || l.equals("end") || l.equals("End")){
                con = false;
            }
            
        }
        
        in.close();
    }

}
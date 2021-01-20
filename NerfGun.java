//Supachok Jrirarojkul 632115041

package อันใช้ส่งงาน;

public class NerfGun {
    private int ammoLeft = 0;
    static int id = 0;

    NerfGun(int i) {
        this.ammoLeft = ammoLeft + i;
        id++;
    }

    public void fire(){
        if(this.ammoLeft <= 0){

        }else{
            this.ammoLeft = this.ammoLeft - 1;
        }
        
        if(ammoLeft <= 0){
            System.out.println("OUT OF AMMO!!");
        }else{
            System.out.println("BANG !!!");
        }
    }

    public void reload(int i){
        if((ammoLeft+i)>15){
            System.out.println("Error !! ammunition is overload.");
        }else{
            ammoLeft = ammoLeft + i;
        }
    }
    
    public void displayNumOfAmmunition(){
        System.out.println(this.ammoLeft + " bullet left.");
    }

	void displayGunID() {
        System.out.println("The ID of this gun is " + id);
	}

}

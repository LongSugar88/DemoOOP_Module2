public class Fan {
    private String speed;
    boolean status = false;

    public String changeSpeed(String speed) {
        if (this.status) {
            this.speed = speed;
            return this.speed;
        }
        else {
            return "Fan is not ready";
        }
    }

    public boolean turnOnOff() {
        if (this.status) {
            this.status = false;
        }
        else {
            this.status = true;
        }
        return this.status;
    }

    public String checkStatus() {
        if (this.status) {
            return "Fan is ready";
        }
        else {
            return "Fan is not ready";
        }
    }

    public String checkSpeed() {
        return this.speed;
    }
}

class Example1 {
    public static void main(String[] args) {
        Fan myFan = new Fan();
        System.out.println(myFan.checkStatus());
        myFan.turnOnOff();
        myFan.changeSpeed("Fast");
        System.out.println(myFan.checkSpeed());
    }
}

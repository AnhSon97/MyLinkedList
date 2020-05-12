public class LinkedListTest {
    int prime;
    String type;
    int MaxSpeed;

    public LinkedListTest(){}
    public LinkedListTest(int prime, String type,int MaxSpeed){
        this.prime = prime;
        this.type = type;
        this.MaxSpeed = MaxSpeed;
    }

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "MyListTest{" +
                "prime=" + getPrime() +
                ", type='" + getType() + '\'' +
                ", MaxSpeed=" + getMaxSpeed() +
                '}';
    }
}
class test{
    public static void main(String[] args) {

    }
}



public class Fourth {
    private int number, minDivisor, sqrtNumber, i;

    public Fourth(int number){
        this.number = number;
        minDivisor = 1;
        sqrtNumber = (int) Math.sqrt(number);
        i = 2;
    }
    public String toString() {
        if(this.recursion()){
            return "The number is prime";
        }
        else{
            return "The number is not prime";
        }
    }

    public boolean recursion(){
        if (i<sqrtNumber){
            if(number % i == 0){
                minDivisor = i;
            }
            i++;
            recursion();
        }
        if(minDivisor == 1){
            return true;
        }
        else {
            return false;
        }
    }
}

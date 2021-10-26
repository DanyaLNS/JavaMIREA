public class Third {
    private int sum, number;

    public Third(int number){
        sum = 0;
        this.number = number;
    }

    public int recursion(){
        if(number!=0){
            sum += number % 10;
            number /= 10;
            return recursion();
        }
        else{
            return sum;
        }
    }
}

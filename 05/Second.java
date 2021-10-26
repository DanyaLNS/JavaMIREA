public class Second {
    private int k, s, number, kol;

    Second(int k, int s){
        this.k = k;
        this.s = s;
        kol = 0;
        number = (int) Math.pow(10, k-1);
    }
    public int getKol() {
        return kol;
    }

    public int getCountsOfDigits(long number) {
        // тернарный оператор: если число = 0, возвращаем 1, если нет - возвращаем длину числа
        return(number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));
    }

    public void recursion(){
        if(getCountsOfDigits(number) == k){
            int sum = 0, secondNumber = number; 
            while(secondNumber != 0){
                sum += secondNumber % 10;
                secondNumber /= 10;
            }
            if (sum == s){
                kol++;
            }
            number++;
            recursion();
        }
    }
}

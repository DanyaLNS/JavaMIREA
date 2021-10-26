public class First {
    private int start, finish;
    public First(int start, int finish){
        this.start = start;
        this.finish = finish;
    }
    public void recursion(){
        System.out.println(start);
        if(start != finish){
            if(start < finish){
                start++;
            }
            else{
                start--;
            }
            recursion();
        }
    }
}

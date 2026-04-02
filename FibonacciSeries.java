package week1.week1assgnt;
public class FibonacciSeries {
   public int range()
{
    int n=8;
    System.out.println("Enter the range:"+n);
    return n;  
} 
        public static void main(String[] args) {
            FibonacciSeries obj2=new FibonacciSeries();
            int count=obj2.range();
            int a=0,b=1,c;                     
            for(int i=1;i<=count;i++)
            {
              System.out.println(a);
              c=a+b;
              a=b;
              b=c;
            } 
    }
}

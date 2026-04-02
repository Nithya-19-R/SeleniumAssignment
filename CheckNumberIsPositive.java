package week1.week1assgnt;

public class CheckNumberIsPositive {
    public void ispositive(int version)
    {
      System.out.println("Enter the Number:"+version);
      if (version>0)
      {
        System.out.println(version+":Is Positive Number");
      }
      else{
        System.out.println(version+":Is Negative Number");
      }
    }
    

    public static void main(String[] args) {
        CheckNumberIsPositive obj1=new CheckNumberIsPositive(); 
        obj1.ispositive(5);    
    }

}

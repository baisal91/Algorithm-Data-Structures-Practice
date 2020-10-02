package Math_Number;

public class ReverseInteger {

    public static void main(String[] args){

        System.out.println(reverse(-123));

    }

    public static int reverse(int x){
        long result = 0;
        long negative =-1;
        boolean flag=true;

        if(x<0)
            flag=false;

        while(x !=0){
            result = result*10+x%10;
            x=x/10;
        }

        if(flag==false)
            return (int)(negative*result);
        else
            return (int) result;
    }
}

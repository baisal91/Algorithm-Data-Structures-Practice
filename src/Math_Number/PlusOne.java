package Math_Number;

public class PlusOne {

    public static void main(String[] args){

        int[] res = {9,9};

        int[] late = plusOne(res);


        for(int i=0; i<late.length; i++){
            System.out.print(late[i]);
        }


    }


    public static int[] plusOne(int[] digits) {

        for(int i= digits.length-1; i>=0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }

        }

        int[] newarr = new int[digits.length+1];
        newarr[0]=1;

        return newarr;
    }
}

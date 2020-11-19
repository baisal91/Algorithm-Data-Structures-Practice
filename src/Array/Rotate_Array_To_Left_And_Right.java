package Array;

public class Rotate_Array_To_Left_And_Right {



        public static void main(String[] args){

            int[] arr = {1, 2, 3};

            //shiftToRight(arr, 2);
            shiftToLeft(arr, 2);


        }

        public static void shiftToLeft(int [] arr, int k){

            int size = arr.length;

            for(int i=0; i<k; i++){
                int first = arr[0];
                for(int j=0; j<size-1; j++){
                    arr[j] = arr[j+1];
                }
                arr[size-1] = first;
            }


            for(int i: arr){
                System.out.print(i + " ");
            }


        }


        public static void shiftToRight(int[] arr, int k){


            int size = arr.length;
            int[] temp = new int[size];


            for(int i=0; i<size; i++){
                temp[(i+k) % size] = arr[i];
            }



            for(int i: temp){
                System.out.print(i + " ");
            }

        }




    }


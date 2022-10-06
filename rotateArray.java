import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class rotateArray {

    private static void rotateArray1(int[] input , int K){
             if(input.length <= 1 || K==0) {
                return;
             }

             K = K%input.length;

             reverse(input , 0 , input.length - K - 1);
             reverse(input ,  input.length - K , input.length - 1);
             reverse(input , 0 , input.length - 1);
    }

    private static void reverse(int[] input, int startIndex, int lastIndex) {
        while(startIndex<=lastIndex){
            int temp = input[startIndex];
            input[startIndex] = input[lastIndex];
            input[lastIndex] = temp;

            startIndex++;
            lastIndex--;
        }
    }

    public static void main(String[] args) throws NumberFormatException , IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int TestCases = Integer.parseInt(br.readLine().trim());
  
        while(TestCases -- > 0){
            int numberOfElements = Integer.parseInt(br.readLine().trim());

            int[] inputArray = new int[numberOfElements];
            
            String[] inputString = br.readLine().split(" ");

            for(int i=0; i<inputString.length; i++){
                inputArray[i] = Integer.parseInt(inputString[i]);
            }

            int K = Integer.parseInt(br.readLine().trim());

            rotateArray1(inputArray, K);

            for(int element : inputArray){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

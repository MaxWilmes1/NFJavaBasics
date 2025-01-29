package JavaBasics;

public class Arrays {

    public static void main (String[] args){
         int[] numbers = new int[5];
         numbers[0] = 1;
         int[] numbers2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(numbers[0]);

        // for-Schleife mit i
        for(int i=0; i<numbers2.length; i++ ){
            System.out.println(numbers2[i]);
        }
        System.out.println("Ende der for Schleife");

        // foreach-Schleife
        for(int number : numbers2){
            System.out.println(number);
        }
    }
}

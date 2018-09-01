import java.math.BigInteger;
class DataTypes{
    public static void main(String args[]){
        BigInteger bg = new BigInteger("10000000");
        BigInteger bg2 = new BigInteger("50000000");
        BigInteger bg3 = bg.add(bg2);
        System.out.println("Sum is "+bg3);
        int a = 100;
        long w1 = 200L;
        float x = 90.20F;
        boolean w = true;
        char w2 = 'A';
        String name = "Amit";
        System.out.println("नाम है"+name);
        boolean g1 = false;
        int p = 10;
        int a = 1;
        if(g1=true){
            System.out.println("True ");
        }
        else{
            System.out.println("False");
        }

        String day = "monday";
        //final int MONDAY = 1;
        //int day = MONDAY;
        switch(day){
            case "monday":
                System.out.println("Boring Day....");
                break;
        }
        // Loops
        //int arr [] = {10,20,30,40,50};
        //int [] arr = {10,20,30,40,50};
        //int [] arr = new int[5];
        int [] arr = new int[]{10,20,30,40,50};
        /*
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        */

        // Labeled Loops
        outer:
        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=3; j++){
                if(i==j){
                   continue outer;
                }
                 System.out.println("I is "+i+" and J is "+j);
            }
        }

        // Enhance for Loop
        for(int arrValue : arr){
            if(arrValue==30){
               continue;
               // break;
            }
            System.out.println(arrValue);
        }

        /*while(true){

        }*/
    }
}
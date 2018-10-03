public class FizzBuzz {

     public static boolean  isDivByThree(int x){
        if(x % 3 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isDivByFive(int x){
        if(x % 5 == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main (String[] args){
        String fiz = "fiz";
        String buzz = "buzz";

        for(int i = 1; i <= 100; i++){
            if(isDivByThree(i) && isDivByFive(i) ){
                System.out.println(i + fiz + buzz);
            }else {
                if (isDivByThree(i)){
                    System.out.println(i + fiz);
                }else {
                    if (isDivByFive(i)){
                        System.out.println(i + buzz);
                    }else {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}


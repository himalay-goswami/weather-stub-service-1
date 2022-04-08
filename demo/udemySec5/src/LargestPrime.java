
public class LargestPrime {

    public static int getLargestPrime(int number){

        if(number<0 || number==0){
            return -1;
        }

        for(int i=2; i<number; i++){
            if (number%i==0){
                number=number/i;
                i--;
            }
        }
    return number;
    }

    public static int findIfFactorIsPrime(int number){
        boolean isPrimeFactor;
        for(int i=2;i<number/2;i++){
            if(number%i==0){
                return -1;
            }
        }
        return number;
    }
}

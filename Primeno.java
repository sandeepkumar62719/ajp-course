public class Primeno {
    public static void main(String[] args) {
        int num1 = 100;
        for ( int i = 2; i<=num1; i++){
            boolean isPrime = true;
            for (int j = 2; j<=i/2; j++){
                if (i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
            }
            }
        }
    }   


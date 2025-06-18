public class loop1 {

    static void series (int range){
        int num1 = 0, num2 = 1;
        for(int i=0; i<range; i++){
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
            System.out.print(num1 + " ");
        }
    }
    public static void main(String[] args) {
        series(10);   
    }
}

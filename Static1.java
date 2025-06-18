public class Static1 {
    int num;
    static int val;
    static void getMsg(){
        System.out.println(val + "njdhudsc");
    }
    void getMsgs(){
        System.out.println(val + num + "dsucuds");
    }
    public static void main(String[] args) {
        val = 23;
        System.out.println(val);
        Static1 statico = new Static1();
        statico.num = 32;
        System.out.println(statico.num);
        getMsg();
        statico.getMsgs();
    }
}


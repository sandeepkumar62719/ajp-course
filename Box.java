public class Box {
    public int length;
    public int breadth;
    private int height; 
    public int volume(){
        return length*breadth*height;
    }
    public static void main(String[] args) {
        Box box = new Box();
        box.length = 20;
        box.height = 30;
        box.breadth = 40;
        System.out.println(box.volume());

    }
}

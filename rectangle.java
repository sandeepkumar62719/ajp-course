import java.lang.foreign.Arena;

public class rectangle {
    int Length;
    int Breadth;
    int Area;
    int perimeter;
    void getMeasures(){
        System.out.println("Length: " + Length+" \n" + "Breadth: " +Breadth);
    }

    void setMeasures(int L, int B ){
        Length = L;
        Breadth = B;
    }
    int GetArea(){
        return Area = Length*Breadth;
    }
    int GetAreaa(){
        return perimeter = 2*(Length+Breadth);
    }
    public static void main(String[] args) {
        rectangle details = new rectangle();

        
        details.setMeasures(12, 6);
        details.getMeasures();

        int percent = details.GetArea();
        System.out.println("Area: " + percent);

        int percentt = details.GetAreaa();
        System.out.println("perimeter: " + percentt);

    }
}

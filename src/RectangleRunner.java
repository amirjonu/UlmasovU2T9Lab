public class RectangleRunner {
    public static void main(String[] args){
        RightTriangle rec1= new RightTriangle(3, 4);
        RightTriangle rec2= new RightTriangle(6.5, 10.7);
        RightTriangle rec3= new RightTriangle(90, 60);
        double rec1hype= rec1.hypotenuse();
        double rec2hype= rec2.hypotenuse();
        double rec3hype= rec3.hypotenuse();
        System.out.println(rec1hype+"\n"+ rec2hype+"\n"+ rec3hype);
    }
}

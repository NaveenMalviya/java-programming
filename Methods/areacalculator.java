
public class areacalculator {
    public static double area(double radius){
        double PI=Math.PI;
        if(radius<0){
            return -1;
        }else{
            return PI*radius*radius;
        }
    }

    public static double area(double height, double base){
        if(height<0||base<0){
            return -1;
        }else{
            return height*base;
        }
    }

    public static void main(String[] args) {    
        System.out.println(area(4));
        System.out.println(area(2, 4)); 
    }
}

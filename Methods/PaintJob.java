import java.util.*;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0 || extraBuckets <= 0) {
            return -1;
        } else {

            double total_area = width * height;
            int total_buckets = (int) Math.ceil(total_area / areaPerBucket);
            int neededBuckets = total_buckets - extraBuckets;
            return neededBuckets;
        }

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0) {
            return -1;
        } else {
            double total_area = width * height;
            int total_buckets = (int) Math.ceil(total_area / areaPerBucket);
            return total_buckets;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            int total_buckets = (int) Math.ceil(area / areaPerBucket);
            return total_buckets;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();
        System.out.println("Enter areaPerBucket: ");
        double areaPerBucket = sc.nextDouble();
        System.out.println("Enter number of extraBUckets: ");
        int extraBUckets = sc.nextInt();
        System.out.println("Enter area: ");
        double area = sc.nextDouble();
        System.out.println(getBucketCount(width, height, areaPerBucket, extraBUckets));
        System.out.println(getBucketCount(width,height,areaPerBucket));
        System.out.println(getBucketCount(area,areaPerBucket));
        sc.close();
    }
}

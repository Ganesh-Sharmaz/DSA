package TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        int num = 257;
        byte b = (byte) (num); // maximum value that can be put into the byte is 256 and the num is 257, so it gives us the modulo 257%256 = 1
        System.out.println(b);

        // Automatic Type Promotion in Expression

        byte m = 40;
        byte n = 50;
        byte o = 100;
        int d = m*n/o; // byte can't store more than 256 bit but still it is evaluating 2000 because intermediary java is assigning it a int to evaluate
        System.out.println(d);

        byte x = 20;
        // l = l*10; // cannot assign byte to a int explicitly without typecasting

        byte f = 42;
        char g = 'a';
        short h = 1024;
        int i = 50_000;
        float j = 5.67f;
        double k = 0.1234;
        double l = (j*f)+(i/g)-(k*h);
        System.out.println((j*f)+ " " + (i/g)+ " " +(k*h));
        System.out.println(l);

    }
}
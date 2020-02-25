import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int rand_int1 = random.nextInt(10);
        int rand_int2 = random.nextInt(10);
        int rand_int3 = random.nextInt(10);

        int sum = rand_int1 + rand_int2 + rand_int3;
        System.out.println("First number" + rand_int1);
        System.out.println("Second number" + rand_int2);
        System.out.println("Third number" + rand_int3);

        System.out.println("Sum = " + sum);



    }
    }

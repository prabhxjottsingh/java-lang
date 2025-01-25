public class literals {
    public static void main(String args[]){
        
        int num1 = 0b101; // binary number
        System.out.println("This is binary number: " + num1);

        int hex = 0x7E; //hexadecimal number
        System.out.println("This is hexadeciaml number: " + hex);

        long diffZeroes = 100_000_0000; // differentiate zeroes count(just for programmers comfort)
        System.out.println("This is number: " + diffZeroes);

        double val = 56; // doubles values, int automatically gets converted to double
        System.out.println("This is double number: " + val);

        double bigVal = 12e10; // assigning big values to double
        System.out.println("This is binary number: " + bigVal);

        boolean flag = false; // 0 or 1 cannot be assigned to boolean
        System.out.println("This is boolean number: " + flag);

        char ch = 'a';
        ch++;
        System.out.println("This is the character, after incrementing it by one: " + ch);
    }
}

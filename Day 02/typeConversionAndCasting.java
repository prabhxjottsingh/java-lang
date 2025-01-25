public class typeConversionAndCasting {
    public static void main(String args[]){

        // small datatypes can be typecasted to larger ones
        // larger datatypes cannot be tyhpe casted to smaller ones

        byte by = 127;
        int intVal = 234;

        System.out.println("Before TypeCasting: " + intVal + " , " + by);
        intVal = by; //type Conversion -> Right Operation = Implicit Conversion
        // by = intVal; -> TypeConversion -> Wrong Operation
        by = (byte) intVal; //Type Casting -> Right Operation = Explicit Conversion
        System.out.println("After TypeCasting: " + intVal + " , " + by);

        intVal = 257;
        by = (byte) intVal; // 257 % 256 -> since range of byte is till 256
        System.out.println("After TypeCasting: " + intVal + " , " + by);

        byte a = 10, b = 20;
        // byte byRes = a * b; // compilation error: as mulitplication is going out of byte range
        int result = a * b; // a and b are typecasted to int this is called typePromotion
        System.out.println("Result: " + result);

    }
}

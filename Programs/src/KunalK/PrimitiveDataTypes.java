public class PrimitiveDataTypes {
    public static void main (String[] args){
        //char is for storing a single letter but requires a single apostrophe
        //16 bits or 2 bytes
        char test = 'T';
        //float is to store up to 7 decimal digits
        //32 bits or 4 bytes
        float ft = 55.123459876f;
        //double is used to store up to 16 decimal digits
        //64 bits or 8 bytes
        double db = 123456789.7;
        //int is used to store up to 10 decimal digits
        //32 bits or 4 bytes
        int i = 20;
        //long is used to store up to 19 decimal digits
        //64 bits or 8 bytes
        long lg = 1234567890987654321L;
        //boolean is used to store true or false flags
        //8 bits or 1 byte
        boolean bool = true;

        System.out.println("Char: " + test + "\nFloat: " + ft + "\nDouble: " + db + "\nInteger: " + i +"\nLong: " + lg + "\nBoolean: " + bool);
    }

}

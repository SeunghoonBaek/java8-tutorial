package src.com.winterbe.java8.samples.lambda;

/**
 * @author Benjamin Winterberg
 */
public class Lambda4 {

    @FunctionalInterface
    public interface Converter<F, T> {
        T convert(F from);
    }


    static int outerStaticNum;

    int outerNum;

    void testScopes() {
        Converter<Integer, String> stringConverterInstant = (from) -> {
            outerNum = 13;
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverterStatic = (from) -> {
            outerStaticNum = 13;
            return String.valueOf(from);
        };
    }

//        String[] array = new String[1];
//        Converter<Integer, String> stringConverter3 = (from) -> {
//            array[0] = "Hi there";
//            return String.valueOf(from);
//        };
//
//        int num = 1;
//
//        Converter<Integer, String> stringConverter = (from) -> {
//            return String.valueOf(from + num);
//        };


//
//        stringConverter3.convert(23);
//
//        System.out.println(array[0]);


    public static void main(String[] args) {
        new Lambda4().testScopes();
    }

}
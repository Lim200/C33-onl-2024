/**
 * <p>This is the first document for the TeachMeSkills students...
 * Welcome to the Java Development Course....
 * </p>
 * @author Sergey Huscsha
 */

// Name of the document must be the same as the name of the main Class
class Welcome{
    public static void main(String[] args){ // arguments
        // Entry-point

        // Method call
        // getBasicInformationOnJava();

        // Compile-time error is when you have syntax mistakes mainly
        checkResult();
    }

    // To check out whether you method is used - color must be blue
    // if not, grey
    public static void getBasicInformationOnJava(){
        // One-line comment

        /*
        This is multi-lines comments
         */

        // Java Code Convention:
        // 1. Class always is a noun, Animal, Chair, Car, Monkey, University
        // 2. When we create object we use UpperCamelCase style
        // 3. University - U upper case, UniversityBelarus, UniversityBelarusTechnology
        // 4. Functions in Java are called Methods -> retrievable block of code
        // 5. Method names always start with the verb and then noun and so on...
        // 6. Use LowerCamelCase -> getMessage, getProxyServer, setDataMySql
        // snake style -> C/C++ my_variable_message
        // 7. Variables except Class level variables:
        // 7.1. There must be clear understanding what it is -> WRONG: x, y, tell; CORRECT: weight, carSize,
        // myMessageSend;
        // 7.2. Variables are also written in the LowerCamelCase but with noun and then so on, including array
        // Object -> Noun, method verb (action), variables only store starts with noun

        // Keywords - part of the Java language, cannot be solely used as a variable or class or method names
        // Class -> Upper Letter, white
        // methods -> lower letter, white

        // return 0 -> compiler found no syntax and grammar mistakes
        // return 0 < 1.... mistake, we can return 1 to crush the program (return 1) -> c/c++ exit()

        // . access to the internal parts (C++ can be used -> )
        System.out.println("Welcome to Java with next line..."); // Print something and add next lene
        System.out.print("Welcome to Java without next line...");

        // Escape sequences special ASCII style characters \n means new line
        System.out.print("No new line...\n");
        System.out.print("The new line message...");

        // Frequently made mistakes
        System.out.println(); // by default '\n'

        // "" -> empty string, " " -> space, "\n" - new line
        // () -> EMPTINESS
        // ASCII Table for Java
        // https://www.javatpoint.com/java-ascii-table
        System.out.print(""); // EMPTINESS, no by default value
    }

    public static void setBasicVariables(){
        // Integer
        // Byte and short used for memory saving, no more actual unless you have very little memory
        // If you use byte and short in arithmetic operations and/or pass it as parameters they will by default
        // turn to integer
        byte byteValue = 10; // In this variable we will store byte value
        short shortValue = 1089;
        int intValue = 234894;
        long longValue = 48_0920_22L; // 2'000'2000 -> 200_00_211 just to understand how many numbers
        // integer -2.... till 2...
        // long -9...... till 9....
        // long value = 2; -> long value = 2l or 2L;
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);

        // officially, it is an integer value but factually it is a character
        // ASCII code table
        System.out.println("--------------------------------------------");
        char charValue = 'b'; // '_character'
        System.out.println(charValue);
        char charASCIIValue = 90;
        System.out.println(charASCIIValue);

        // Floating numbers
        // float PI = 3.1415F; -> f, F
        // double PI = 3.1415; -> if arithmetic or parameters needed
        System.out.println("----------------------------------------------");
        float floatValue = 34.567F; // . 7 numbers
        double doubleValue = 456.232323; // . 15 numbers, by default
        System.out.println(floatValue);
        System.out.println(doubleValue);

        // Logical
        // C/C++ !!! in Java boolean means boolean, only TRUE or FALSE
        // C/C++ 0 == false, != 0 true
        System.out.println("--------------------------------------------------");
        boolean isAlive = true;
        boolean isMarried = false;
        System.out.println(isMarried);
        System.out.println(isAlive);
    }

    public static void arithmeticOperators(){
        // +, -, *, /, %, ++, --, pre-increment, pre-decrement
        int height = 171;
        double weight = 80.1;

        int getSumHeightAddition = height + height; // Value without . = if you have 134.56 = int -> 134 after . delete
        int getSumHeightSubtraction = height - 78;

        double getSumWeightDivided = weight / 2; // . precision 15 numbers

        char storeChangingValue = 87; // ASCII table 87 -> 'W'

        // storeChangingValue + 3 -> char -> = storeChangingValue
        storeChangingValue = (char) (storeChangingValue + 3); // casting - приведение типов
        System.out.println(storeChangingValue);

        System.out.println(10%4); // 4+4 = 8, 10 - 8 = 2

        System.out.println(11%2); // 1 нечетное, 0 четное

        // + 1, -1
        int valueIncrement = 1;
        valueIncrement = valueIncrement + 1;
        int valueDecrement = 9;

        // post-increment
        valueIncrement++; // valueIncrement = valueIncrement + 1;
        // post-decrement
        valueDecrement--; // valueIncrement = valueIncrement - 1;
        // get value and then ++, --
        // valueIncrement++; // no issues
        // Expression: valueIncrement++ (by default 2) = 2, +1 = 3

        // pre-increment
        ++valueIncrement;
        // pre-decrement
        --valueDecrement;
        // --valueDecrement; -1
        // Expression: -1 and then get value
        --valueDecrement;
        // loop
    }

    public static void useIncrement(){
        // pre-fix increment & decrement
        int value = 10;
        ++value;
        System.out.println(value);

        --value; // -1
        --value; // -1
        System.out.println(value);

        // pre-fix increment, decrement
        System.out.println(1 + 5 * (--value)); // 8
        System.out.println("Final: " + (++value)); // 9

        // post-fix
        System.out.println(value++); // 9, 9+1 = 10
        System.out.println(value);
        System.out.println(value--); // 10, 10 - 1

        value = value - 1;
        value += 1; // value++, ++value, value = value + 1;
        value -= 1;
        value *= 5;
        value /= 10;
    }

    public static void checkResult(){
        // +
        // Archil Sikharulidze: 359
        System.out.println("Archil " + "Sikharulidze: " + 35 + (10 - 1));
    }
}
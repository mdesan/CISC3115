import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws AgeLessThanZeroException {
        validateAge(-3);
    }
    private static void validateAge(int age) throws AgeLessThanZeroException {
        if(age<0){
            throw new AgeLessThanZeroException();
        }
    }


}

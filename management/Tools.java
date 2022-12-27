package management;

import java.util.Scanner;

public class Tools {
    private static Scanner scanner;

    public static Scanner getScannerInstance(){
        if(scanner == null){
            return new Scanner(System.in);
        }
        return scanner;
    }

}

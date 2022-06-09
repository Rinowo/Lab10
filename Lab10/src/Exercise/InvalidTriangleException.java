package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class InvalidTriangleException {
    private ArrayList<String> catchError = new ArrayList<String>();
    private String Error;
    public InvalidTriangleException(String error){
        catchError.add(error);
    }

    public InvalidTriangleException() {

    }

    public void printError() {
        for (String error :
                catchError) {
            System.out.println(error);
            if (error == null) {
                System.out.println("No error found");
            }
        }
    }
}

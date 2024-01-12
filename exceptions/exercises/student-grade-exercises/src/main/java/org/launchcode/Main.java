package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        System.out.println(Divide(1, 10));
        System.out.println(Divide(1, 0));

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        System.out.println(CheckFileExtension(studentFiles.get("Carl")));
        System.out.println(CheckFileExtension(studentFiles.get("Brad")));
    }

    public static Double Divide(int x, int y)
    {
        // Write code here!
        Double myNumber = (double) 0;
        try {
            myNumber = (double) (x/y);
        }   catch (ArithmeticException e) {
            System.out.println("We cannot divide by zero!");
        }
        return myNumber;
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        if (fileName.isEmpty()) {
            try {
                throw new FileExtensionException("No file submitted.");
            } catch (FileExtensionException e) {
                e.printStackTrace();
                return -1;
            }
        } else if (fileName.endsWith(".java")) {
            return 1;
        }   else {
            return 0;
        }
    }
}
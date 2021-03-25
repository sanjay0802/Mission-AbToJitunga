package com.logic.abtojitunga.hackerrank;

import java.util.Scanner;

public class SplitClass {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
// String s="he is very very good boy's and can't do anything? 
        // Write your code here.
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] strings = s.split("['!?,._@ ]+");
            System.out.println(strings.length);
            for (String str : strings)
                System.out.println(str);
        }
    }
}

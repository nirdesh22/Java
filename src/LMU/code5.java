package LMU;

// To compare the two given inputs from the user and give true or false value( omiting any white spaces )

import java.util.Scanner;

class code5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String input1 = scanner.nextLine().trim().replaceAll(" ",""); // replaces the white spaces
        String input2 = scanner.nextLine().replaceAll("\\s",""); // the replaceAll counts all from the variable

        // the trims removes the any white spaces from the user input
        // the trim works for only " abc" or "abc " but not between like "my input"

        //replace() - only the first occurrence will be replaced
        //replaceAll() - as the word All indicates, replaces all occurrences


        boolean vergleich =input1.equals(input2);  // It is a true or false value type ( equals )

        System.out.println(vergleich);


    }
}

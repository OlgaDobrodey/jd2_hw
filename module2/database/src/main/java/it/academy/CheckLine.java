package it.academy;

import java.util.regex.Pattern;

public class CheckLine {
    public static void main(String[] args) {
        String a ="8,'2011-5-10',g, 24200";
        String b ="8,'2011-5-10',3, 2g4200";
        String c ="'2011-5-10',3, 24200";

        String result = linProcessing("8,'2011-05-10',3, 24200");
        System.out.println("A="+linProcessing(a));
        System.out.println("B="+linProcessing(b));
        String ac =linProcessing(c);
        System.out.println("C="+linProcessing(c));

        System.out.println(ac=null);
        System.out.println();


        System.out.println("REsult= "+result);

    }

    public static String linProcessing(String expenses) {
        if (expenses.isEmpty()) {
            System.out.println("Enter the expenses in the format:\n"
                    + "\"num_expenses,'YYYY-MM-DD',number receiver,cost \"");
            return null;
        }

        if (expenses.split(", ?").length != 4) {
            System.out.println("Test, you have not entered one of the parameters");
            return null;
        }
        String[] split = expenses.split(", ?");
        for (int i = 0; i < split.length; i++) {
            if (split[i].isEmpty()) {
                System.out.println("Parameter number " + i + " is empty");
                return null;
            }
        }
        try {
            Integer.parseInt(split[0].trim());
            Integer.parseInt(split[2].trim());
            Double.valueOf(split[3].trim());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
            return null;
        }
        boolean paydate = Pattern.matches("^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)$" +
                "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$" +
                "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$", split[1].replaceAll("'", ""));

        if (paydate == false) {
            System.out.println("Wrong format date. Correct date: YYYY-MM-DD.");
            return null;
        }

        return expenses;
    }
}







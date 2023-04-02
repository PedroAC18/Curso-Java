package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.*;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comments c1 = new Comments("Have a nice trip");
        Comments c2 = new Comments("Wow that's awesome");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zeland",
                "I'm going to visit this beatiful country!",
                12);

        p1.addComments(c1);
        p1.addComments(c2);


        Comments c3 = new Comments("Good night");
        Comments c4 = new Comments("May the Force be with you");
        Post p2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);
        p2.addComments(c3);
        p2.addComments(c4);

        System.out.println(p1);
        System.out.println(p2);

    }
}

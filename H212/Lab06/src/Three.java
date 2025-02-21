import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class Three {
    int[] l;
    public static void main(String[] args) {
        Three operator = new Three(); // init object
        int[] list = new int[0]; // init list
        operator.l = list;  // prep object's list
        Scanner s = new Scanner(System.in); // init scanner
        System.out.println("Welcome to the Array program!");
        while (true) { // main program loop
            System.out.println("Enter a number:");
            String n = s.nextLine(); // proc for and store input
            if (n.contains("bye")) {
                break;  // end program
            } else if (n.contains("sort")) {
              operator.sort(); // sort list
            } else {
                operator.addNum(Integer.parseInt(n)); // add number to list - parseInt is important here!
            }
        }

        System.out.println(operator.toString());
    }

    public void addNum(int num) {
        int[] newList = new int[l.length + 1]; // init new list, bigger than old one
        for (int i = 0; i < l.length; i++) {
            newList[i] = l[i]; // copy old list to new list
        }
        newList[l.length] = num; // add new entry to end of new list
        l = newList; // set internal list to the new one
    }

    // Note: to properly implement toString, we must declare it like this; no static or voids
    // this is because it will inherit from and override the overarching Object class; all
    // objects have a toString method
    public String toString () {
        String output = ""; // create output to store string
        output += "[";

        for (int i = 0; i < l.length; i++) { // this loop just iterates through l and tags it onto output
            if (i < l.length - 1) {
                output += l[i] + ", ";
            } else {
                output += l[i];
            }

        }
        output += "]";
        return output;

    }


    // An inefficient sorting algorithm I came up with on the fly
    // the inner loop will take the largest number in the list to the end, but will not place it
    // after larger numbers
    // the outer loop will run this code once for each member of the list, essentially ensuring that
    // every number is given the "chance" to be the largest so none slip through the cracks
    // this isn't really important, feel free to use whatever sorting algorithm you want
    // I'm mostly explaining this because sorting will become important later (in other classes
    // and in job interviews) so it might be good to keep a very simple algorithm like this in mind
    // for when you need it
    public void sort() {
        int larger = Integer.MIN_VALUE;
        for (int j = 0; j < l.length - 1; j++) {
            for (int i = 1; i < l.length; i++) {
                larger = l[i];
                if (l[i - 1] > larger) {
                    larger = l[i - 1];
                    l[i - 1] = l[i];
                    l[i] = larger;
                }
            }
        }
    }

}
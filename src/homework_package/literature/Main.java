package homework_package.literature;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        typeBook[] googleBooks = {
                new Book("112", 2023, "ddd", "book", "dud"),
                new Book("112", 2020, "ddd", "book", "dud"),
                new Book("112", 2023, "dfd", "book", "ddu"),
        };

        journalType[] googleJournals = {
                new Journal(2023, "d", "journal", "dd"),
                new Journal(2023, "d", "journal", "dd"),
                new Journal(2023, "d", "journal", "dd"),
                new Journal(2023, "d", "journal", "dd"),
        };
        yearbookType[] googleYearbooks ={
                new Yearbook("sss", 2023, "dd", "ddd", "yearbook"),
                new Yearbook("sss", 2022, "dd", "ddd", "yearbook"),
                new Yearbook("sss", 2021, "dd", "ddd", "yearbook"),
                new Yearbook("sss", 2020, "dd", "ddd", "yearbook"),


        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the time of print, please: ");
        int userTimeOfPrint = scanner.nextInt();



        for (int i = 0; i < googleBooks.length; i++){
            if(userTimeOfPrint == googleBooks[i].getTimeOfPrint()){
                System.out.print("Name: " + googleBooks[i].getName() + ", ");
                System.out.print("Author: " + googleBooks[i].getAuthor() + ", ");
                System.out.print("Publishing: " + googleBooks[i].getPublishing() + ", ");
                System.out.print("Type: " + googleBooks[i].getType() + ", ");
                System.out.print("Time of print: " + googleBooks[i].getTimeOfPrint() + ". ");

                System.out.println(" ");
            }
        }

        for (int i = 0; i < googleJournals.length; i++){
            if(userTimeOfPrint == googleJournals[i].getTimeOfPrint()){
                System.out.print("Name: " + googleJournals[i].getName() + ", ");
                System.out.print("Themes: " + googleJournals[i].getThemes() + ", ");
                System.out.print("Type: " + googleJournals[i].getType() + ", ");
                System.out.print("Time of print: " + googleJournals[i].getTimeOfPrint() + ". ");
                System.out.println(" ");
            }
        }
        for (int i = 0; i < googleYearbooks.length; i++){
            if(userTimeOfPrint == googleYearbooks[i].getTimeOfPrint()){
                System.out.print("Name: " + googleYearbooks[i].getName() + ", ");
                System.out.print("Themes: " + googleYearbooks[i].getThemes() + ", ");
                System.out.print("Publishing: " + googleYearbooks[i].getPublishing() + ", ");
                System.out.print("Type: " + googleYearbooks[i].getType() + ", ");
                System.out.print("Time of print: " + googleYearbooks[i].getTimeOfPrint() + ". ");

                System.out.println(" ");
            }
        }


    }
}





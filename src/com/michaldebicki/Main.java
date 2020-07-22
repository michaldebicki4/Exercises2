package com.michaldebicki;

import java.util.Scanner;

public class Main {
    public static void printSquareStar(int number) {
        int n = number;
        int m = number;
        if (number < 5)
            System.out.println("invalid Value");
        else {
            for (int i = 1; i <= number; i++) {


                for (int j = 1; j <= number; j++) {

                    m--;
                    if (i == 1 || i == number)
                        System.out.print("*");
                    else if (i == j)
                        System.out.print("*");
                    else if (j == n)
                        System.out.print("*");
                    else if (j == 1 || j == number)
                        System.out.print("*");
                    else
                        System.out.print(" ");

                }
                n--;
                System.out.println();
            }
        }
    }
    public static void czytanieUrodzenia(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //handle next line character


            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;

            System.out.println("Your name is " + name + ", and you are " + age + " years old.");

        }
        else System.out.println("zly tekst");
        scanner.close();
    }
    public static void readingUserInputChallange(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for(int i = 1; i <= 10 ; i++ ){
            System.out.println("Wpisz liczbę #" + i);
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {

                int wpiszLiczbe = scanner.nextInt();
                scanner.nextLine();
                System.out.println( "Wpisana liczba to " + wpiszLiczbe);
                sum += wpiszLiczbe;
            }
            else{
                System.out.println("Invalid Number");
            }
        }
        System.out.println(sum);
        scanner.close();

    }
    public static void minMax(){
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int minimum = 2147483647;
        int maximum = -2147483648;
        int poczatkowaWartosc = 0;

        while(true){


            System.out.println("Enter the number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int wpisanaLiczba = scanner.nextInt();
                scanner.nextLine();

                if (wpisanaLiczba >= maximum){
                    maximum = wpisanaLiczba;
                }
                if (wpisanaLiczba <= minimum){
                    minimum = wpisanaLiczba;
                }

                System.out.println("Maximum: " + maximum );
                System.out.println("Minimum: " + minimum);


            }
            else {
                break;
            }

        }
        scanner.close();
    }


    public static void inputThenPrintSumAndAvarage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avarage = 0;
        int iloscLiczb = 0;

        while(true){

            //System.out.println("Enter the number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                iloscLiczb++;
                int wpisanaLiczba = scanner.nextInt();
                scanner.nextLine();
                sum+= wpisanaLiczba;
                avarage += (double) wpisanaLiczba;


            }
            else {
                if(iloscLiczb != 0) {


                    avarage = avarage / (double) iloscLiczb;

                    avarage = Math.round(avarage);

                }


                System.out.println("SUM = " + sum + " AVG = " + (int) avarage);
                break;
            }

        }

        scanner.close();
    }

    public static  int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets ){
        double area = height* width;
        double neededBuckets = area/areaPerBucket - (double) extraBuckets ;
        neededBuckets = Math.ceil(neededBuckets);
        if(width <= 0 || height <= 0 || areaPerBucket <=0 || extraBuckets < 0){
            return -1;
        }
        else
            return (int) neededBuckets;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        double area = height* width;
        double neededBuckets = area/areaPerBucket ;
        neededBuckets = Math.ceil(neededBuckets);
        if(width <= 0 || height <= 0 || areaPerBucket <=0 ){
            return -1;
        }
        else
            return (int) neededBuckets;

    }
    public static int getBucketCount(double area, double areaPerBucket){
        double neededBuckets = area/areaPerBucket ;
        neededBuckets = Math.ceil(neededBuckets);
        if(area <= 0 || areaPerBucket <=0 ){
            return -1;
        }
        else
            return (int) neededBuckets;

    }




    public static void main(String[] args) {
//        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
//        System.out.println(getBucketCount(3.4,2.1,1.5,2));
//        System.out.println(getBucketCount(2.75,3.25,2.5,1));
//        System.out.println(getBucketCount(-3.4,2.1,1.5));
//        System.out.println(getBucketCount(3.4,2.1,1.5));
//        System.out.println(getBucketCount(7.25,4.3,2.35));
//        System.out.println(getBucketCount(3.4,1.5));
//        System.out.println(getBucketCount(6.26,2.2));
//        System.out.println(getBucketCount(3.26,0.75));
        readingUserInputChallange();


    }
}

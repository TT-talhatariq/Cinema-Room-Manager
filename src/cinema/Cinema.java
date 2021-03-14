package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        String [][] cinema;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int m = scanner.nextInt();
        while(m>9){
            m = scanner.nextInt();
        }
        System.out.println("Enter the number of seats in each row:");
        int n = scanner.nextInt();
        while(n>9){
            n = scanner.nextInt();
        }

        cinema = new String[m][n];
        array_fill(cinema);
        //cinema_view(cinema);
        //Estimating profit from new Room
        //book_ticket(cinema);
        //increase_space();
        //cinema_view(cinema);
        menu(cinema);
    }
    static void array_fill(String [][] array){
        for (String[] strings : array) {
            Arrays.fill(strings, "S");
        }
    }
    static void cinema_view(String [][] array){


        System.out.print("Cinema:\n  ");
        for(int i=1; i<array[0].length+1; i++){
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for(int i=1; i<=array.length; i++){
            System.out.print(i + " ");
            for (int j=0; j<array[0].length; j++){
                System.out.print(array[i-1][j] + " ");
            }
            System.out.print("\n");
        }

    }
    /*
    static void increase_space(){
        Scanner scanner = new Scanner(System.in);
        //Asking new Roes of Room
        System.out.println("Enter the number of rows:");
        int row = scanner.nextInt();
        //Asking seats in each room
        System.out.println("Enter the number of seats in each row:");
        int col = scanner.nextInt();
        //Caculating estimated profit
        int total_income = 0;
        if(row*col < 60)
            total_income = row*col*10;
        else {
            int first_half = row/2;
            int second_half = row-first_half;
            total_income = (first_half*col*10) + (second_half*col*8);
        }
        System.out.println("Total income:");
        System.out.println("$" + total_income);
    }

     */
    static void book_ticket(String [][] array){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a row number:");
        int m = scan.nextInt();
        while(m>array.length){
            m = scan.nextInt();
        }
        System.out.println("Enter a seat number in that row:");
        int n = scan.nextInt();
        while(n>array[0].length){
            n = scan.nextInt();
        }
        array[m-1][n-1] = "B";
        int ticket_price = 0;
        if(array.length*array[0].length <= 60)
            ticket_price = 10;
        else{
            if(m<= array.length/2)
                ticket_price = 10;
            else
                ticket_price = 8;
        }
        System.out.println("Ticket price: $" + ticket_price);
        }
    static void menu(String [][]array){
        int opt;

        boolean check = true;
        while (check){
            System.out.println("1. Show the seats\n2. Buy a ticket\n0. Exit");
            Scanner scan = new Scanner(System.in);
            opt = scan.nextInt();
            if(opt == 1)
                cinema_view(array);
            else if (opt == 2)
                book_ticket(array);
            else
                check = false;
        }
    }

}



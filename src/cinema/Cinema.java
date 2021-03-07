package cinema;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
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
        // Write your code here
        cinema_view(m, n);
        //Estimating profit from new Room
        book_ticket(m, n);
        //increase_space();
    }
    static void cinema_view(int m, int n){


        System.out.print("Cinema:\n  ");
        for(int i=1; i<=m+1; i++){
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for(int i=1; i<=m; i++){
            System.out.print(i + " ");
            for (int j=0; j<n; j++){
                System.out.print("S ");
            }
            System.out.print("\n");
        }

    }
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
    static void book_ticket(int row, int col){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a row number:");
        int m = scan.nextInt();
        while(m>row){
            m = scan.nextInt();
        }
        System.out.println("Enter a seat number in that row:");
        int n = scan.nextInt();
        while(n>col){
            n = scan.nextInt();
        }
        int ticket_price = 0;
        if(row*col<=60)
            ticket_price = 10;
        else{
            if(m<=row/2)
                ticket_price = 10;
            else
                ticket_price = 8;
        }
        System.out.println("Ticket price: $" + ticket_price);
        System.out.print("Cinema:\n  ");
        for(int i=1; i<=row+1; i++){
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for(int i=1; i<=row; i++){
            System.out.print(i + " ");
            for (int j=0; j<col; j++){
                if(i == m && j+1 == n)
                    System.out.print("B ");
                else
                    System.out.print("S ");
            }
            System.out.print("\n");
        }
    }
}



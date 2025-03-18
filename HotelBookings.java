package package1;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class HotelBookings {
    public static int countBookedRooms(String[] A) {
        Set<String> bookedRooms = new HashSet<>();

        for (String reservation : A) {
            char status = reservation.charAt(0); 
            String room = reservation.substring(1); 

            if (status == '+') {
                bookedRooms.add(room); 
            } else {
                bookedRooms.remove(room); 
            }
        }

        return bookedRooms.size(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of reservations: ");
        int N = sc.nextInt();
        sc.nextLine(); 

        String[] A = new String[N];

        System.out.println("Enter the reservations (e.g., +4A, -0G):");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLine();
        }

        System.out.println("Number of booked rooms: " + countBookedRooms(A));

        sc.close(); 
    }
}

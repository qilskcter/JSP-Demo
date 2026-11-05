package com.example.buoi2;

public class UserDB {
    public static long insert(User user) {
        // In ra console de kiem tra
        System.out.println("Inserted user: " + user.getEmail());
        return 1;
    }
}

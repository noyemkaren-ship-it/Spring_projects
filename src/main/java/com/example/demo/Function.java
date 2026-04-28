package com.example.demo;

public class Function {
    public static String check_password(String password) {
        if (password == null || password.length() < 8) {
            return "NO";
        }

        int count = 0;

        if (password.length() > 12) {
            count += 20;
        }

        else if (password.length() > 16) {
            count += 30;
        }

        if (password.matches(".*[#.!,_].*")) {
            count += 10;
        }

        if (password.matches(".*[A-Z].*")) {
            count += 10;
        }

        if (password.matches(".*[a-z].*")) {
            count += 10;
        }

        if (password.matches(".*[0-9].*")) {
            count += 10;
        }

        if (count >= 50) {
            return "strong";
        } else if (count >= 30) {
            return "medium";
        }else if (count >= 40) {
            return "strong";
        }
        return "NO";
    }
}
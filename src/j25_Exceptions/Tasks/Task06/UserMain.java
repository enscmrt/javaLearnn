package j25_Exceptions.Tasks.Task06;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        ArrayList<User> kullanıcılar=new ArrayList<>();
        Scanner oku = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            try {
                System.out.println("Kullanıcı " + (i + 1) + " bilgilerini giriniz:");
                System.out.print("Kullanıcı adı: ");
                String username = oku.nextLine();
                System.out.print("Şifre: ");
                String password = oku.nextLine();

                User user = new User(username, password);
                kullanıcılar.add(user);
            } catch (Exception e) {
                System.out.println("Hata: " + e.getMessage());
                i--; // Kullanıcıya şifreyi tekrar girmesi için döngüyü bir geri al
            }
        }

        // Kullanıcılar listesini ekrana yazdır
        System.out.println("\nEklenen Kullanıcılar:");
        for (User user : kullanıcılar) {
            System.out.println("ID: " + user.getId() +
                    ", Kullanıcı Adı: " + user.getUsername() +
                    ", Şifre: " + user.getPassword() +
                    ", Aktif: " + user.isActive() +
                    ", Oturum Açık: " + user.isSignedIn());
        }
    }



    }

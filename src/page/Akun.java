/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package page;

/**
 *
 * @author 2RAH
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Akun {
    protected String username;
    protected String password;
    protected String role;

    // --- OVERLOADING CONSTRUCTOR ---
    public Akun() { 
        this.username = "Guest"; 
    }

    public Akun(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // --- METHOD UNTUK OVERRIDE ---
    public void infoAkses() {
        System.out.println("Akses Dasar");
    }

    public void tampilkanRole() {
        System.out.println("Role: Akun Umum");
    }

    // --- SISIPKAN DI SINI (Method Baru untuk Override) ---
    public void bukaDashboard() {
        // Akan diisi oleh class anak
    }

}

// Sub-class User
class User extends Akun {
    public User(String user, String pass, String role) {
        super(user, pass, role);
    }

    @Override
    public void infoAkses() {
        javax.swing.JOptionPane.showMessageDialog(null, "Login sebagai User. Akses terbatas.");
    }

    @Override
    public void tampilkanRole() {
        javax.swing.JOptionPane.showMessageDialog(null, "Ini adalah akun USER biasa.");
    }

    // --- SISIPKAN DI SINI ---
    @Override
    public void bukaDashboard() {
        new dasboard(username, password, role).setVisible(true);
    }
}

// Sub-class Admin
class Admin extends Akun {
    public Admin(String user, String pass, String role) {
        super(user, pass, role);
    }

    @Override
    public void infoAkses() {
        javax.swing.JOptionPane.showMessageDialog(null, "Login sebagai ADMIN. Akses penuh terbuka!");
    }

    @Override
    public void tampilkanRole() {
        javax.swing.JOptionPane.showMessageDialog(null, "Ini adalah akun ADMIN (Akses Penuh).");
    }

    // --- SISIPKAN DI SINI ---
    @Override
    public void bukaDashboard() {
        new dasboard_admin(username).setVisible(true);
    }
}
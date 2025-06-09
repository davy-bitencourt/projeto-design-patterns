/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.view;

/**
 *
 * @author Dave
 */
public class Util {

    public static String numeroValido(String t) {
        return t == null || t.isEmpty() || !t.matches("[0-9.]+") ? "0" : t;
    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses;

/**
 *
 * @author lab_services_student
 */
public class PrjClasses {

    public static void main(String[] args) {
        System.out.println("Greetings, Testing on Github");
        
        newClass nc = new newClass();  //creating a object of newclass
        
        nc.helloClass(); // have to use variable nc to communicate with the class
        
        System.out.println(nc.strSecondClassVar); // outpu variable from 2nd class
    }
}

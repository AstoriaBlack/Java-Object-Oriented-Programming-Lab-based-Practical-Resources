/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package HealthCentreCoursework_5COSC019W_Package;

/**** ENTER HERE YOUR DETAILS:*******
         * 
         * FIRST NAME:
         * 
         * LAST NAME:
         * 
         * STUDENT ID:
         * 
         */


public class HealthCentreCoursework_5COSC019W {

    public static void main(String[] args) {
        
        HealthCentreManager UoWHealthCentre = new WestminsterHealthCentreManager(100);
        boolean exit = false;
        while (!exit){
            exit = UoWHealthCentre.runMenu();
        }
        
        
        
    }
}

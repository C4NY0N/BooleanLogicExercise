package org.horizoncolumbus.hs;

public class TechDistribution {

    public static void main(String[] args) {
	// write your code here
        boolean Junior = true;
        boolean Senior = false;
        boolean Teacher = false;
        boolean Admin = false;
        boolean CTE = false;
        boolean Home = true;

        if(Junior || (Senior && CTE)){
            System.out.println("Windows Laptop Given");
        }
        else if (Teacher || (Admin && Home)){
            System.out.println("Macbook Given");
        }
        else{
            System.out.println("Take a Chromebook");
        }
    }
}

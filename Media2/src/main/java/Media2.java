/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.util.Scanner;

public class Media2 {
    
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        double a = ler.nextDouble();
        double b = ler.nextDouble();
        double c = ler.nextDouble();
        double media = ((a * 2) + (b * 3) + (c * 5)) / 10;
        System.out.println(String.format("MEDIA = %.1f" , media));
    }
	

}



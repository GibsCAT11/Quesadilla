/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.telefono;

import java.util.Scanner;



/**
 *
 * @author GibsCat
 */
public class Telefono {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de números telefónicos (separados por espacios):");
        String input = scanner.nextLine();
        
        // Dividir la cadena en números telefónicos individuales
        String[] telefonos = input.split(",");
        
        // Inicializar contadores para cada área y desconocidos
        int tijuana = 0;
        int hermosillo = 0;
        int guaymas = 0;
        int desconocidos = 0;
        
        // Iterar a través de los números telefónicos y contar en qué área pertenecen o son desconocidos
        for (String telefono : telefonos) {
            if (telefono.startsWith("664")) {
                tijuana++;
            } else if (telefono.startsWith("662")) {
                hermosillo++;
            } else if (telefono.startsWith("622")) {
                guaymas++;
            } else {
                desconocidos++;
            }
        }
        
        // Mostrar los resultados
        System.out.println("Números de Tijuana: " + tijuana);
        System.out.println("Números de Hermosillo: " + hermosillo);
        System.out.println("Números de Guaymas: " + guaymas);
        System.out.println("Números desconocidos: " + desconocidos);
    }
}







/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplication;

import aplication.entites.product;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class programLoja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter produto é data:");
        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("preço: ");
        double price = sc.nextDouble();

        product product = new product(name, price);

        product.setName("control");
        System.out.println("update name: " + product.getName());

        product.setPrice(1200.00);
        System.out.println("Update price: " + product.getPrice());

        System.out.println(product);

        System.out.println();
        System.out.println("product data: " + product);

        System.out.println();
        System.out.println("enter para add produtos no estoque: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("Estoque atualizado: " + product);

        System.out.println();
        System.out.println("enter para remover produtos do estoque");
        quantity = sc.nextInt();

        product.removeProduct(quantity);
        System.out.println();
        System.out.println("Estoque atualizado" + product);

    }

}

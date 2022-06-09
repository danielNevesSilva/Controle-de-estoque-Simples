/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplication.entites;

/**
 *
 * @author danie
 */
public class product {

    private String nome;
    private double price;
    private int quantity;

    public product() {

    }

    public product(String nome, double price, int quantity) {
        this.nome = nome;
        this.price = price;
        this.quantity = quantity;
    }

    public product(String nome, double price) {
        this.nome = nome;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;

    }

    public String toString() {
        return nome
                + ", $"
                + String.format("%.2f ", price)
                + ","
                + quantity
                + " units, total: $ "
                + String.format("%.2f ", totalValueInStock());
    }
}

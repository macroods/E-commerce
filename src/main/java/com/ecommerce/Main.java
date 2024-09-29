package com.ecommerce;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        ProductService productService = new ProductService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Registro de Usuário:");
        System.out.print("Nome: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String password = scanner.nextLine();

        userService.registerUser(name, email, password);
        System.out.println("Usuário registrado!");

        System.out.println("Adicionar Produto:");
        System.out.print("Nome: ");
        String productName = scanner.nextLine();
        System.out.print("Preço: ");
        double price = scanner.nextDouble();
        System.out.print("Estoque: ");
        int stock = scanner.nextInt();

        productService.addProduct(productName, price, stock);
        System.out.println("Produto adicionado!");

        System.out.print("Buscar Produto por ID: ");
        int productId = scanner.nextInt();
        Product product = productService.getProductById(productId);
        if (product != null) {
            System.out.println("Produto: " + product.getName() + " - Preço: " + product.getPrice());
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
}

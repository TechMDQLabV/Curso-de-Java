package org.sergiogarguir.appfacturas;

import org.sergiogarguir.appfacturas.model.Cliente;
import org.sergiogarguir.appfacturas.model.Factura;
import org.sergiogarguir.appfacturas.model.ItemFactura;
import org.sergiogarguir.appfacturas.model.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Pepe","2312351644");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese descripción: ");
        Factura factura = new Factura(cliente);
        factura.setDescripcion(s.nextLine());

        Producto producto;

        System.out.println();

        for(int i=0; i< 2;i++){
            producto = new Producto();

            System.out.print("Ingrese producto nº " + producto.getCodigo() + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");

            factura.addItemFactura(new ItemFactura(s.nextInt(), producto));

            System.out.println();
            s.nextLine();
        }

        System.out.println();
        System.out.println(factura.generarDetalle());
    }
}

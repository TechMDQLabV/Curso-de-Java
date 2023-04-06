package org.sergiogarguir.appfacturas.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItem = 0;


    private static int ultimoId;
    public static final int MAX_ITEMS = 10;

    public Factura(Cliente cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.items = new ItemFactura[MAX_ITEMS];
        this.id = ++ultimoId;
        this.fecha = new Date();
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public void addItemFactura(ItemFactura item){
        if(indiceItem < MAX_ITEMS){
            this.items[indiceItem++] = item;
        }
    }

    public float calcularTotal(){
        float total = 0.0f;
        for(int i=0; i < this.indiceItem; i++){
            total += this.items[i].calcularImporte();
        }
        return total;
    }

    public String generarDetalle(){
        StringBuilder sb = new StringBuilder("Factura Nº: ");
        sb.append(id).append("\nCliente: ").append(this.cliente.getNombre())
                .append("\nCUIT: ").append(this.cliente.getCuit())
                .append("\nDescripción: ").append(this.getDescripcion())
                .append("\n");

        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");

        sb.append("Fecha Emisión: ").append(df.format(this.fecha)).append("\n")
                .append("\n#\tNombre\tPrecio\tCant.\tTotal\n");

        for(int i=0; i < this.indiceItem; i++){
            sb.append(this.items[i].toString()).append("\n");
        }

        sb.append("\n Total............: ").append(this.calcularTotal())
                    .append("\n");

        return sb.toString();
    }
}

package com.proyecto.integrador.models;

public class Ordenes {

    public String Cliente;
    public String DNI;
    public String FechaOrden;
    public String Total;
    public String Casillero;

    public String Estado;
    public Ordenes(String cliente, String DNI, String fechaOrden, String total, String casillero, String estado) {
        Cliente = cliente;
        this.DNI = DNI;
        FechaOrden = fechaOrden;
        Total = total;
        Casillero = casillero;
        Estado = estado;
    }


}

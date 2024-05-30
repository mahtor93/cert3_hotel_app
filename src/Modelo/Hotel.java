/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author Metatron
 */
public class Hotel {
    
    private String Codigo_Hotel;
    private String Nombre_Hotel;
    private String Ciudad_Hotel;
    private Integer Estrellas_Hotel;
    private Boolean Mascotas_Hotel; 

    @Override
    public String toString() {
        String mascotas;
        if(Mascotas_Hotel){
            mascotas = "Si";
        } else {
            mascotas = "No";
        }
        return "HOTEL : "+Nombre_Hotel+"\n"+"CODIGO HOTEL : "+Codigo_Hotel+"\n"+"UBICACIÓN : "+Ciudad_Hotel+"\n"+"ESTRELLAS : "+Estrellas_Hotel+"\n"+"ADMITE MASCOTAS : "+mascotas+"";
        //return "Hotel{" + "Codigo_Hotel=" + Codigo_Hotel + ", Nombre_Hotel=" + Nombre_Hotel + ", Ciudad_Hotel=" + Ciudad_Hotel + ", Estrellas_Hotel=" + Estrellas_Hotel + ", Mascotas_Hotel=" + Mascotas_Hotel + '}';
    }
    
    

    public Hotel() {
    }
    
    
    public String getCodigo_Hotel() {
        return Codigo_Hotel;
    }

    public void setCodigo_Hotel(String Codigo_Hotel) {
        this.Codigo_Hotel = Codigo_Hotel;
    }

    public String getNombre_Hotel() {
        return Nombre_Hotel;
    }

    public void setNombre_Hotel(String Nombre_Hotel) {
        this.Nombre_Hotel = Nombre_Hotel;
    }

    public String getCiudad_Hotel() {
        return Ciudad_Hotel;
    }

    public void setCiudad_Hotel(String Ciudad_Hotel) {
        this.Ciudad_Hotel = Ciudad_Hotel;
    }

    public Integer getEstrellas_Hotel() {
        return Estrellas_Hotel;
    }

    public void setEstrellas_Hotel(Integer Estrellas_Hotel) {
        this.Estrellas_Hotel = Estrellas_Hotel;
    }

    public Boolean getMascotas_Hotel() {
        return Mascotas_Hotel;
    }

    public void setMascotas_Hotel(Boolean Mascotas_Hotel) {
            this.Mascotas_Hotel = Mascotas_Hotel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.Codigo_Hotel);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hotel other = (Hotel) obj;
        return Objects.equals(this.Codigo_Hotel, other.Codigo_Hotel);
    }

        public static class cities
    {
        public static String[] city_list = {"Seleccione","Chillán","Concepción","La Serena","Pucón","Puerto Montt", "Punta Arenas","Santiago","Valparaíso","Viña del Mar"};
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import sql.Conexion; //Importa la clase Conexion del directorio sql
import Modelo.Hotel; //Importa la clase Hotel del directorio de modelos
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/* @author Metatron */

public class Registro {

    
    public static boolean addHotel(Hotel hotel){
        
        try{
            Connection conexion = Conexion.getConexion(); //Funcion proveniente de la clase Conexion
            String query ="INSERT INTO hotel(codigo,nombre,ciudad,estrellas,mascotas)VALUES (?,?,?,?,?)"; //String que almacena la instruccion SQL para añadir un elemento a la BD
            PreparedStatement insertar = conexion.prepareCall(query);
            insertar.setString(1, hotel.getCodigo_Hotel());
            insertar.setString(2,hotel.getNombre_Hotel());
            insertar.setString(3,hotel.getCiudad_Hotel());
            insertar.setInt(4, hotel.getEstrellas_Hotel());
            if(hotel.getMascotas_Hotel()){
            insertar.setInt(5,1);
            }
            if(!hotel.getMascotas_Hotel()){
            insertar.setInt(5,0);
            }            
            insertar.execute();
            insertar.close();
            conexion.close();
            return true;
        
        }catch(SQLException s){
            System.out.println("ERROR SQL al agregar usuario"+s.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("ERROR al agregar usuario"+e.getMessage());
            return false;
        }
    }
   
    public static void deleteHotel(String codEliminar){
    try{
        Connection conexion = Conexion.getConexion();
        String query="DELETE FROM hotel WHERE codigo=?";
        PreparedStatement eliminar = conexion.prepareStatement(query);
        eliminar.setString(1,codEliminar);
        eliminar.execute();
        eliminar.close();
        conexion.close();
    }catch(SQLException s)
    { 
        System.out.println("ERROR SQL al eliminar Hotel"+s.getMessage());
    }catch(Exception e)
    {
        System.out.println("ERROR al eliminar"+e.getMessage());
    }
    }
    public static ArrayList<Hotel> showAll(){
    ArrayList<Hotel> listHotel = new ArrayList<Hotel>();
    try{
        Connection conexion = Conexion.getConexion();
        String query = "SELECT * FROM hotel";
        PreparedStatement listAll = conexion.prepareStatement(query);
        ResultSet rs = listAll.executeQuery();
        while(rs.next()){
            Hotel hotel = new Hotel();
            hotel.setCodigo_Hotel(rs.getString("codigo"));
            hotel.setNombre_Hotel(rs.getString("nombre"));
            hotel.setCiudad_Hotel(rs.getString("ciudad"));
            hotel.setEstrellas_Hotel(rs.getInt("estrellas"));
            hotel.setMascotas_Hotel(rs.getBoolean("mascotas"));
            listHotel.add(hotel);
        }
    }catch(SQLException s){
        System.out.println("Error SQL al listar usuario"+s.getMessage());
    }catch(Exception e){
        System.out.println("Error al listar usuario"+e.getMessage());
    }
    
    return listHotel;
    }
    
    
    public static Hotel searchHotel(String codSearch){
        ArrayList<Hotel> findHotel = new ArrayList<Hotel>();
        
        try{
            Hotel hotel_buscado = null;
            Connection conexion = Conexion.getConexion();
            String query ="SELECT codigo,nombre,ciudad,estrellas,mascotas FROM hotel WHERE codigo=?";
            PreparedStatement searchByCode = conexion.prepareStatement(query);
            searchByCode.setString(1,codSearch);
            ResultSet rs = searchByCode.executeQuery();
            while(rs.next()){
                Hotel hotel_encontrado = new Hotel();
                hotel_encontrado.setCodigo_Hotel(rs.getString("codigo"));
                hotel_encontrado.setNombre_Hotel(rs.getString("nombre"));
                hotel_encontrado.setCiudad_Hotel(rs.getString("ciudad"));
                hotel_encontrado.setEstrellas_Hotel(rs.getInt("estrellas"));
                hotel_encontrado.setMascotas_Hotel(rs.getBoolean("mascotas"));
                hotel_buscado = hotel_encontrado;
                return hotel_buscado;
            }
            
        }catch(SQLException s){
            System.out.println("Error SQL al listar usuario"+s.getMessage());
        }catch(Exception e){
            System.out.println("Error al listar usuario"+e.getMessage());
        }
        
        return null;
    }


}

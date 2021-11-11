package logica;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import persistencia.ControladoraPersistencia;

/**
 *
 * @author leonardo dibiagi
 */
public class Controladora {

    // Conexion con la controladora de persistencia
    Connection con = null;
     PreparedStatement stmt = null;

    String sDriver = "com.mysql.cj.jdbc.Driver";
     String sURL = "jdbc:mysql://localhost:3306/peluqueria_canina";
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
     public void altaCliente(String nroCliente,String nombrePerro, String razaPerro, String colorPelaje, String alergicoSi, String atencionEspecialSi, String nombreDuenio, String celularDuenio, String observacion) {

        Cliente cliente = new Cliente();
        cliente.setNroCliente(nroCliente);
        cliente.setNombrePerro(nombrePerro);
        cliente.setRazaPerro(razaPerro);
        cliente.setColorPelaje(colorPelaje);
        cliente.setAlergicoSi(alergicoSi);
        cliente.setAtencionEspecialSi(atencionEspecialSi);
        cliente.setNombreDuenio(nombreDuenio);
        cliente.setCelularDuenio(celularDuenio);
        cliente.setObservacion(observacion);
        
        
         
         controlPersis.crearCliente(cliente);

    }
    

    public void altaCliente(Cliente cliente) {

        controlPersis.crearCliente(cliente);

    }

    public void bajaCliente(Cliente cliente) {

        controlPersis.eliminarCliente(cliente);

    }

    public void bajaCliente(int id) {

        controlPersis.eliminarCliente(id);

    }

    public List<Cliente> traerCliente() {

        return controlPersis.obtenerCliente();

    }

    public void modificarCliente(Cliente cliente) {

        controlPersis.modificarCliente(cliente);

    }

    public void buscarCliente(Cliente cliente) {

        controlPersis.buscarCliente(cliente);

    }

    public void buscarCliente(int id) {

        controlPersis.buscarCliente(id);

    }
    
    
    public boolean ValidaClienteExistente(String nCliente) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
 
         Class.forName(sDriver).newInstance();    
        con = DriverManager.getConnection(sURL,"pelu","768pelu");
            
            
        PreparedStatement    pstm = con.prepareStatement("SELECT nroCliente FROM Cliente WHERE nroCliente = '" + nCliente + "'");
           
        try (ResultSet res = pstm.executeQuery()) {
            while(res.next()){
                String nroCliente = res.getString("nroCliente");
                if ( nCliente.equals(nroCliente) ){
                    
                    return true;
                } 
            }
        }
        return false;
       
         
        
    }
   
    }
    
    
    
    



package logica;

import gui.PantallaPrincipal;

/**
 *
 * @author leonardo dibiagi
 */
public class PeluqueriaCanina {

  
    public static void main(String[] args) {
        
        //creamos una instancia de Controladora llamada control
        
        Controladora control = new Controladora();
        
        //con esto la interfaz grafica conoce donde esta la lógica
        
    //    Cliente  cliente1 = new Cliente(0,"fifi", "caniche", "blanco", "NO", "NO", "ANA", "24543444", "ASDASDASASD");
        
      PantallaPrincipal principal = new PantallaPrincipal(control);
        
        principal.setVisible(true);
        
        principal.setLocationRelativeTo(null);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerc.proyecto.tictactoe.ed;

import java.util.List;

/**
 *
 * @author crist
 */
public class Arbol {

    private Tablero tablero;

    public Tablero minmax() {

        //generar todos los estados posibles (hijos de tablero)
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                String valor = tablero.getMatriz()[f][c];

                if (valor.equals("")) {
                    Tablero temporal = new Tablero(this.tablero.getX(), this.tablero.getO(), tablero.getTurno());

                    temporal.agregarPosiciones(this.tablero);
                    temporal.actualizarMatriz(f, c);
                    //añadir todos los tableros al arbol
                    tablero.addHijo(temporal);
                }
            }
        }

        tablero.actualizarTurno();
        
        for (int i = 0; i < tablero.getHijos().size(); i++) {
          for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                Tablero v =  (Tablero) tablero.getHijos().get(i);// maquina virtual exige
                String matrizHijo=v.getMatriz()[f][c];
                

                if (matrizHijo.equals("")) {
                    Tablero temporal2 = new Tablero(this.tablero.getX(), this.tablero.getO(), tablero.getTurno());

                    temporal2.agregarPosiciones(v);
                    temporal2.actualizarMatriz(f, c);
                   
                    temporal2.setUtilidad( temporal2.calcularUtilidad());
                    
                    
                    v.addHijo(temporal2);
                }
            }
        }
            
            
        }
        
        
        for (int i = 0; i < tablero.getHijos().size(); i++){
            Tablero v =  (Tablero) tablero.getHijos().get(i);// maquina virtual exige
             int utilidaNieto = v.compararUtilidadesNietos();
             v.setUtilidad(utilidaNieto);
        }
        
        
        Tablero retorno = tablero.compararUtilidadHijos();
        return retorno;
        
      //pendiente calcular utilidad 
      // c.u hijos, nietos

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Minijuegos.Ordenamiento.Mini_Game;

import Minijuegos.Ordenamiento.Views.Init;
import Minijuegos.Ordenamiento.Views.Principal;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alisser
 */
public class Mini_Game {

    public void inicio() throws IOException {
        Principal gameWindow;
        try {
            gameWindow = new Principal();
            gameWindow.setVisible(true);
            gameWindow.WordsToLabel();
        } catch (IOException ex) {
            Logger.getLogger(Init.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

package ParteGrafica.vista;

import Minijuegos.Preguntas.JuegoDePreguntas;
import Minijuegos.Memoria.Principal.GAME;
import Minijuegos.Ordenamiento.Mini_Game.Mini_Game;
import ParteGrafica.modelos.PersonajePpal;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SpriteAnimation extends JPanel implements KeyListener {
    
    private boolean juegoEjecutandose = true;
    private int controlJuego1 = 0;
    private boolean saltoControles = false; 
    private int controlJuego2 = 0;
    private int controlJuego3 = 0;
    private BufferedImage spriteSheet;
    private int contEnter = 0;
    private BufferedImage controles;
    private BufferedImage fondo;
    private BufferedImage dialogo1;
    private BufferedImage dialogo2;
    private BufferedImage dialogo3;
    private BufferedImage dialogoGuardia;
    private BufferedImage output;
    private int spriteIndex = 0;
    private int x = 220;
    private int y = 430;
    private int speed = 10;
    private int spriteWidth = 64;
    private int spriteHeight = 64;
    private int screenWidth = 900;
    private int screenHeight = 630;
    private boolean movingUp = false;
    private boolean movingDown = false;
    private boolean movingLeft = false;
    private boolean movingRight = false;
    private boolean enter = false;
    PersonajePpal personaje = new PersonajePpal();

    public SpriteAnimation() {

        try {
            controles = ImageIO.read(new File("src\\main\\java\\ParteGrafica\\img\\controles.png"));
            dialogo1 = ImageIO.read(new File("src\\main\\java\\ParteGrafica\\img\\dialogoInicial.png"));
            spriteSheet = ImageIO.read(new File("src\\main\\java\\ParteGrafica\\img\\soldier.png"));
            dialogo2 = ImageIO.read(new File("src\\main\\java\\ParteGrafica\\img\\dialogoIntermedio.png"));
            dialogo3 = ImageIO.read(new File("src\\main\\java\\ParteGrafica\\img\\dialogoFinal.png"));
            dialogoGuardia = ImageIO.read(new File("src\\main\\java\\ParteGrafica\\img\\dialogoGuardia.png"));
            output = ImageIO.read(new File("src\\main\\java\\ParteGrafica\\img\\output.png"));
        } catch (IOException e) {
            System.out.println("Error al cargar la hoja de sprites: " + e.getMessage());
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Sprite Animation");
        frame.add(this);
        frame.setSize(screenWidth, screenHeight);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
        setFocusable(true);
        frame.setResizable(false);
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (!(personaje.frenteTrofeo(x, y))) {
            try{
                if(!personaje.terminado()){
                fondo = ImageIO.read(new File("src\\main\\java\\ParteGrafica\\img\\mapaInicial.png"));
            }
            else{
                fondo = ImageIO.read(new File("src\\main\\java\\ParteGrafica\\img\\mapaFinal.png"));
            }
            }catch(Exception e){
            }
            
            g.drawImage(fondo,0,0,null);

            switch (personaje.posicionDialogo(x, y)) {
                case 1 -> {
                    if (enter) {
                        if(personaje.isJuego1Terminado()==true){
                            g.drawImage(dialogo3,350,330,null);
                        }
                        else{
                           g.drawImage(dialogo2, 350, 330, null); 
                        }
                    }
                    else {
                        g.drawImage(dialogo1, 400, 380, null);
                    }
                    if((contEnter >=2)&& !personaje.isJuego1Terminado()){
                        inicioJuego1();
                        personaje.setJuego1Terminado(true);
                    }
                }
                case 2 -> {
                    if (enter) {
                        if(personaje.isJuego2Terminado()==true){
                            g.drawImage(dialogo3,90,20,null);
                        }
                        else{
                        g.drawImage(dialogo2, 90, 20, null);
                        }
                    } else {
                        g.drawImage(dialogo1, 140, 70, null);
                    }
                    if((contEnter >=2)&&(!personaje.isJuego2Terminado())){
                        inicioJuego2();
                        personaje.setJuego2Terminado(true);
                    }
                }
                case 3 -> {
                    if (enter) {
                        if(personaje.isJuego3Terminado() == true){
                            g.drawImage(dialogo3,600,20,null);
                        }
                        else{
                        g.drawImage(dialogo2, 600, 20, null);
                        }
                    } else {
                        g.drawImage(dialogo1, 650, 70, null);
                    }
                    if((contEnter >= 2)&&(!personaje.isJuego3Terminado())){
                        inicioJuego3();
                        personaje.setJuego3Terminado(true);
                    }
                }
                case 4 -> {
                    if (enter) {
                        g.drawImage(dialogoGuardia, 350, 230, null);
                    } else {
                        g.drawImage(dialogo1, 400, 280, null);
                    }
                }
            }

            if (movingUp) {
                Image sprite = spriteSheet.getSubimage(spriteIndex * spriteWidth, 0, spriteWidth, spriteHeight);
                g.drawImage(sprite, x, y, null);
            }
            if (movingDown) {
                Image sprite = spriteSheet.getSubimage(spriteIndex * spriteWidth, 2 * spriteHeight, spriteWidth, spriteHeight);
                g.drawImage(sprite, x, y, null);
            }
            if (movingLeft) {
                Image sprite = spriteSheet.getSubimage(spriteIndex * spriteWidth, 1 * spriteHeight, spriteWidth, spriteHeight);
                g.drawImage(sprite, x, y, null);
            }
            if (movingRight) {
                Image sprite = spriteSheet.getSubimage(spriteIndex * spriteWidth, 3 * spriteHeight, spriteWidth, spriteHeight);
                g.drawImage(sprite, x, y, null);
            }
            if ((!movingUp) & (!movingDown) & (!movingLeft) & (!movingRight)) {
                Image sprite = spriteSheet.getSubimage(0, 64 * 2, spriteWidth, spriteHeight);
                g.drawImage(sprite, x, y, null);
            }
            if(!saltoControles){
                g.drawImage(controles,150,100,null);
            }
        }
        else{
            g.drawImage(output,0,0,null);
            juegoEjecutandose = false;
        }

    }
    public void inicioJuego1(){
        if((!(personaje.isJuego1Terminado()))&&(controlJuego1 == 0)){
            controlJuego1 ++;
            JuegoDePreguntas juegoPreguntas = new JuegoDePreguntas();
        }
    }
    
    public void inicioJuego2(){
        if((!(personaje.isJuego2Terminado()))&&(controlJuego2 == 0)){
            controlJuego2 ++;
            Mini_Game ordenamiento = new Mini_Game();
            try {
                ordenamiento.inicio();
            } catch (IOException ex) {
                Logger.getLogger(SpriteAnimation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void inicioJuego3(){
        if((!(personaje.isJuego3Terminado()))&&(controlJuego3 == 0)){
            controlJuego3 ++;
            GAME memoria = new GAME();
            
        }
    }

    public void update() {
        if(!(personaje.frenteTrofeo(x, y))){
            if (x < 120) {
            x = 120;
        }
        if (x > 730) {
            x = 730;
        }
        if (y < 55) {
            y = 55;
        }
        if (y > 450) {
            y = 450;
        }
        if (movingUp && (personaje.posibleMovArr(x, y))&& saltoControles) {
            y -= speed;
            animate();
        }
        if (movingDown && (personaje.posibleMovAba(x, y))&& saltoControles) {
            y += speed;
            animate();
        }
        if (movingLeft && (personaje.posibleMovIzq(x, y))&& saltoControles) {
            x -= speed;
            animate();
        }
        if (movingRight && (personaje.posibleMovDer(x, y))&& saltoControles) {
            x += speed;
            animate();
        }
        repaint();
        }
    }

    private void animate() {
        spriteIndex++;
        if (spriteIndex >= 8) {
            spriteIndex = 0;
        }
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        if (enter) {
            enter = false;
        }
        if ((e.getKeyCode() == KeyEvent.VK_ENTER) && (enter)) {
            saltoControles = true;
            enter = false;
            contEnter ++;
        }
        if ((e.getKeyCode() == KeyEvent.VK_ENTER) && (!enter)) {
            saltoControles = true;
            enter = true;
            contEnter ++;
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            movingUp = true;
            contEnter = 0;

        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            movingDown = true;
            contEnter = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            movingLeft = true;
            contEnter = 0;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            movingRight = true;
            contEnter = 0;
        }
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            movingUp = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            movingDown = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            movingLeft = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            movingRight = false;
        }
    }

    public boolean isJuegoEjecutandose() {
        return juegoEjecutandose;
    }
    
}

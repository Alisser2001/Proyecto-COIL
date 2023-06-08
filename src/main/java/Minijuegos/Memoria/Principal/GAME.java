
package Minijuegos.Memoria.Principal;
/**
 *
 * @author Camilo G
 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Familia Giraldo
 */
public class GAME {
    
    JFrame ventana;
    JLabel fondoPresentacion;
    JLabel botonJugar;
    JLabel fondoGAME;
    JPanel panelPresentacion;
    JPanel panelGAME;
    JLabel matriz[][];
    int mat[][];  
    Random aleatorio;
    int matMax [][]; 
    String player;
    JLabel nombre;
    int contador;
    Timer tiempo; 
     int contadorSg;
    Timer tiempo1;
    int ban;
    int ban2;
    //borrar las cartas
    int numeroAntiguo;
    int posAntx;
    int posAnty;
    int numeroActual;
    int posActx;
    int posActy;
    
    
    
    public GAME (){
       //Ventana
        ventana = new JFrame ("Find the pairs");
        ventana.setSize(900,630);
        ventana.setLayout (null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
       //Panel
        panelPresentacion = new JPanel ();
        panelPresentacion.setSize(ventana.getWidth(),ventana.getHeight());
        panelPresentacion.setLocation(0, 0);
        panelPresentacion.setLayout (null);
        panelPresentacion.setVisible(true);
        
       
        
        //FondoPresentación 
      
        fondoPresentacion = new JLabel();
        fondoPresentacion.setSize(ventana.getWidth(),ventana.getHeight());
        fondoPresentacion.setLocation(0,0);
        fondoPresentacion.setIcon(new ImageIcon("src\\main\\java\\Minijuegos\\Memoria\\Imagenes\\principal.jpg"));
        fondoPresentacion.setVisible(true);
        panelPresentacion.add(fondoPresentacion,0);
        
        
        //Boton Jugar
        
        botonJugar = new JLabel();
        botonJugar.setSize(420,230);
        botonJugar.setLocation(240,320);
        botonJugar.setIcon(new ImageIcon("src\\main\\java\\Minijuegos\\Memoria\\Imagenes\\start.png"));
        botonJugar.setVisible(true);
        panelPresentacion.add(botonJugar,0);
        
        
        //JuegoPanel
        panelGAME = new JPanel ();
        panelGAME.setSize(ventana.getWidth(),ventana.getHeight());
        panelGAME.setLocation(0, 0);
        panelGAME.setLayout (null);
        panelGAME.setVisible(true);
        
       
        
        //FondoJuego
        fondoGAME = new JLabel();
        fondoGAME.setSize(ventana.getWidth(),ventana.getHeight());
        fondoGAME.setLocation(0,0);
        fondoGAME.setIcon(new ImageIcon("src\\main\\java\\Minijuegos\\Memoria\\Imagenes\\fondojuego.jpg"));
        fondoGAME.setVisible(true);
        panelGAME.add(fondoGAME,0);
        
        
        
    
        
        //matriz numerica
        mat = new int [4][5];
        matMax = new int [4][5];
        aleatorio = new Random();
        this.numerosAleatorios();
        
        
         
        
         //matriz grafica 
        matriz = new JLabel[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = new JLabel();
                matriz[i][j].setBounds(200+(j*100), 100+(i*114), 100, 114);
                
                matriz[i][j].setIcon(new ImageIcon("src\\main\\java\\Minijuegos\\Memoria\\Imagenes\\"+matMax[i][j]+".PNG.png"));
                matriz[i][j].setVisible(true);
                panelGAME.add(matriz[i][j],0);
                
            }
            
        }
        
         //TiempoEspera
         contadorSg = 0;
        tiempo = new Timer (1000, new ActionListener ()
        {   
            @Override
            public void actionPerformed(ActionEvent e)
            {
                    contadorSg++;
            
            }});
            tiempo.start();
            tiempo.stop();
            contadorSg = 0;
            ban = 0;
            ban2 = 0;
        
            
            
                
        
        //Voltear cartas
        contador = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j].addMouseListener(new MouseAdapter(){
                    @Override
                    public void mousePressed( MouseEvent e){
                        for (int k = 0; k < 4; k++) {
                            for (int l = 0; l < 5; l++) {
                                if(e.getSource() == matriz[k][l]){
                                    //System.out.println(k+" "+l);
                                    
                                    if( matMax[k][l]==0 && contador !=2){
                                    matMax[k][l] = mat[k][l];
                                    matriz[k][l].setIcon(new ImageIcon("src\\main\\java\\Minijuegos\\Memoria\\Imagenes\\"+matMax[k][l]+".PNG.png"));
                                    numeroActual = mat[k][l];
                                    posActx = k;
                                    posActy = l;
                                    contador++;   
                                    if (contador == 1) {
                                            numeroAntiguo = mat[k][l];
                                    posAntx = k;
                                    posAnty = l;
                                        }
                                    
                                                
                                  
                                    
                                    tiempo1 = new Timer (500, new ActionListener ()
                                        {   
                                            @Override
                                            public void actionPerformed(ActionEvent e)
                                            {
                                                   

                                           
                                    
                                    if( contador == 2 && ban2 == 0){
                                        tiempo.restart();
                                        ban2=1; 
                                    }
                                    
                                        {
                                        if( contador == 2 && contadorSg == 1){
                                            tiempo.stop();
                                            contadorSg = 0;
                                            if (matMax[posActx][posActy]==matMax[posAntx][posAnty]) {
                                                matMax[posActx][posActy] = -1;
                                                matMax[posAntx][posAnty] = -1;
                                                matriz[posActx][posActy].setIcon(new ImageIcon("src\\main\\java\\Minijuegos\\Memoria\\Imagenes\\"+matMax[posActx][posActy]+".PNG.png"));
                                                matriz[posAntx][posAnty].setIcon(new ImageIcon("src\\main\\java\\Minijuegos\\Memoria\\Imagenes\\"+matMax[posAntx][posAnty]+".PNG.png"));
                                                contador = 0;
                                                
                                                //Ganar
                                                int acumulador = 0;
                                                for (int m = 0; m < 4; m++) {
                                                    for (int n = 0; n < 5; n++) {
                                                        if (matMax[m][n]==-1) { 
                                                            acumulador++;
                                                        }
                                                        
                                                    } 
                                                    if (acumulador == 20) {
//                                                        JOptionPane.showMessageDialog(ventana, "CONGRATULATIONS");
                                                            ventana.dispose();
                                                    }
                                                }
                                            }
                                        for (int m = 0; m < 4; m++) {
                                            for (int n = 0; n < 5; n++) {
                                                if( matMax[m][n]!=0 && matMax[m][n]!=-1){
                                                    matMax [m][n]= 0;
                                                    matriz[m][n].setIcon(new ImageIcon("src\\main\\java\\Minijuegos\\Memoria\\Imagenes\\"+matMax[m][n]+".PNG.png"));
                                                    contador = 0;
                                                }
                                             }
                                           }
                                        tiempo1.stop();
                                        ban2 = 0;
                                        }
                                            
                                             }
                                }});
                                    if( ban == 0 ){
                                       tiempo1.start();
                                       ban    = 1;
                                    }
                                    if( contador == 2 ){
                                        tiempo1.restart();
                                    }
                                      
                               }
                            }
                            
                        }
                        
                     }
                        
                  }
                          
              });
                    
                
            }
            
        }
        
        
        
        //BotonJugar
        botonJugar.addMouseListener(new MouseAdapter (){
            @Override
                public void mousePressed(MouseEvent e) {
                //System.out.println("Press button");
                
                panelPresentacion.setVisible(false);
                ventana.add(panelGAME);
                panelGAME.setVisible(true);
                
            }});
        
        
        
        
        
                ventana.add(panelPresentacion);
                ventana.setVisible(true);
         
    }
    public void numerosAleatorios (){
        
            int acumulador =  0;
             for (int i = 0; i < 4; i++) 
                for (int  j = 0;  j < 5;  j++) {
                    mat[i][j] = 0;
                    matMax[i][j] = 0;
                    }
    
          
        for (int i = 0; i < 4; i++) {
            for (int  j = 0;  j < 5;  j++) {
               mat[i][j] = aleatorio.nextInt(10)+1;
               
               do{  
                   
                   acumulador = 0;
                    for (int k = 0; k < 4; k++) {
                       for (int l = 0; l < 5; l++) {
                           if(mat[i][j] == mat[k][l]){
                                acumulador +=1;

                                 }

                            }


                        }
                       if(acumulador == 3){ 
                           mat [i][j] = aleatorio.nextInt(10)+1;
                    }
                }while( acumulador == 3 );   
            
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int  j = 0;  j < 5;  j++) {
                System.out.print(mat [i][j]+"  ");
            }
            System.out.println("");
    }
 } }


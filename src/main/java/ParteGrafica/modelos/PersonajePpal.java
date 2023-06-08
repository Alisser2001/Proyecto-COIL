package ParteGrafica.modelos;

/**
 *
 * @author Brahiam
 */
public class PersonajePpal {
    private boolean juego1Terminado = false;
    private boolean juego2Terminado = false;
    private boolean juego3Terminado = false;
    
    public boolean terminado(){
        if(juego1Terminado && juego2Terminado && juego3Terminado){
            return true;
        }else{
            return false;
        }
    }
    
    
    public boolean frenteTrofeo(int x, int y){
        if((x == 420)&&(y==190)){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int posicionDialogo(int x, int y){
        if(((x>385)&&(x<440))&&((y>360)&&(y<419))||
          (((x>400)&&(x<461))&&((y>360)&&(y<419)))||
          (((x>400)&&(x<444))&&((y>361)&&(y<435)))||
          (((x>400)&&(x<444))&&((y>350)&&(y<419)))){
            return 1;
        }
        if((((x>120)&&(x<189))&&((y>55)&&(y<130)))||
           (((x>160)&&(x<200))&&((y>55)&&(y<130)))||
           (((x>136)&&(x<189))&&((y>55)&&(y<140)))||
           (((x>136)&&(x<189))&&((y>54)&&(y<129)))){
            return 2;
        }
        if((((x>645)&&(x<709))&&((y>55)&&(y<114)))||
           (((x>656)&&(x<716))&&((y>55)&&(y<114)))||
           (((x>656)&&(x<709))&&((y>55)&&(y<130)))||
           (((x>656)&&(x<709))&&((y>54)&&(y<114)))){
            return 3;
        }
        if(((x>400)&&(x<440)&&(y==310))&& (!terminado())){
            return 4;
        }
        else{
            return 0;
        }
    } 
    
    public boolean posibleMovDer(int x, int y){
        if(((x>385)&&(x<440))&&((y>360)&&(y<419))){
            return false;
        }
        if(((x>120)&&(x<189))&&((y>55)&&(y<130))){
            return false;
        }
        if(((x>645)&&(x<709))&&((y>55)&&(y<114))){
            return false;
        }
        if((((x>369)&&(x<469))&&((y>111)&&(y<309)))&&(!terminado())){
            return false;
        }
        if((((x>369)&&(x<469))&&((y>111)&&(y<309)))&&(terminado())){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean posibleMovIzq(int x, int y){
        if(((x>400)&&(x<461))&&((y>360)&&(y<419))){
            return false;
        }
        if(((x>160)&&(x<200))&&((y>55)&&(y<130))){
            return false;
        }
        if(((x>656)&&(x<716))&&((y>55)&&(y<114))){
            return false;
        }
        if((((x>371)&&(x<476))&&((y>116)&&(y<309)))&&(!terminado())){
            return false;
        }
        if((((x>371)&&(x<476))&&((y>116)&&(y<309)))&&(terminado())){
            return false;
        }
        else{
            return true;
        }
    }
    public boolean posibleMovArr(int x, int y){
        if(((x>400)&&(x<444))&&((y>361)&&(y<435))){
            return false;
        }
        if(((x>136)&&(x<189))&&((y>55)&&(y<140))){
            return false;
        }
        if(((x>656)&&(x<709))&&((y>55)&&(y<130))){
            return false;
        }
        if((((x>370)&&(x<470))&&((y>111)&&(y<311)))&&(!terminado())){
            return false;
        }
        if(((((x>370)&&(x<419))||((x<470)&&(x>421)))&&((y>111)&&(y<311)))&&(terminado())){
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean posibleMovAba(int x, int y){
        if(((x>400)&&(x<444))&&((y>350)&&(y<419))){
            return false;
        }
        if(((x>136)&&(x<189))&&((y>54)&&(y<129))){
            return false;
        }
        if(((x>656)&&(x<709))&&((y>54)&&(y<114))){
            return false;
        }
        if((((x>370)&&(x<470))&&((y>109)&&(y<309)))&&(!terminado())){
            return false;
        }
        if(((((x>370)&&(x<419))||((x<470)&&(x>421)))&&((y>111)&&(y<311)))&&(terminado())){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean isJuego1Terminado() {
        return juego1Terminado;
    }

    public void setJuego1Terminado(boolean juego1Terminado) {
        this.juego1Terminado = juego1Terminado;
    }

    public boolean isJuego2Terminado() {
        return juego2Terminado;
    }

    public void setJuego2Terminado(boolean juego2Terminado) {
        this.juego2Terminado = juego2Terminado;
    }

    public boolean isJuego3Terminado() {
        return juego3Terminado;
    }

    public void setJuego3Terminado(boolean juego3Terminado) {
        this.juego3Terminado = juego3Terminado;
    }
}

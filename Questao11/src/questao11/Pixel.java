
package questao11;


public class Pixel {
    private int x;
    private int y;
    private int R,G,B;

    public int getX() {
        return x;
    }

    
    public void setX(int x) {
        if(x>=0){
        this.x = x;}
    }

  
    public int getY() {
        return y;
    }

    
    public void setY(int y) {
        if(y>=0){
        this.y = y;}
        
    }

    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }

    public int getG() {
        return G;
    }

    public void setG(int G) {
        this.G = G;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }
}

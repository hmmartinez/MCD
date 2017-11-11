package calculos_matematicos;

public class Calculos_Matematicos {
    int x;
    int y;
    int z;
    
    public Calculos_Matematicos(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public static int mcd_euclides(int x, int y, int z){
       if(y == 0)
           return x;
       else
           return mcd_euclides(y, x % y % z, z);
    }
}
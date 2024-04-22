package PBO3;
public class game {
    public static void main(String[] args) 
    {
        player petani = new player();
        
        petani.name = "Petani Kode";
        petani.speed = 78;
        petani.healthPoint = 100;
        
        petani.run();
        
        if(petani.isDead()){
            System.out.println("Game Over");
        }
    }
    
}

public class Jogo{
    public static void main(String... arg) throws Exception{   
       Personagem Lindinha = new Personagem("Lindinha",5,5,5);
       Personagem p2 = new Personagem("Jonh", 10, 0 ,0);
       Personagem Florzinha = new Personagem("Florzinha",3,6,8);
       while (true){
        Lindinha.cacar();
        Lindinha.cacar();
        p2.cacar();
        Florzinha.cacar();
        Lindinha.comer();
        Lindinha.dormir();
        Florzinha.cacar();
        Florzinha.comer();
        p2.comer();
        Florzinha.dormir();
        p2.dormir();
        System.out.println("===================");
        Thread.sleep(6000);
        }
    }
}
  

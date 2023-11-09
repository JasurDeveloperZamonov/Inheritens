public class Main {
    public static void main(String[] args) {
    Lor lor=new Lor();
    lor.setFISH("Zamonov");
    lor.setLavozim("Raxbar");
    lor.setSohasi("Lor");
    lor.setYosh(45);
        System.out.println("FISH: "+lor.getFISH()+"\nLavozimi: "+lor.getLavozim()+"\nSohasi: "+lor.getSohasi()+"\nYoshi: "+lor.getYosh()+" ");
        System.out.println();

        Xirurg xirurg=new Xirurg();
        xirurg.setFISH("Alimov");
        xirurg.setLavozim("Yordamchi Vrach");
        xirurg.setSohasi("Xirurg");
        xirurg.setYosh(32);
        System.out.println("FISH: "+xirurg.getFISH()+"\nLavozimi: "+xirurg.getLavozim()+"\nSohasi: "+xirurg.getSohasi()+"\nYoshi: "+xirurg.getYosh()+" ");

    }
}
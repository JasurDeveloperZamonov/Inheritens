public class Main {
    public static void main(String[] args) {
    DoctorInfo();
    ComputerInfo();
    SoundsInfo();
    }

    public static void DoctorInfo(){
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

    public static void ComputerInfo(){
        PC pc=new PC();
        pc.setKategoriya("Computer");
        pc.setModelComputer("Asus");
        pc.setNarxComputer(7000000);

        Laptop laptop=new Laptop();
        laptop.setKategoriya("Computer");
        laptop.setModelComputer("Lenova");
        laptop.setNarxComputer(9800000);
        System.out.println();
        System.out.println("Kategoriyasi: "+pc.getKategoriya());
        System.out.println("Modeli: "+pc.getModelComputer());
        System.out.println("Narxi: "+pc.getNarxComputer());
        System.out.println();
        System.out.println("Kategoriyasi: "+laptop.getKategoriya());
        System.out.println("Modeli: "+laptop.getModelComputer());
        System.out.println("Narxi: "+laptop.getNarxComputer());
    }

    public static void SoundsInfo(){
        Subwoofer subwoofer=new Subwoofer();
        subwoofer.setKategoriya("Sounds");
        subwoofer.setModelSounds("Pioner");
        subwoofer.setNarxSounds(2500000);

        Loudspeaker loudspeaker=new Loudspeaker();
        loudspeaker.setKategoriya("Sounds");
        loudspeaker.setModelSounds("TeslaMagnitafon");
        loudspeaker.setNarxSounds(1180000);
        System.out.println();
        System.out.println("Kategoriyasi: "+subwoofer.getKategoriya());
        System.out.println("Modeli: "+subwoofer.getModelSounds());
        System.out.println("Narxi: "+subwoofer.getNarxSounds());
        System.out.println();
        System.out.println("Kategoriyasi: "+loudspeaker.getKategoriya());
        System.out.println("Modeli: "+loudspeaker.getModelSounds());
        System.out.println("Narxi: "+loudspeaker.getNarxSounds());
    }
}
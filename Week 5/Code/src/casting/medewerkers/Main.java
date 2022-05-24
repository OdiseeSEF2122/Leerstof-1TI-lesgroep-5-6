package casting.medewerkers;


public class Main {
    public void someMethod(){
        {
            int vari = 6;
//            vari = 666.0; //verkeerde type
            double vard = vari; //implicit conversion
            vari = (int)666.0;   //casting

        }

        {
            Stageair Aaron = new Stageair("Aaron", 0.0,"Odisee");
            Medewerker Aaron2 = Aaron;
            NietBetaaldeMedewerker Aaron3 = Aaron;
            Aaron.getSchool(); //getSchool is method van Stageair
//            Aaron2.getSchool(); // maar niet van medewerker

            Medewerker Bea = new Medewerker("Bea");
//            NietBetaaldeMedewerker Bea2 = Bea; //kan niet impliciet
        }
        {
            //Geen goed idee want
            Medewerker Bea = new Medewerker("Bea");
            NietBetaaldeMedewerker Bea2 = (NietBetaaldeMedewerker) Bea;
            Bea2.getKostenForfeit(); //dat weten we niet!

            //Prima want carlos is een Stageair
            Medewerker carlos = new Stageair("Carlos",0.0,"Odisee");
            Stageair carlos2 = (Stageair) carlos;
            carlos2.getSchool(); //weten we: Odisee
        }


    }
    public static void Quiz() {
        {
            //Gegeven de volgende statements (welke correct zijn), beslis voor lijnen of ze probleemloos uitgevoerd kunnen worden.
            double myDouble=12.3;
            double myDouble2=5.0;
            int myNbr=32;
//            myNbr=3.3;
  //          myNbr=myDouble;
            myNbr=(int)myDouble;
            myNbr=(int)myDouble2;
            myDouble2=myNbr;
            myDouble2=(double) myNbr;
            byte myNbr3=(byte) 32754;
            myDouble2=(byte)myNbr;
            System.out.println(myNbr3);
            System.out.println(myNbr);
        }
//        String nbrOfLittleBeast = "0.333";
//        Integer myNbr= Integer.parseInt(nbrOfLittleBeast);

        Bediende farid = new Bediende("Farid",6,2000);
        Arbeider gaston = new Arbeider("Gaston",7,17);
        BetaaldeMedewerker hamza = new BetaaldeMedewerker("Hamza",3);

//        Arbeider h1=hamza;
        BetaaldeMedewerker f=farid;
        //Arbeider h2=(Arbeider)hamza;
        farid.getJarenInDienst();
        ((BetaaldeMedewerker)gaston).getJarenInDienst();
//        ((Bediende)gaston).getMaandLoon();






    }


    public static void main(String[] args) {
        Medewerker carlos = new Stageair("Carlos",0.0,"Odisee");
        Medewerker carlos2 = (Medewerker) carlos;
        Medewerker dalia = new Medewerker("Dalia");
        System.out.println("Geheime identiteiten van Carlos: ");
        if (carlos instanceof Stageair) System.out.print("Stageair! ");
        if (carlos instanceof NietBetaaldeMedewerker) System.out.print("NietBetaaldeMedewerker! ");
        if (carlos instanceof Medewerker) System.out.println("Medewerker!");
        System.out.println("Geheime identiteiten van Carlos2: ");
        if (carlos2 instanceof Stageair) System.out.print("Stageair! ");
        if (carlos2 instanceof NietBetaaldeMedewerker) System.out.print("NietBetaaldeMedewerker! ");
        if (carlos2 instanceof Medewerker) System.out.println("Medewerker!");
        System.out.println("Geheime identiteiten van Dalia: ");
        if (dalia instanceof Stageair) System.out.print("Stageair! ");
        if (dalia instanceof NietBetaaldeMedewerker) System.out.print("NietBetaaldeMedewerker! ");
        if (dalia instanceof Medewerker) System.out.println("Medewerker!");


        Quiz();
    }

}
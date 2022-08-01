package com.company.facade;

public class ChaevieKeeper {
    private Chaevie richMan = new BigChaevie();
    private Chaevie ilyas = new MediumChaevie();
    private Chaevie altair = new MiniChaevie();

    public ChaevieKeeper(){

    }

    public void richManSale(){
        this.richMan.displaySeller();
        this.richMan.price();
    }

    public void ilyasSale(){
        this.ilyas.displaySeller();
        this.ilyas.price();
    }

    public void altairSale(){
        this.altair.displaySeller();
        this.altair.price();
    }
}

package at.campus02.Autofabrikant;

public abstract class Fabrik {

private double gewicht;

public Wagen getWagen(double gewicht){

    if(gewicht >= 3.5) {
        return new LKW();
    }
        else if(type.equals("LKW")){
            return new PKW();
    }
        else if(type.equals("Sportwagen")){
            return new Sportwagen();
    }
        else{
        System.out.println("Keine Fahrzeug kann erstellt werden!)");
        return null;
    }

}
}

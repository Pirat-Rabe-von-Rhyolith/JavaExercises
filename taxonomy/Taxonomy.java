
package taxonomy;

public class Taxonomy {

    public static void main(String[] args) {
        
        Felidae hauskatze=new Felidae();
        
        hauskatze.name="Felis catus";
        hauskatze.mehrzeller=true;
        hauskatze.heterotroph=true;
        hauskatze.milchdruesen=true;
        hauskatze.sekundkiefergelenk=true;
        hauskatze.hornigezungenpapillen=true;
        hauskatze.hypercarnivor=true;
        hauskatze.kralleneinziehbar=true;
        hauskatze.animalia();
        hauskatze.mammalia();
        hauskatze.felidae();
        
        Echinodermata diademseeigel=new Echinodermata();
        
        diademseeigel.name="Diadema setosum";
        diademseeigel.ambulakralsystem=true;
        diademseeigel.fünfstrahlsymmetrie=true;
        diademseeigel.kalkexoskelett=true;
        diademseeigel.echinodermat();
    }
    
}

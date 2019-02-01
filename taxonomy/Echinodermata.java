
package taxonomy;

public class Echinodermata extends Tiere{
    public boolean fünfstrahlsymmetrie;
    public boolean ambulakralsystem; 
    public boolean kalkexoskelett; 
    
    public void echinodermat(){
        if (fünfstrahlsymmetrie && ambulakralsystem && kalkexoskelett){
            System.out.println(name+" ist ein Stachelhäuter");
        }else{
            System.out.println(name+" ist kein Stachelhäuter");
        }
    }
    
}

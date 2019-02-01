
package taxonomy;


public class Canidae extends Mammalia{
    public boolean krallennichteinziehbar;
    public boolean quetschendemolaren;
    public boolean langschnauzig; 
    
    public void canidae(){
        if(krallennichteinziehbar && quetschendemolaren && langschnauzig){
            System.out.println(name+" gehört zur Hundefamilie (Canidae)");
        }else{
            System.out.println(name+" gehört nicht zur Hundefamilie (Canidae)");
        }
    }
    
}

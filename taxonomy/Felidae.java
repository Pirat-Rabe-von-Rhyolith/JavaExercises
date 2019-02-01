
package taxonomy;

public class Felidae extends Mammalia {
    public boolean kralleneinziehbar;
    public boolean hornigezungenpapillen;
    public boolean hypercarnivor; 
    
    public void felidae(){
        if (kralleneinziehbar && hornigezungenpapillen && hypercarnivor){
            System.out.println(name+" gehört zur Katzenfamilie (Felidae)");
        }else{
            System.out.println(name+" gehört nicht zur Katzenfamilie (Felidae)");
        }
    }
    
}

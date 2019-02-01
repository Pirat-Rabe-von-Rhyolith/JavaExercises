
package taxonomy;

public class Mammalia extends Tiere {
    public boolean milchdruesen;
    public boolean sekundkiefergelenk; 
    
    public void mammalia(){
        if(milchdruesen && sekundkiefergelenk){
            System.out.println(name+" ist ein Säugetier");
        }else{
            System.out.println(name+" ist kein Säugetier");
        }
    }
    
}

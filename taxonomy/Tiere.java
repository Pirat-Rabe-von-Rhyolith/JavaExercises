package taxonomy;

public class Tiere {

    public String name;
    public boolean mehrzeller;
    public boolean heterotroph;

    public void animalia() {
        if (mehrzeller && heterotroph) {
            System.out.println(name + " ist ein Tier");
        }else{
            System.out.println(name+" ist kein Tier");
        }
    }

}

package j27_Interface.Tasks.Task06;

public class AdanaKebap implements IFood{

    @Override
    public void taste() {
        System.out.println("Adanaya gidek mi kebabından yiyek mi? ");
    }

    @Override
    public double ucret() {
        return 19.90;
    }

    void grill() {
        System.out.println(" hafif ateşte pişiriliyor");
    }

    void marinade() {
        System.out.println("Et sirke  ve baharatla  marine edildi... ");
    }
}

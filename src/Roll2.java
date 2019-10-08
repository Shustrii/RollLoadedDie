/****
 * *
 * * Description: this program show you imitation game cube with chance of dropping facet 4-6 more than 1-3;
 */
public class Roll2 {
    public static void main(String[] args) {
        //10%=0.1=1 10%=0.2=2 10%=03=3 10%=0.4=4 20%=0.6=5 40%=6
        //1=10%
        //2=10%
        //3=10%
        //4=10%
        //5=20%
        //6=40%
        double rand= (Math.random());
        if (rand <= 0.1)
            System.out.println("Fell out 1");
        else if (rand <=0.2)
            System.out.println("Fell out 2");
        else if (rand <=0.3)
            System.out.println("Fell out 3");
        else if (rand <=0.4)
            System.out.println("Fell out 4");
        else if (rand <=0.6)
            System.out.println("Fell out 5");
        else
            System.out.println("Fell out 6");
    }
}

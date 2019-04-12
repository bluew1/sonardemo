
import org.apache.commons.lang3.tuple.ImmutablePair;

public class DemoImpl implements Demo
{

    @Override
    public ImmutablePair<String, String> getResult()
    {
        return ImmutablePair.of("Demo", "1.0");
    }
    
    public static void main(String args[])
    {
        System.out.println(new DemoImpl().getResult());
    }

}

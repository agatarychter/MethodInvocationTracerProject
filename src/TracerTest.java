import org.junit.Assert;
import org.junit.Test;

public class TracerTest {
    private Tracer tracer;
    @Test
    public void testZeroInvocations()
    {
        setEmptyTracer();
        int notCount = tracer.count("not");
        Assert.assertEquals(notCount,0);
    }

    @Test
    public void testOneInvocation()
    {
        setOneElement();
        int oneCount = tracer.count("one");
        Assert.assertEquals(oneCount,1);
    }

    @Test
    public void testTwoInvocations()
    {
        setTwoElements();
        int twoCount = tracer.count("two");
        Assert.assertEquals(twoCount,2);
    }

    private void setEmptyTracer()
    {
        tracer = new Tracer();
    }

    private void setOneElement()
    {
        tracer = new Tracer();
        tracer.add("one");
    }

    private void setTwoElements()
    {
        tracer = new Tracer();
        tracer.add("two");
        tracer.add("two");
    }

}

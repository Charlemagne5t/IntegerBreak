import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void integerBreakTest1(){
        int n = 10;
        int expected = 36;
        int actual = new Solution().integerBreak(n);

        Assert.assertEquals(expected, actual);
    }
}

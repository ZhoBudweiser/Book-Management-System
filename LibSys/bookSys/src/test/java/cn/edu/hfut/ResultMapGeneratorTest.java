package cn.edu.hfut;

import cn.edu.hfut.model.VBorrowBook;
import cn.edu.hfut.model.VBorrowClient;
import cn.edu.hfut.model.VReturn;
import cn.edu.hfut.util.ResultMapGenerator;
import org.junit.Test;

public class ResultMapGeneratorTest {
    @Test
    public void testResultMapGenerator() {
        String resultMap = ResultMapGenerator.generate(VReturn.class);
        System.out.println(resultMap);
    }
}

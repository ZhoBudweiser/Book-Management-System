package cn.edu.hfut;

import cn.edu.hfut.model.VBorrowBook;
import cn.edu.hfut.model.VBorrowClient;
import cn.edu.hfut.util.ResultMapGenerator;
import org.junit.Test;

public class ResultMapGeneratorTest {
    @Test
    public void testResultMapGenerator() {
        String resultMap = ResultMapGenerator.generate(VBorrowBook.class);
        System.out.println(resultMap);
    }
}

package cn.edu.hfut.mapper;

import cn.edu.hfut.model.Client;
import cn.edu.hfut.model.VBorrowBook;
import cn.edu.hfut.model.VBorrowClient;
import cn.edu.hfut.model.VReturn;

import java.util.List;

public interface ViewMapper {
    VBorrowClient selectByClientPhone(String clientPhone);

    VBorrowBook selectByBookIsbn(String bookIsbn);
    
    List<VReturn> selectBooksByClientPhone(String clientPhone);
}

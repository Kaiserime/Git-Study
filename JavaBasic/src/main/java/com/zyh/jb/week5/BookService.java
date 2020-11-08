package com.zyh.jb.week5;

public interface BookService {
    /**
     * 图书是否上架
     * @param book
     * @return
     * @throws MyException
     */
    boolean BookOnShelf(Book book) throws MyException;

}

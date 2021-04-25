package com.mertdeveci.watcher.util;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;


/*
    Bu sayfa pagination için kullanılacak
    Kaç kayıt gösterilimek isteniyorsa o kadar kayıt veritabanından getirilmesi gerekiyor.
 */

public class TPage<T> {
    private int number; // Kaçıncı sayfa görünüyor.
    private int size;   // Kayıtları kaçarlı görmek isityor
    private Sort sort;  // Herhangi bir kolona tıklayıp sıralama yapılacak mı
    private int totalPage;  // Toplam kaç sayfa oluştu
    private Long totalElements; // Toplamda kaç kayıt
    private List<T> content;    // Döndürelecek olan data

    public void setStat(Page page, List<T> list){
        this.number = page.getNumber();
        this.size = page.getSize();
        this.sort = page.getSort();
        this.totalPage = page.getTotalPages();
        this.totalElements = page.getTotalElements();
        this.content = list;
    }


}

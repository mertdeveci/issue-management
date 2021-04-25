package com.mertdeveci.watcher.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
/*
    > Tüm class'ların sahip olmasını istediğim, özellikleri bu class'a yazdım.
    @Data : içerisindeki alanların getter ve setter'ların otomatik ayalar
    @MappedSuperclass: Entityler bir superclass’tan inherit olabilir.
            Bu superclass “@Entity” notasyonu ile tanımlanmaz ve Java Persistence Provider tarafından
            entity olarak belirlenmez. Bu class alanlarının her tabloda bulunmasını istediğimizden
            @Entity olarak taımlamadık. Genel bir şablon oluşturuyoruz.
     *** Dikkat: Tablo kolonlarında String aanlar için lenght vermek tercih edilir!
     *** Tarih alanlarının nasıl tipte veri tutacağı belirtilebilir
 */

@Data
@MappedSuperclass
public abstract class BaseEntity implements Serializable {
    // Serializable ile veri taşınması kolaylaştırılır

    @Column(name = "created_add")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "created_by",length = 50)
    private String createdBy;

    @Column(name ="update_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateAt;

    @Column(name = "update_by", length = 50)
    private String updateBy;

    @Column(name = "status")
    private Boolean status;
}

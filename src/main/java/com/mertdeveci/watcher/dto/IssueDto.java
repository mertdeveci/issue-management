package com.mertdeveci.watcher.dto;

import com.mertdeveci.watcher.entity.IssueStatus;
import com.mertdeveci.watcher.entity.Project;
import lombok.Data;
import org.apache.catalina.User;
/*
    ModelMapper ->  MAVEN ile indirlebilirsin

     MODELMAPPER yalnızca ilgili kısımların istemciye gönderilmesini sağlayan ve
     istemcinin direkt olarak service içeriğine ulaşılmasını engelleyen
     represent nesneleridir. Bu nesneler isimlerinin aynı olması sayesinde
     eşleştirilerek işlem yapılır.


     Issue Class'ındaki özellikler ile aynı olmalıdır !

     Örneğin assignee giderse password'üü de göndericeğiz.
     NOT: BU YÖNTEM YERİNE ENTITY CLASS'TA İLGİLİ ÖZELLİĞİN ÜZERİNE
     @JsonIgnore yazabilirdik.



     Mantık şu, Servis katmanından iç tarafa doğru olan kısımda(veritabanı işlemleri vs)
     Entity sınıfları kullan, Servis katmanından dışarı doğru olan kısımlarda (API  vb)
     DBO'ları kullan

     */

import java.util.Date;

/*
    Bunlar bizim rest isteklerine döndüreceğimiz alanlar olacak
 */

@Data
public class IssueDto {
    private Long id;
    private String description;
    private String details;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto assignee;
    private ProjectDto project;
}

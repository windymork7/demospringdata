package me.whiteship.demospringdata;


import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity // 자동으로 테이블로 매핑
public class Account {

    @Id // Primary key
    @GeneratedValue // sequence
    private Long Id;

    @Column(nullable = false, unique = true)
    private String username;

    private String password;

    @OneToMany  // 1대 다 관계
    private Set<Study> studies = new HashSet<>();










    public Set<Study> getStudies() {
        return studies;
    }

    public void setStudies(Set<Study> studies) {
        this.studies = studies;
    }

    //    @Temporal(TemporalType.TIMESTAMP)
//    private Date created = new Date();
//
//    private String yes;
//
//    @Transient  // 컬럼으로 맵핑 안함
//    private String no;
//
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "street", column = @Column(name = "home_street"))
//    })
//    private Address address;
//
//    @Embedded
//    private Address officeAddress;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

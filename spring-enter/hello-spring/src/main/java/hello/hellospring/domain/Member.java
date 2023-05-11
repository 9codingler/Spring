package hello.hellospring.domain;

import jakarta.persistence.*;

@Entity
public class Member {

    // db가 알아서 id 생성 : strategy = ~.IDENTITY
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

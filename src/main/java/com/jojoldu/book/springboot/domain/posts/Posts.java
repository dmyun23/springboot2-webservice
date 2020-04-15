package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import com.sun.javafx.beans.IDProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// Setter가 없는 상황에서 어떻게 값을 채워 DB에 삽입해야할까
// 생성자를 통해 최종값을 채운 후 DB 삽입
// 값 변경이 필요한 경우 해당 이벤트에 맞는 public 메소도를 호출하여 변경하는 것을 전제로 한다.
// 이 책에서는 생성자 대신에 @Builder를 통해 제공되는 빌더 클래스를 사용한다.
@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}

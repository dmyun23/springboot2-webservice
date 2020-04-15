package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// Mybatis에서는 Dao라고 불리는 Dao Layer접근자이다.
// JPA에선 Repository 라고 부르며 인터페이스로 생성합니다.
// Entity 클래스와 기본 Entity Repository는 함께 위치해야 합니다.
public interface PostsRepository extends JpaRepository<Posts, Long> {

}

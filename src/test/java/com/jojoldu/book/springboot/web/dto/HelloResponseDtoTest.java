package com.jojoldu.book.springboot.web.dto;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class HelloResponseDtoTest {

    @Test
    public void lombokTs() {

        //given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        System.out.println("111111");
        // then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}

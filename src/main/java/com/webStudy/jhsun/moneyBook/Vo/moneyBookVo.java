package com.webStudy.jhsun.moneyBook.Vo;

import lombok.*;

@Getter // 클래스의 모든 필드에 대한 Getter 메소드를 자동으로 생성합니다.
@Setter // 클래스의 모든 필드에 대한 Setter 메소드를 자동으로 생성합니다.
@ToString // 객체의 상태를 문자열로 표현하는 toString() 메소드를 자동으로 생성합니다.
@NoArgsConstructor // 파라미터가 없는 기본 생성자를 자동으로 생성합니다.
@AllArgsConstructor // 모든 필드를 인자로 받는 생성자를 자동으로 생성합니다.
public class moneyBookVo {
    private String id;
}

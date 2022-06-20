package hello.springmvc1.basic;

import lombok.Data;

@Data     // @Getter, @Setter, @toString, @EqualsAndHashCode, @RequiredArgsContructor 를 다 자동으로 만들어준다
public class HelloData {
    private String username;
    private int age;
}

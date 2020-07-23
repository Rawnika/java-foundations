package core.hw_2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Alien {
    private final String planet;
    private String colour;
    private final int eyesNumber;
}

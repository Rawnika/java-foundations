package core.hw2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Telephone {
    private final String brand;
    private int memoryAmmount;
    private double price;
}

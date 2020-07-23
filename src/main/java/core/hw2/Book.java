package core.hw2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter

public class Book {
    private final String name;
    private int pagesNumber;
    private final String author;
}

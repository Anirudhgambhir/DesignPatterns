package Patterns.CreationalPatterns.BuilderPattern;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class BuilderLombok {
    private String name;
    private long id;
    private long salary;
    private String company;

}

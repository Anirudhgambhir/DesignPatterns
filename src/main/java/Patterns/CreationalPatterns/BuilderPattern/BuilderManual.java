package Patterns.CreationalPatterns.BuilderPattern;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class BuilderManual {
    private String name;
    private long id;
    private long salary;
    private String company;

    public static Builder builder() {
        return new Builder();
    }


    public static class Builder {
        private String name;
        private long id;
        private long salary;
        private String company;

        Builder() {
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withSalary(long salary) {
            this.salary = salary;
            return this;
        }

        public Builder withCompany(String company) {
            this.company = company;
            return this;
        }

        public BuilderManual build() {
            return new BuilderManual(name, id, salary, company);
        }

    }

}

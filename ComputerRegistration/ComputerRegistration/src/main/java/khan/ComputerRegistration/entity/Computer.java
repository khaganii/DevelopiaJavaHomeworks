package khan.ComputerRegistration.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Computer {
    int id;
    String name;
    String sort;
    int ram;
    int memory;
    String ramType;

}

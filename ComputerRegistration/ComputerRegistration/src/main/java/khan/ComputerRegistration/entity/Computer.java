package khan.ComputerRegistration.entity;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Computer {
    int id;
    String name;
    String sort;
    int ram;
    int memory;
}

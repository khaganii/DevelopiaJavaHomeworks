package khan.ComputerRegistration.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class ComputerDto {
    String name;
    String sort;
    int ram;
    int memory;
    String ramType;
}

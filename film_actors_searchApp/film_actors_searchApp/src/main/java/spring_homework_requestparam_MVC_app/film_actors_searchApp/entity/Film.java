package spring_homework_requestparam_MVC_app.film_actors_searchApp.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Film {
    int actorId;
    String actorName;
    String actorSurname;
    int filmId;
    String filmName;
    String filmLanguage;
    int filmYear;
    int filmLength;
    String filmSpecialFeatures;
}

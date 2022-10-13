package spring_homework_requestparam_MVC_app.film_actors_searchApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring_homework_requestparam_MVC_app.film_actors_searchApp.db_connection.ConnectToDb;
import spring_homework_requestparam_MVC_app.film_actors_searchApp.entity.Film;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/films")
public class FilmController {
    @GetMapping
    public String showHome(Model model) throws SQLException {
        Connection con = ConnectToDb.getConnection();
        PreparedStatement ps = con.prepareStatement("select a.actor_id as a_id, a.first_name as a_name, a.last_name as a_surname,  " +
                "f.film_id as f_id, f.title as f_name, f.release_year as f_year, f.length as f_length, " +
                "f.special_features as f_features, l.name as l_name from film_actor " +
                "Left join sakila.actor as a on film_actor.actor_id = a.actor_id " +
                "Left join sakila.film as f on film_actor.film_id = f.film_id " +
                "Left join sakila.language as l on f.language_id = l.language_id limit 200;");
        ResultSet rs = ps.executeQuery();
        List<Film> filmList = new ArrayList<>();
        while (rs.next()){
           Film film = new Film();
           film.setActorId(rs.getInt(1));
           film.setActorName(rs.getString(2));
           film.setActorSurname(rs.getString(3));
           film.setFilmId(rs.getInt(4));
           film.setFilmName(rs.getString(5));
           film.setFilmYear(rs.getInt(6));
           film.setFilmLength(rs.getInt(7));
           film.setFilmSpecialFeatures(rs.getString(8));
           film.setFilmLanguage(rs.getString(9));
           filmList.add(film);
        }
        model.addAttribute("filmList", filmList);
        return "films";
    }

    @PostMapping("/filter")
    public String showById(@RequestParam("actor_id") Integer actorId, Model model) throws SQLException {
        Connection con = ConnectToDb.getConnection();
        PreparedStatement ps = con.prepareStatement("select a.actor_id as a_id, a.first_name as a_name, a.last_name as a_surname,  " +
                "f.film_id as f_id, f.title as f_name, f.release_year as f_year, f.length as f_length, " +
                "f.special_features as f_features, l.name as l_name from film_actor " +
                "Left join sakila.actor as a on film_actor.actor_id = a.actor_id " +
                "Left join sakila.film as f on film_actor.film_id = f.film_id " +
                "Left join sakila.language as l on f.language_id = l.language_id " +
                "where a.actor_id = ? limit 50;");
        ps.setInt(1, actorId);
        ResultSet rs = ps.executeQuery();
        List<Film> filmList = new ArrayList<>();
        while (rs.next()){
            Film film = new Film();
            film.setActorId(rs.getInt(1));
            film.setActorName(rs.getString(2));
            film.setActorSurname(rs.getString(3));
            film.setFilmId(rs.getInt(4));
            film.setFilmName(rs.getString(5));
            film.setFilmYear(rs.getInt(6));
            film.setFilmLength(rs.getInt(7));
            film.setFilmSpecialFeatures(rs.getString(8));
            film.setFilmLanguage(rs.getString(9));
            filmList.add(film);
        }
        model.addAttribute("filmList", filmList);
        return "films";
    }
}

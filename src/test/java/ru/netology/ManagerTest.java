package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {


    @Test
    public void FindAllFilm() {
        Manager manager = new Manager();

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");

        String[] actual = manager.findAll();
        String[] expected = {"film1","film2", "film3", "film4", "film5", "film6", "film7", "film8", "film9", "film10", "film11",};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastFilm() {
        Manager manager = new Manager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");

        String[] actual = manager.findLast();
        String[] expected = {"film12", "film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3"};
        Assertions.assertArrayEquals(expected, actual);

    }



    @Test
    public void LastAddMovies() {
        Manager manager = new Manager();

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");
        manager.addFilm("film6");
        manager.addFilm("film7");
        manager.addFilm("film8");
        manager.addFilm("film9");
        manager.addFilm("film10");
        manager.addFilm("film11");
        manager.addFilm("film12");

        String[] actual = manager.findLast();
        String[] expected = {"film12", "film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4", "film3"};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void LastAddMoviesLessLimit() {
        Manager manager = new Manager(6);

        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");


        String[] actual = manager.findLast();
        String[] expected = {"film5", "film4", "film3", "film2", "film1"};

        Assertions.assertArrayEquals(expected, actual);

    }

}

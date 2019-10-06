package com.dicoding.picodiploma.mybottomnavigation.model;

import java.util.ArrayList;

public class MovieData {

    public static String[][] data = new String[][]{

            {"Avengers: Infinity War","As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg"},
            {"Black Panther","King T Challa returns home from America to the reclusive, technologically advanced African nation of Wakanda to serve as his country new leader. However, T Challa soon finds that he is challenged for the throne by factions within his own country as well as without. Using powers reserved to Wakandan kings, T Challa assumes the Black Panther mantel to join with girlfriend Nakia, the queen-mother, his princess-kid sister, members of the Dora Milaje (the Wakandan special forces) and an American secret agent, to prevent Wakanda from being dragged into a world war.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/uxzzxijgPIY7slzFvMotPv8wjKA.jpg"},
            {"Venom","Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/2uNW4WbgBXL25BAbXGLnLqX71Sw.jpg"},
            {"Deadpool 2","Wisecracking mercenary Deadpool battles the evil and powerful Cable and other bad guys to save a boy's life.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/to0spRl1CMDvyUbOnbb4fTk3VAd.jpg"},
            {"Ant-Man and the Wasp","Just when his time under house arrest is about to end, Scott Lang once again puts his freedom at risk to help Hope van Dyne and Dr. Hank Pym dive into the quantum realm and try to accomplish, against time and any chance of success, a very dangerous rescue mission.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/eivQmS3wqzqnQWILHLc4FsEfcXP.jpg"},
            {"Tomb Raider","Lara Croft, the fiercely independent daughter of a missing adventurer, must push herself beyond her limits when she finds herself on the island where her father disappeared.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/3zrC5tUiR35rTz9stuIxnU1nUS5.jpg"},
            {"Pacific Rim: Uprising","It has been ten years since The Battle of the Breach and the oceans are still, but restless. Vindicated by the victory at the Breach, the Jaeger program has evolved into the most powerful global defense force in human history. The PPDC now calls upon the best and brightest to rise up and become the next generation of heroes when the Kaiju threat returns.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/v5HlmJK9bdeHxN2QhaFP1ivjX3U.jpg"},
            {"Skyscraper","Framed and on the run, a former FBI agent must save his family from a blazing fire in the world's tallest building.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/5LYSsOPzuP13201qSzMjNxi8FxN.jpg"},
            {"Creed II","Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/v3QyboWRoA4O9RbcsqH8tJMe8EB.jpg"},
            {"Mile 22","An elite group of American operatives, aided by a top-secret tactical command team, must transport an asset who holds life-threatening information to an extraction point 22 miles away through the hostile streets of an Asian city.","https://image.tmdb.org/t/p/w600_and_h900_bestv2/2L8ehd95eSW9x7KINYtZmRkAlrZ.jpg"},
    };

    public static ArrayList<Movie> getListData(){
        ArrayList<Movie> list = new ArrayList<>();
        for (String[] aData : data){
            Movie movie = new Movie();
            movie.setNama(aData[0]);
            movie.setDeskripsi(aData[1]);
            movie.setGambar(aData[2]);

            list.add(movie);
        }
        return list;
    }

}

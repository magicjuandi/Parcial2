package com.Parcial.Videogames;

public enum VideoGames {
    SPORTS("Fifa","Description: Pass the ball between your teammates and score goals", "2020"){
        @Override
        public String ranking(){
            return "And its at 87 position at the top";
        }
        @Override
        public String money(){
            return "The game is costing 200.000";
        }
    },
    STRATEGY("ChessOnline","Description: The normal table game, but now online","2017"){
        @Override
        public String ranking(){
            return "And its at 657 position at the top";
        }
        @Override
        public String money(){
            return "The game is free";
        }
    },
    MUSIC("Got the note","Description: Your favorite songs where you need to sing and get the exact note","2022"){
        @Override
        public String ranking(){
            return "And its at 38 position at the top";
        }
        @Override
        public String money(){
            return "The game is costing 10.000";
        }
    },
    ADVENTURE("Mario Galaxy 3","Description: Your favorite character in a new adventure among stars","2021"){
        @Override
        public String ranking(){
            return "And its at 3 position at the top";
        }
        @Override
        public String money(){
            return "The game is costing 80.000";
        }
    },
    SIMULATION("Fish simm","Description: Just swim in an open sea","2012"){
        @Override
        public String ranking(){
            return "And its at 999 position at the top";
        }
        @Override
        public String money(){
            return "The game is free";
        }
    };
    private final String Name;
    private final String Manual;
    private final String Year;
    private VideoGames(String name, String manual, String year) {
        Name = name;
        Manual = manual;
        Year = year;
    }
    public String getName() {
        return Name;
    }
    public String getManual() {
        return Manual;
    }
    public String getYear() {
        return Year;
    }
    public abstract String ranking();
    public abstract String money();
}
class Main{
    public static void main(String[] args) {
        VideoGames sports = VideoGames.SPORTS;
        System.out.println(sports.getName());
        System.out.println(sports.getManual());
        System.out.println(sports.money());
        System.out.println(sports.ranking());
        System.out.println("");

        VideoGames strat = VideoGames.STRATEGY;
        System.out.println(strat.getName());
        System.out.println(strat.getManual());
        System.out.println(strat.money());
        System.out.println(strat.ranking());
        System.out.println("");

        VideoGames music = VideoGames.MUSIC;
        System.out.println(music.getName());
        System.out.println(music.getManual());
        System.out.println(music.money());
        System.out.println(music.ranking());
        System.out.println("");

        VideoGames adven = VideoGames.ADVENTURE;
        System.out.println(adven.getName());
        System.out.println(adven.getManual());
        System.out.println(adven.money());
        System.out.println(adven.ranking());
        System.out.println("");
        
        VideoGames sym = VideoGames.SIMULATION;
        System.out.println(sym.getName());
        System.out.println(sym.getManual());
        System.out.println(sym.money());
        System.out.println(sym.ranking());
        System.out.println("");
    }
}

package com.training;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "no plots here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eats lots of people: jaws class override plot method";
    }
}

class independenceDay extends Movie{
    public independenceDay(){
        super("independence day");
    }
    @Override
    public String plot(){
        return "class independenceDay override plot method";
    }
}

class mazerRunner extends Movie{
    public mazerRunner() {
        super("mazer runner");
    }

    @Override
    public String plot(){
        return " mazer runner override plot method";
    }
}

class starWars extends Movie{
    public starWars(){
        super("starwars");
    }
    @Override
    public String plot(){
        return "starwars override plot";
    }
}

class Forgetable extends Movie{
    public Forgetable(){
        super("forgetable");
    }
    // no plot method
}







public class Main {

    public static void main(String[] args) {

        for(int i=1;i<11;i++){
            Movie movie = randomMovie();
            System.out.println("movie# :" + i +
                   ":"+ movie.getName()+"\n"+
                    "plot :" + movie.plot() +"\n");
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random() *5)+1;
        System.out.println("random number generated was : " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2 :
                return new independenceDay();
            case 3 :
                return new mazerRunner();
            case 4 :
                return new starWars();
            case 5 :
                return new Forgetable();

        }
        return null;
    }
}
















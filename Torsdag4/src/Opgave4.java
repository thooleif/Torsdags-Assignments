void main(){

    Team team1 = new Team("The Bacon Emirates");
    Team team2 = new Team("The Three Musketeers");

    team1.addPlayer(new Player("Thor", 85));
    team1.addPlayer(new Player("Jarl", 90));
    team1.addPlayer(new Player("Rune", 74));
    team1.addPlayer(new Player("Mads", 69));

    System.out.println();

    team2.addPlayer(new Player("Bubber", 65));
    team2.addPlayer(new Player("John", 80));
    team2.addPlayer(new Player("Kasper", 70));

    System.out.println();

    team1.printTeam();
    team2.printTeam();

    team1.compete(team2);
}

class Player{
    String name;
    int skillLevel;

    Player(String name, int skillLevel){
        this.name = name;
        this.skillLevel = skillLevel;

    }

    public String toString(){
        return name + " - Skill: " + skillLevel;
    }
}

class Team{
    String teamName;
    ArrayList<Player> players;

    Team(String teamName){
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    void addPlayer(Player p){
        players.add(p);
        System.out.println("Player: " + p.name + " has been added to: " + teamName);

    }

    double getAverageSkill(){
        if(players.size() == 0){
            return 0;
        }

        int totalSkill = 0;
        for(Player p : players){
            totalSkill = totalSkill + p.skillLevel;
        }
        return (double)totalSkill / players.size();
    }

    void printTeam(){
        System.out.println("--- " + teamName + " player list ---");
        for(Player p : players){
            System.out.println("Name: " + p);
        }
        System.out.println("Average skill level of " + teamName + " players: " + getAverageSkill());
        System.out.println();
    }

    void compete(Team opponent){
        System.out.println("--- " + teamName + " VS " + opponent.teamName + " ---");
        double mySkill = getAverageSkill();
        double opponentSkill = opponent.getAverageSkill();

        System.out.println(teamName + " skill: " + mySkill);
        System.out.println(opponent.teamName + " skill: " + opponentSkill);

        if(mySkill > opponentSkill){
            System.out.println("Winner: " + teamName + "!");
        }else if(opponentSkill > mySkill){
            System.out.println("Winner: " + opponent.teamName + "!");
        }else{
            System.out.println("Draw!");
        }
    }

}
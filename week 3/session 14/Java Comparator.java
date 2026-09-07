class Checker implements Comparator<Player> {

    @Override
    public int compare(Player a, Player b) {

        if (a.score != b.score) {
            return b.score - a.score;
        }

        return a.name.compareTo(b.name);
    }
}

Input
5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150
Output
aleksa 150
amy 100
david 100
aakansha 75
heraldo 50

package com.company;

interface Analyzable {
    double getAverage();

    GradedActivity getHighest();

    GradedActivity getLowest();
}

class CourseGrades implements Analyzable {
    GradedActivity stopnieAktywnosci[];

    public CourseGrades(GradedActivity[] stopnieAktywnosci) {
        this.stopnieAktywnosci = stopnieAktywnosci;
    }

    public void setStopnieAktywnosci(GradedActivity[] stopnieAktywnosci) {
        this.stopnieAktywnosci = stopnieAktywnosci;
    }

    public GradedActivity[] getStopnieAktywnosci() {
        return stopnieAktywnosci;
    }

    @Override
    public double getAverage() {
        double wynik = 0;
        for (int i = 0; i < stopnieAktywnosci.length; i++) {
            wynik += stopnieAktywnosci[i].getScore();
        }
        return wynik / stopnieAktywnosci.length;
    }

    @Override
    public GradedActivity getHighest() {
        GradedActivity temp = stopnieAktywnosci[0];
        for (int i = 1; i < stopnieAktywnosci.length; i++) {
            if (stopnieAktywnosci[i].getScore() > temp.getScore()) {
                temp = stopnieAktywnosci[i];
            }
        }
        return temp;
    }



    @Override
    public GradedActivity getLowest() {
        GradedActivity temp = stopnieAktywnosci[0];
        for (int i = 1; i < stopnieAktywnosci.length; i++) {

            if (stopnieAktywnosci[i].getScore() < temp.getScore()) {
                temp = stopnieAktywnosci[i];
            }
        }
        return temp;
    }
}

class GradedActivity {
    private double score; // Wynik punktowy.

    public GradedActivity(int score) {
        this.score = score;
    }

    public void setScore(double s) {
        score = s;
    }

    public double getScore() {
        return score;
    }

    public char getGrade() {
        char letterGrade;
        if (score >= 90)
            letterGrade = '5';
        else if (score >= 80)
            letterGrade = '4';
        else if (score >= 70)
            letterGrade = '3';
        else if (score >= 60)
            letterGrade = '2';
        else
            letterGrade = '1';
        return letterGrade;
    }
}

class Main {
    public static void main(String[] argv) {
        GradedActivity jedynka = new GradedActivity(1);
        GradedActivity dwojka = new GradedActivity(2);
        GradedActivity trojka = new GradedActivity(3);
        GradedActivity czworka = new GradedActivity(4);
        GradedActivity piatka = new GradedActivity(5);
        GradedActivity szostka = new GradedActivity(6);

        GradedActivity ocenySzkolne[] = {jedynka, dwojka, trojka, czworka, piatka, szostka};
        CourseGrades Jan = new CourseGrades(ocenySzkolne);
        System.out.println(Jan.getLowest());
        System.out.println(Jan.getHighest());
        System.out.println(Jan.getAverage());

    }
}


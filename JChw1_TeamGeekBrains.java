/**
 * Java Core. HomeWork 1
 *
 * @author Mark
 * @version 30.11.2021
 */
public class JChw1_TeamGeekBrains {
    public static void main(String[] args) {
        System.out.println("JC_Home work #1");
        System.out.println();
        
        Course course = new Course(2000, 5, 500);
        Team[] teams = {
            new Team("Grisha", 1999, 5, 499, false),
            new Team("Max", 2001, 6, 501, false),
            new Team("Alex", 2000, 4, 500, false),
            new Team("Vasya", 3000, 10, 600, false),
        };
        course.info();
        System.out.println();
        for (Team team : teams) {
            team.setTeamName("GeekBrains");
            System.out.println("Team " + team.getTeamName() + ", members results: ");
            break;
        }
        for (Team team : teams) {
            System.out.println(team);
        }
        System.out.println();
        for (Team team : teams) {
            team.distancePassed(course);
            team.info();
        }
    }
}

class Team {
    private static String tName;
    private String name;
    private int runLimit;
    private int jumpLimit;
    private int swimLimit;
    boolean successfully;

    public Team(String name, int runLimit, int jumpLimit,int swimLimit, boolean successfully) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;
        successfully = successfully;
    }

    public void setTeamName(String tName) {
        this.tName = tName;
    }

    public String getTeamName() {
        return tName;
    }

    public void info() {
        if (successfully == true) {
            System.out.println(name + " finish the distance!");
        }
    }

    public void distancePassed(Course c) {
        if (successfully != true) {
            successfully = c.distance(runLimit, jumpLimit, swimLimit);
        }
    }

    @Override
    public String toString() {
        return name + " run: " + runLimit + ", jump: " + jumpLimit + ", swim: " + swimLimit;
    }
}

class Course {
    private int runDistance;
    private int jumpDistance;
    private int swimDistanse;

    public Course(int runDistance, int jumpDistance, int swimDistanse) {
        this.runDistance = runDistance;
        this.jumpDistance = jumpDistance;
        this.swimDistanse = swimDistanse;
    }

    public boolean distance(int r, int j, int s) {
        if(r < runDistance || j < jumpDistance || s < swimDistanse) {
            return false;
        }
        return true;
    }

    public void info() {
        System.out.println("Standarts:");
        System.out.println("Run: " + runDistance + ", jump: " + jumpDistance + ", swim: " + swimDistanse);
    }
}
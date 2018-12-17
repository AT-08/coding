package org.fundacionjala.coding.rodrigo.rockrobots;

public class Robot {
    private String name;
    private int health;
    private int speed;
    private String[] tactics;

    public Robot(String name, int health, int speed, String[] tactics) {
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.tactics = tactics;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public String[] getTactics() {
        return tactics;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setTactics(String[] tactics) {
        this.tactics = tactics;
    }
}

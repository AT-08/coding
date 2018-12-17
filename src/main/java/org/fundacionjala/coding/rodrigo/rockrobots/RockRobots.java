package org.fundacionjala.coding.rodrigo.rockrobots;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RockRobots {

    public static String fight(Robot robot1, Robot robot2, Map<String, Integer> tactics) {
        tacticFight(robot1, tactics);
        tacticFight(robot2, tactics);
        System.out.println(robot1.getHealth());
        System.out.println(robot2.getHealth());
        return "ANY";
    }

    private static void tacticFight(Robot robot, Map<String, Integer> tactics) {
        HashMap<String, IFight> fight = new HashMap<>();
        fight.put("punch", () -> robot.setHealth(robot.getHealth() - tactics.get("punch")));
        fight.put("laser", () -> robot.setHealth(robot.getHealth() - tactics.get("laser")));
        fight.put("missile", () -> robot.setHealth(robot.getHealth() - tactics.get("missile")));
        for (String tacticKey : robot.getTactics()) {
            fight.get(tacticKey).run();
        }
    }


}


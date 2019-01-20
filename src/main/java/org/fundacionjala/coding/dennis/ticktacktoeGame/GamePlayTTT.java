package org.fundacionjala.coding.dennis.ticktacktoeGame;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Game of Tick-Tack-Toe.
 */
public class GamePlayTTT {

    private Scanner scanner;
    private String position;
    private ToePlayer player1;
    private ToePlayer player2;
    private TickTackToe gameBoard;

    private static final Map<String, String> BLOCK;
    static {
        Map<String, String> blocks = new HashMap<>();
        blocks.put("up left", "0-0");
        blocks.put("up", "0-1");
        blocks.put("up right", "0-2");
        blocks.put("center left", "1-0");
        blocks.put("center", "1-1");
        blocks.put("center right", "1-2");
        blocks.put("down left", "2-0");
        blocks.put("down", "2-1");
        blocks.put("down right", "2-2");
        BLOCK = Collections.unmodifiableMap(blocks);
    }



    /**
     * Constructor.
     * https://stackoverflow.com/questions/29943128/reliance-on-default-encoding.
     * @param player1 instance of ToePlayer.
     * @param player2 instance of ToePlayer.
     * @param gameBoard instance of board.
     */
    public GamePlayTTT(final ToePlayer player1, final ToePlayer player2, final TickTackToe gameBoard) {
        this.player1 = player1;
        this.player2 = player2;
        this.gameBoard = gameBoard;
        scanner = new Scanner(System.in, "UTF-8");
    }

    /**
     * Game itself.
     * It begins the game, alternates the players and verifies status of game.
     * @return status of the ended game.
     */
    public String game() {
        /**PRINT
          initialMessages();
          gameBoard.getTable();
         */
        boolean turnPlayer1 = true;
        while (gameBoard.checkStatusGame().equals("Game continues")) {
            turnFunction(turnPlayer1 ? player1 : player2, gameBoard);
            turnPlayer1 = !turnPlayer1;
        }
        return gameBoard.checkStatusGame();
    }

    /**
     * functions of the player in turn.
     * @param player instance of ToePlayer class.
     * @param gameBoard instance of TickTackToe class.
     */
    private void turnFunction(final ToePlayer player, final TickTackToe gameBoard) {
        /**PRINT
          System.out.println("Turn of ".concat(Character.toString(player.getToken())));
          playerMessages();
         */
        putPosition(player);
        /**PRINT
          gameBoard.getTable();
         */
    }

    /**
     * This function lets to enter only a valid position.
     * @return entered data by user.
     */
    private String enterValidPosition() {
        String enteredData = scanner.nextLine().toLowerCase();
        while (!BLOCK.containsKey(enteredData)) {
            /**PRINT
              System.out.println("not valid position, enter a position again");
             */
            enteredData = scanner.nextLine();
        }
        return enteredData;
    }

    /**
     * This function lets to put the token in the position, only if the position is empty.
     * @param player player.
     */
    private void putPosition(final ToePlayer player) {
        String resPutToken;
        do {
            position = enterValidPosition();
            /**PRINT
              System.out.println("Don't put in an occuped position");
             */
            String[] coordinates = getCoordinates(position);
            resPutToken = player.putToken(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
        } while (resPutToken.equals("position occupied"));
    }

    /**
     * Obtains the two positions from entered data in an array to fill with the token.
     * @param position entered data.
     * @return array of coordinates of two dimensions.
     */
    private static String[] getCoordinates(final String position) {
        String coordinatesString = BLOCK.get(position);
        return coordinatesString.split("-");
    }

    /**PRINT
     * Initial message of game.
     * Name, developed by and others.
     *
    private void initialMessages() {
        System.out.println("TICK-TACK-TOE Game");
        System.out.println("By: demmon_v");
        System.out.println("");
        System.out.println("Player 1: x");
        System.out.println("Player 2: o");
        System.out.println("");
    }
    */

    /**
     * displayed messages for every turn.
     *
    private void playerMessages() {
        System.out.println("Positions: ");
        System.out.println("   up left   ,   up   ,   up right");
        System.out.println(" center left , center , center right");
        System.out.println("  down left  ,  down  ,  down right");
        System.out.println("");
        System.out.println("Enter a position: ");
    }
    */
}

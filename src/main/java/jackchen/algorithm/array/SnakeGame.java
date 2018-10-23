package jackchen.algorithm.array;

import java.util.LinkedList;

/*
 * Design a Snake game that is played on a device with screen size = width x height. Play the game online if you are not familiar with the game.
 * The snake is initially positioned at the top left corner (0,0) with length = 1 unit.
 * You are given a list of food's positions in row-column order. When a snake eats the food, its length and the game's score both increase by 1.
 * Each food appears one by one on the screen. For example, the second food will not appear until the first food was eaten by the snake.
 * When a food does appear on the screen, it is guaranteed that it will not appear on a block occupied by the snake.
 */
public class SnakeGame {

    private int curX = 0;

    private int curY = 0;

    private int width;

    private int height;

    private int index;

    LinkedList<int[]> snake;

    private int[][] food;

    public SnakeGame(int width, int height, int[][] food) {
        this.width = width - 1;
        this.height = height - 1;
        this.index = 0;
        this.food = food;
        this.snake = new LinkedList<int[]>();
        this.snake.offer(new int[]{0, 0});
    }

    public int move(String direction) {

        switch(direction)
        {
            case "U":
                curY++;
                break;

            case "D":
                curY--;
                break;

            case "R":
                curX++;
                break;

            case "L":
                curX--;
                break;

            default:
                return -1;
        }

        if (curX > this.width ||
                curX < 0 ||
                curY > this.height ||
                curY < 0)
        {
            return -1;
        }

        if (food.length != index && food[this.index][0] == curX && food[this.index][1] == curY)
        {
            this.snake.offer(new int [] { curX, curY});
            index++;
        }

        this.snake.poll();

        return this.snake.size();
    }
}

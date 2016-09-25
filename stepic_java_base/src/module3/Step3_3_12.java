package module3;

/**
 * На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y. Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)
 * <p>
 * В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
 * <p>
 * Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
 * <p>
 * public class Robot {
 * <p>
 * public Direction getDirection() {
 * // текущее направление взгляда
 * }
 * <p>
 * public int getX() {
 * // текущая координата X
 * }
 * <p>
 * public int getY() {
 * // текущая координата Y
 * }
 * <p>
 * public void turnLeft() {
 * // повернуться на 90 градусов против часовой стрелки
 * }
 * <p>
 * public void turnRight() {
 * // повернуться на 90 градусов по часовой стрелке
 * }
 * <p>
 * public void stepForward() {
 * // шаг в направлении взгляда
 * // за один шаг робот изменяет одну свою координату на единицу
 * }
 * }
 * Direction, направление взгляда робота,  — это перечисление:
 * public enum Direction {
 * UP,
 * DOWN,
 * LEFT,
 * RIGHT
 * }
 * <p>
 * <p>
 * Как это  выглядит:
 * <p>
 * <p>
 * <p>
 * Пример
 * <p>
 * В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0, robot.getDirection() == Direction.UP
 * <p>
 * Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:
 * <p>
 * robot.turnRight();
 * robot.stepForward();
 * robot.stepForward();
 * robot.stepForward();
 * <p>
 * <p>
 * P.S. Если вам понравилось это задание, то вам может прийтись по душе игра Robocode, в которой надо написать алгоритм управления танком. Алгоритмы, написанные разными людьми, соревнуются между собой.
 * <p>
 * Created by Andrey on 25.09.2016.
 */
public class Step3_3_12 {
    public static void moveRobot(Robot robot, int toX, int toY) {

        int currX = robot.getX();
        int currY = robot.getY();

        int horizontal = toX - currX;
        if (horizontal < 0) {
            while (robot.getDirection() != Direction.LEFT)
                robot.turnLeft();
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        for (int i = 0; i < Math.abs(horizontal); i++) {
            robot.stepForward();
        }

        int vertical = toY - currY;
        if (vertical < 0) {
            while (robot.getDirection() != Direction.DOWN)
                robot.turnLeft();
        } else {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
        }
        for (int i = 0; i < Math.abs(vertical); i++) {
            robot.stepForward();
        }
    }
}

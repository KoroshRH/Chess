import javax.swing.*;

/**
 * A type of piece that extends the Piece class
 *
 * @author Korosh Roohi
 * @version 1.0.0
 * @since 2019.5.13
 */
public class Rook extends Piece {

    public Rook(int myWidth, int myHeight, boolean isIn, char color, int ID) {
        super(myWidth, myHeight, isIn, color, ID);
    }

    @Override
    boolean move(int width, int height, JButton[][] map, boolean move) {
        if ((this.myWidth == width && height != this.myHeight) || (this.myHeight == height && width != this.myWidth)){
            if (!wayKeeper(width, height, map, true)){
                return false;
            }
            if (move) {
                return isMoving(width, height, map);
            } else {
                return true;
            }
        } else {
            if (move) {
                System.out.println("This piece can't move to your selected place!!");
            }
            return false;
        }
    }
}

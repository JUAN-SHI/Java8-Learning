package BridgePattern;

/**
 * Created by shijuan on 2019/3/21.
 */
public abstract class Pen {
    protected  Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract  void draw(String name);
}

package BridgePattern;

/**
 * Created by shijuan on 2019/3/21.
 */
public class MindlePen extends  Pen {
    @Override
    public void draw(String name) {
        String penType = "中号毛笔绘制";
        this.color.bepaint(penType,name);
    }
}

package preoxy;

/**
 * Created by shijuan on 2019/3/27.
 */

/**
 * 真实实体类
 */
public class Actor implements Person {
    private String content;

    public Actor(String content) {
        this.content = content;
    }

    @Override
    public void speak() {
        System.out.println(this.content);
    }
}

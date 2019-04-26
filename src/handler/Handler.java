package handler;

/**
 * Created by shijuan on 2019/3/23.
 */
public  abstract  class Handler {
    //抽象处理者角色
    protected  Handler successor;
    public abstract  void handleRequest();
    /**
     * 取值方法
     */
    public Handler getSuccessor(){
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理聚餐费用的申请
     */
    public abstract  String  handleFeeRequest(String user,double fee);
}

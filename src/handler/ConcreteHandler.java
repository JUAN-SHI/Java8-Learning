package handler;

/**
 * Created by shijuan on 2019/3/23.
 */
public class ConcreteHandler extends  Handler {
    @Override
    public void handleRequest() {
        /**
         * 判断是否有后续的责任对象
         * 如果有，就转发请求给后继的责任对象
         * 如果没有，则处理请求
         */

        if (getSuccessor()!=null){
            System.out.println("放过请求");
            getSuccessor().handleRequest();

        }else {
            System.out.println("处理请求");
        }
    }

    @Override
    public String handleFeeRequest(String user, double fee) {


        String str = "";
        if (fee<500){
            if ("张三".equals(user)){
                str = "成功：项目经理同意【" + user + "】的聚餐费用，金额为" + fee + "元";
            }else {
                //其他人一律不同意
                str = "失败：项目经理不同意【" + user + "】的聚餐费用，金额为" + fee + "元";

            }
        }else {
            if (getSuccessor()!=null){
                return  getSuccessor().handleFeeRequest(user,fee);
            }
        }
        return str;
    }
}

/**
 * Created by Administrator on 2016/7/10.
 */
public class Cart {
    String name;
    String type;
    Cart(String name,String type){
        this.name = name;
        this.type = type;
    }
    String getInfo(){
        return "客户姓名："+name+"\n"+
                "客户类型："+type;
    }
}

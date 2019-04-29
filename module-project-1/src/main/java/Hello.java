/**
 * @author darwindu
 * @date 2019/4/26
 **/
public class Hello {

    public void hi() {
        System.out.println("hi");

        Demo demo = new Demo();
        demo.setId(1);
        demo.setName("hello");
        System.out.println("demo.id:" + demo.getId());

    }
}

package org.jeff.springboot.slayui;

import org.jeff.springboot.bootcore.util.ToolUtil;
import org.junit.Test;

/**
 * @author jeff
 * <p>Date 2018/5/31 11:14</p>
 */
public class CommonTest {

    @Test
    public void generateRandomString(){
        for (int i = 0; i < 5; i++){
            System.out.println(ToolUtil.generateRandomString(6));
        }
    }
}

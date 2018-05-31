package org.jeff.springboot.slayui.config.beetl;

import org.beetl.ext.spring.BeetlGroupUtilConfiguration;
import org.jeff.springboot.bootcore.util.ToolUtil;

public class BeetlConfiguration extends BeetlGroupUtilConfiguration {

    @Override
    protected void initOther() {
        groupTemplate.registerFunctionPackage("tool", new ToolUtil());
    }
}

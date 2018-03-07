package com.lala.common.web.controller.manage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 23:23 2018/2/12
 * @Modified By :
 */
@RequestMapping(value = "/page/")
@Controller
public class PageController {

    private final String notFoundPage = "pages-404";
    private final String serverErrorPage = "pages-500";

    public String[][] pages = {
            {"0", "dashBoard_template"},
            {"1","customerInfo_template"}
    };

    //public String[][] blocks = {//块儿布局, 比如左边菜单和底部顶部
            //{"0", "mainnav-container_block"}
    //};

    @RequestMapping(value = "/fetch/{pageId}", method = RequestMethod.GET)
    public String forword(@PathVariable Integer pageId) {
        for(String [] page : pages){
            if(pageId.intValue()==Integer.valueOf(page[0])){
                return page[1];
            }
        }
        return notFoundPage;
    }

    /*@RequestMapping(value = "/blocks/{blockId}", method = RequestMethod.GET)
    public String getBlocks(@PathVariable Integer blockId) {
        for(String [] block : blocks){
            if(blockId.intValue()==Integer.valueOf(block[0])){
                return block[1];
            }
        }
        return notFoundPage;
    }*/


    @RequestMapping(value = "index")
    public String index() {
        return "/index";
    }
    /*@RequestMapping(value = "dashBoard_template")
    public String indexPage() {
        return "/indexPage";
    }*/
}

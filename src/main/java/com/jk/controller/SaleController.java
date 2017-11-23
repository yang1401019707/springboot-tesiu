package com.jk.controller;

import com.jk.model.Sale;
import com.jk.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 杨 on 2017/11/16.
 */
@Controller
public class SaleController {

    @Autowired
    private SaleService saleService;

    @RequestMapping(value = "/findSaleQuery",method = {RequestMethod.GET,RequestMethod.POST})
    public String findBookQuery(ModelMap modelMap, @RequestParam(value = "page", defaultValue = "0") Integer page,
                                @RequestParam(value = "size", defaultValue = "5") Integer size, Sale sale){
        Page<Sale> datas = saleService.findSaleCriteria(page, size,sale);
        modelMap.addAttribute("datas", datas);
        return "sale/saleList";
    }
}

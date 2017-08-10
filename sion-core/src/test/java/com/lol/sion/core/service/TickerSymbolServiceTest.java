package com.lol.sion.core.service;

import com.lol.sion.core.SionCoreApplication;
import com.lol.sion.core.dao.dataobject.UsaTickerSymbolDO;
import com.lol.sion.core.dao.intf.UsaTickerSymbolManager;
import lombok.Cleanup;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author andyXu(xiaohei) xiaohei@maihaoche.com
 * @Date 2017/8/10
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SionCoreApplication.class)
public class TickerSymbolServiceTest {

    @Autowired
    UsaTickerSymbolManager usaTickerSymbolManager;


    @Test
    public void saveUsaTickerSymbols() throws IOException {
        //读取文件
        @Cleanup InputStream inputStream = TickerSymbolServiceTest.class.getResourceAsStream("/ticker_symbol/usa_ticker_symbol.txt");
        List<String> lines = IOUtils.readLines(inputStream, "GB2312");
        lines.remove(0);
        lines.forEach(symbol -> {
            String [] symbols=symbol.split("\t");
            UsaTickerSymbolDO symbolDO=new UsaTickerSymbolDO();
            symbolDO.setIsDeleted(0);
            symbolDO.setTickerNameCn(symbols[1]);
            symbolDO.setTickerSymbol(symbols[0]);
            usaTickerSymbolManager.insertSelective(symbolDO);

        });
    }

}
